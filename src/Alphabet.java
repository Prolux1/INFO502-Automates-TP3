import java.util.ArrayList;
import java.util.Arrays;

public class Alphabet {
    ArrayList<String> lettres = new ArrayList<>();

    public Alphabet(String... lettres) {
        this.lettres.addAll(Arrays.asList(lettres));
    }

    public ArrayList<String> getLettres() {
        return this.lettres;
    }
}
