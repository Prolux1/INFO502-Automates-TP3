import java.util.ArrayList;
import java.util.HashMap;

public class AutomateDet {
    private Etat etat_initial;
    private ArrayList<Etat> etats;
    private ArrayList<HashMap<Character,Etat>> transitions;

    public AutomateDet(ArrayList<Etat> etats, ArrayList<HashMap<Character,Etat>> transitions) {
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
        }
    }

    public boolean reconnait(String mot) {
        Etat etat = etat_initial;
        for (int i = 0; i < mot.length(); i++) {
            Character c = mot.charAt(i);
            if(!etat.hasTransition(c, transitions)){
                return false;
            } else {
                etat = etat.transition(c, transitions);
            }
        }
        return etat.getIsFinal();
    }
}
