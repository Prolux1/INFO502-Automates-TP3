import java.util.ArrayList;
import java.util.HashMap;

public class Etat {
    private Etat arrivee;
    private int init_etat;
    private boolean is_initial;
    private boolean is_final;

    public Etat(int init_etat) {
        this(init_etat,false,false);
    }

    public Etat(int init_etat, boolean is_initial) {
        this(init_etat, is_initial, false);
    }

    public Etat(int init_etat, boolean is_initial, boolean is_final) {
        this.init_etat = init_etat;
        this.is_initial = is_initial;
        this.is_final = is_final;
    }

    public boolean getIsInitial() {
        return is_initial;
    }
    public boolean getIsFinal() {
        return is_final;
    }

    public Etat transition(Character lettre, ArrayList<HashMap<Character,Etat>> transitions) {
        return transitions.get(init_etat).get(lettre);
    }

    public boolean hasTransition(Character lettre, ArrayList<HashMap<Character,Etat>> transitions) {
        return transitions.get(init_etat).get(lettre) != null;
    }
}
