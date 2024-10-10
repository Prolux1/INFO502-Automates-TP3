import java.util.ArrayList;
import java.util.HashMap;

public class Automate {
    private Etat etat_initial;
    private ArrayList<Etat> etats;
    private ArrayList<HashMap<Etat, char[]>> transitions;

    public Automate(ArrayList<Etat> etats, ArrayList<HashMap<Etat, char[]>> transitions) {
        this.etats = etats;
        this.transitions = transitions;
        initEtatInitial();
    }

    public Automate(String regex, String texte) {
        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < texte.length(); i++) {
            char c = texte.charAt(i);
            if (!alphabet.contains(c)) {
                alphabet.add(c);
            }
        }
        char[] alphabetArray = new char[alphabet.size()];
        for (int i = 0; i < alphabet.size(); i++) {
            alphabetArray[i] = alphabet.get(i);
        }

        // Ajout des états
        ArrayList<Etat> etats = new ArrayList<>();
        if (!regex.isEmpty()) {
            etats.add(new Etat(0, false, true));

            int i = 1;
            while (i < regex.length()) {
                etats.add(new Etat(i));
                i++;
            }
            etats.add(new Etat(i, true));
        } else {
            etats.add(new Etat(0, true, true));
        }

        // Ajout des transitions
        ArrayList<HashMap<Etat, char[]>> transitions = new ArrayList<>();
        // Ajout de la transition de tout l'alphabet sur l'état initial
        for (int j = 0; j < regex.length(); j++) {
            HashMap<Etat, char[]> tj = new HashMap<>();
            if (j == 0) {
                tj.put(etats.get(j), alphabetArray);
            }
            tj.put(etats.get(j+1), new char[]{regex.charAt(j)});
            transitions.add(tj);
        }
        // Ajout de la transition de tout l'alphabet sur l'état final
        HashMap<Etat, char[]> tLast = new HashMap<>();
        tLast.put(etats.get(regex.length()), alphabetArray);
        transitions.add(tLast);

        this.etats = etats;
        this.transitions = transitions;
        initEtatInitial();
    }

    public void initEtatInitial() {
        boolean trouvee = false;
        int i = 0;
        while (!trouvee && i < etats.size()) {
            Etat etat = etats.get(i);
            if (etat.getIsInitial()) {
                etat_initial = etat;
                trouvee = true;
            }
            i++;
        }
    }

    public boolean reconnait(String mot) {
        return reconnaitRecursif(mot, etat_initial);
    }

    private boolean reconnaitRecursif(String mot, Etat etat) {
        if (mot.isEmpty() && etat.getIsFinal()) {
            return true;
        } else if (mot.isEmpty()) {
            return false;
        } else {
            char c = mot.charAt(0);
            if (!etat.hasTransition(c, transitions)) {
                return false;
            } else {
                String sousMot = mot.substring(1);
                ArrayList<Etat> etatsTransitions = etat.transition(c, transitions);
                boolean trouve = false;
                int i = 0;
                while (!trouve && i < etatsTransitions.size()) {
                    Etat etati = etatsTransitions.get(i);
                    trouve = reconnaitRecursif(sousMot, etati);
                    i++;
                }
                return trouve;
            }
        }
    }
}
