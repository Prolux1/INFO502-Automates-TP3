import java.util.ArrayList;
import java.util.HashMap;

public class Etat {
    private int init_etat;
    private boolean is_initial;
    private boolean is_final;

    public Etat(int init_etat) {
        this(init_etat,false,false);
    }

    public Etat(int init_etat, boolean is_final) {
        this(init_etat, is_final, false);
    }

    public Etat(int init_etat, boolean is_final, boolean is_initial) {
        this.init_etat = init_etat;
        this.is_final = is_final;
        this.is_initial = is_initial;

    }

    @Override
    public String toString() {
        return "Id : " + init_etat + ", etat initial : " + is_initial + ", etat final : " + is_final;
    }

    public boolean getIsInitial() {
        return is_initial;
    }
    public boolean getIsFinal() {
        return is_final;
    }

    public ArrayList<Etat> transition(char lettre, ArrayList<HashMap<Etat, char[]>> transitions) {
        ArrayList<Etat> res = new ArrayList<>();
        for (Etat etat: transitions.get(init_etat).keySet()) {
            boolean trouve = false;
            int i = 0;
            char[] charactersEtat = transitions.get(init_etat).get(etat);
            while (!trouve && i < charactersEtat.length) {
                if (charactersEtat[i] == lettre) {
                    trouve = true;
                    res.add(etat);
                }
                i++;
            }
        }
        return res;
    }

    public boolean hasTransition(char lettre, ArrayList<HashMap<Etat, char[]>> transitions) {
        return !transition(lettre, transitions).isEmpty();
    }
}
