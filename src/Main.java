import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Question 3

        ArrayList<Etat> etats = new ArrayList<>();
        etats.add(new Etat(0, true));
        etats.add(new Etat(1));
        etats.add(new Etat(2, false, true));

        ArrayList<HashMap<Character,Etat>> transitions = new ArrayList<>();

        HashMap<Character, Etat> t1 = new HashMap<>();
        t1.put('b', etats.get(1));
        transitions.add(t1);

        HashMap<Character, Etat> t2 = new HashMap<>();
        t2.put('a', etats.get(1));
        t2.put('b', etats.get(2));
        transitions.add(t2);

        HashMap<Character, Etat> t3 = new HashMap<>();
        t3.put('b', etats.get(2));
        t3.put('c', etats.get(1));
        transitions.add(t3);

        AutomateDet aut = new AutomateDet(etats, transitions);
        System.out.println("mot \"bbb\": " + aut.reconnait("bbb"));
        System.out.println("mot \"bab\": " + aut.reconnait("bab"));
        System.out.println("mot \"babcb\": " + aut.reconnait("babcb"));
        System.out.println("mot \"ba\": " + aut.reconnait("ba"));
        System.out.println("mot \"baa\": " + aut.reconnait("baa"));
    }
}