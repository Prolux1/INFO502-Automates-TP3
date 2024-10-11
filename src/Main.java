import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public final static String SEP = "==========================================================================================";
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
    }

    private static void question1() {
        System.out.println(SEP);
        System.out.println("Tests question 1 :");

        try{
            System.out.println("Début de la construction de l'automate de la question 1, exercice 2 du Td3 :");

            ArrayList<Etat> etatsQ1 = new ArrayList<>();
            etatsQ1.add(new Etat(0, false, true));
            etatsQ1.add(new Etat(1, true));
            etatsQ1.add(new Etat(2, true));
            etatsQ1.add(new Etat(3));

            ArrayList<HashMap<Etat, char[]>> transitionsQ1 = new ArrayList<>();

            HashMap<Etat, char[]> t1Q1 = new HashMap<>();
            t1Q1.put(etatsQ1.get(1), new char[]{'a'});
            t1Q1.put(etatsQ1.get(2), new char[]{'b'});
            transitionsQ1.add(t1Q1);

            HashMap<Etat, char[]> t2Q1 = new HashMap<>();
            t2Q1.put(etatsQ1.get(3), new char[]{'a', 'b'});
            transitionsQ1.add(t2Q1);

            HashMap<Etat, char[]> t3Q1 = new HashMap<>();
            t3Q1.put(etatsQ1.get(3), new char[]{'a', 'b'});
            transitionsQ1.add(t3Q1);

            HashMap<Etat, char[]> t4Q1 = new HashMap<>();
            t4Q1.put(etatsQ1.get(3), new char[]{'a', 'b'});
            transitionsQ1.add(t4Q1);

            Automate td3Exercice2Q1 = new Automate(etatsQ1, transitionsQ1);
            System.out.println("Automate créé avec succès ✅");

            // ====================================================================================

            System.out.println("Début de la construction de l'automate de la question 2, exercice 2 du Td3 :");

            ArrayList<Etat> etatsQ2 = new ArrayList<>();
            etatsQ2.add(new Etat(0, false, true));
            etatsQ2.add(new Etat(1));
            etatsQ2.add(new Etat(2, true));
            etatsQ2.add(new Etat(3));
            etatsQ2.add(new Etat(4));
            etatsQ2.add(new Etat(5));
            etatsQ2.add(new Etat(6));
            etatsQ2.add(new Etat(8));

            ArrayList<HashMap<Etat, char[]>> transitionsQ2 = new ArrayList<>();

            HashMap<Etat, char[]> t1Q2 = new HashMap<>();
            t1Q2.put(etatsQ2.get(1), new char[]{'a'});
            t1Q2.put(etatsQ2.get(5), new char[]{'b'});
            transitionsQ2.add(t1Q2);

            HashMap<Etat, char[]> t2Q2 = new HashMap<>();
            t2Q2.put(etatsQ2.get(6), new char[]{'a'});
            t2Q2.put(etatsQ2.get(2), new char[]{'b'});
            transitionsQ2.add(t2Q2);

            HashMap<Etat, char[]> t3Q2 = new HashMap<>();
            t3Q2.put(etatsQ2.get(0), new char[]{'a'});
            t3Q2.put(etatsQ2.get(2), new char[]{'b'});
            transitionsQ2.add(t3Q2);

            HashMap<Etat, char[]> t4Q2 = new HashMap<>();
            t4Q2.put(etatsQ2.get(2), new char[]{'a'});
            t4Q2.put(etatsQ2.get(6), new char[]{'b'});
            transitionsQ2.add(t4Q2);

            HashMap<Etat, char[]> t5Q2 = new HashMap<>();
            t5Q2.put(etatsQ2.get(7), new char[]{'a'});
            t5Q2.put(etatsQ2.get(5), new char[]{'b'});
            transitionsQ2.add(t5Q2);

            HashMap<Etat, char[]> t6Q2 = new HashMap<>();
            t6Q2.put(etatsQ2.get(2), new char[]{'a'});
            t6Q2.put(etatsQ2.get(6), new char[]{'b'});
            transitionsQ2.add(t6Q2);

            HashMap<Etat, char[]> t7Q2 = new HashMap<>();
            t7Q2.put(etatsQ2.get(6), new char[]{'a'});
            t7Q2.put(etatsQ2.get(4), new char[]{'b'});
            transitionsQ2.add(t7Q2);

            HashMap<Etat, char[]> t8Q2 = new HashMap<>();
            t8Q2.put(etatsQ2.get(6), new char[]{'a'});
            t8Q2.put(etatsQ2.get(2), new char[]{'b'});
            transitionsQ2.add(t8Q2);

            Automate td3Exercice2Q2 = new Automate(etatsQ2, transitionsQ2);
            System.out.println("Automate créé avec succès ✅");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Une erreur s'est produite lors de la construction de cet automate ❌");
        }
    }

    private static void question2() {
        System.out.println(SEP);
        System.out.println("Tests question 2 :");
        System.out.println("Fonction implémentée avec succès ✅");
    }

    private static void question3() {
        System.out.println(SEP);
        System.out.println("Tests question 3 :");

        try{
            System.out.println("Début de la construction de l'automate \"Figure 1 – Automate 1\" du TP3 :");
            ArrayList<Etat> etats = new ArrayList<>();
            etats.add(new Etat(0, false, true));
            etats.add(new Etat(1));
            etats.add(new Etat(2, true));

            ArrayList<HashMap<Etat, char[]>> transitions = new ArrayList<>();

            HashMap<Etat, char[]> t1 = new HashMap<>();
            t1.put(etats.get(1), new char[]{'b'});
            transitions.add(t1);

            HashMap<Etat, char[]> t2 = new HashMap<>();
            t2.put(etats.get(1), new char[]{'a'});
            t2.put(etats.get(2), new char[]{'b'});
            transitions.add(t2);

            HashMap<Etat, char[]> t3 = new HashMap<>();
            t3.put(etats.get(2), new char[]{'b'});
            t3.put(etats.get(1), new char[]{'c'});
            transitions.add(t3);

            Automate automate1 = new Automate(etats, transitions);

            System.out.println("Automate créé avec succès ✅");

            System.out.println("Reconnaissance du mot \"bbb\" sur cet automate :");
            if (automate1.reconnait("bbb")) {
                System.out.println("Reconnaissance effectuée avec succès ✅");
            } else {
                System.out.println("La reconnaissance a échoué ❌");
            }

            System.out.println("Reconnaissance du mot \"bab\" sur cet automate :");
            if (automate1.reconnait("bab")) {
                System.out.println("Reconnaissance effectuée avec succès ✅");
            } else {
                System.out.println("La reconnaissance a échoué ❌");
            }

            System.out.println("Reconnaissance du mot \"babcb\" sur cet automate :");
            if (automate1.reconnait("babcb")) {
                System.out.println("Reconnaissance effectuée avec succès ✅");
            } else {
                System.out.println("La reconnaissance a échoué ❌");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Une erreur s'est produite ❌");
        }
    }

    private static void question4() {
        System.out.println(SEP);
        System.out.println("Tests question 4 :");

        try {
            System.out.println("Début de la construction de l'\"Automate des états des fantômes\" du TP3 :");

            ArrayList<Etat> etats = new ArrayList<>();
            etats.add(new Etat(0, false, true));
            etats.add(new Etat(1));
            etats.add(new Etat(2));
            etats.add(new Etat(3));

            ArrayList<HashMap<Etat, char[]>> transitions = new ArrayList<>();

            HashMap<Etat, char[]> t1 = new HashMap<>();
            t1.put(etats.get(1), new char[]{'a'});
            t1.put(etats.get(2), new char[]{'b'});
            transitions.add(t1);

            HashMap<Etat, char[]> t2 = new HashMap<>();
            t2.put(etats.get(0), new char[]{'c'});
            t2.put(etats.get(2), new char[]{'b'});
            transitions.add(t2);

            HashMap<Etat, char[]> t3 = new HashMap<>();
            t3.put(etats.get(0), new char[]{'d'});
            t3.put(etats.get(3), new char[]{'e'});
            transitions.add(t3);

            HashMap<Etat, char[]> t4 = new HashMap<>();
            t4.put(etats.get(0), new char[]{'f'});
            transitions.add(t4);

            Automate automatePacMan = new Automate(etats, transitions);

            System.out.println("⚠️Le nom des états et transitions ont été simplifiés comme suis :");
            System.out.println("⚠️Les états :");
            System.out.println("⚠️\"Parcours le labryinthe\" ==> 0");
            System.out.println("⚠️\"Poursuit Pac-Man\" ==> 1");
            System.out.println("⚠️\"Fuit Pac-Man\" ==> 2");
            System.out.println("⚠️\"Retourne à la base\" ==> 3");

            System.out.println("⚠️Les transitions :");
            System.out.println("⚠️\"a vu Pac-Man\" ==> 'a'");
            System.out.println("⚠️\"Pac-Man mange une super pac-gomme\" ==> 'b'");
            System.out.println("⚠️\"a perdu Pac-Man\" ==> 'c'");
            System.out.println("⚠️\"Super pac-gomme expire\" ==> 'd'");
            System.out.println("⚠️\"a été mangé par Pac-Man\" ==> 'e'");
            System.out.println("⚠️\"atteint la base\" ==> 'f'");

            System.out.println("Automate créé avec succès ✅");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Une erreur s'est produite ❌");
        }
    }

    private static void question5() {
        System.out.println(SEP);
        System.out.println("Tests question 5 :");

        try {
            System.out.println("Début de la construction de l'automate de la question 7, exercice 1 du TD4 :");

            ArrayList<Etat> etats = new ArrayList<>();
            etats.add(new Etat(0, true, true));
            etats.add(new Etat(1));

            ArrayList<HashMap<Etat, char[]>> transitions = new ArrayList<>();

            HashMap<Etat, char[]> t1 = new HashMap<>();
            t1.put(etats.get(0), new char[]{'a'});
            t1.put(etats.get(1), new char[]{'a'});
            transitions.add(t1);

            HashMap<Etat, char[]> t2 = new HashMap<>();
            t2.put(etats.get(0), new char[]{'b'});
            t2.put(etats.get(1), new char[]{'b'});
            transitions.add(t2);

            Automate td4Exercice1Q7 = new Automate(etats, transitions);

            System.out.println("Automate créé avec succès ✅");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Une erreur s'est produite ❌");
        }
    }

    private static void question6() {
        System.out.println(SEP);
        System.out.println("Tests question 6 :");
        System.out.println("Fonction implémentée avec succès ✅");
    }

    private static void question7() {
        System.out.println(SEP);
        System.out.println("Tests question 7 :");

        try {
            System.out.println("Début de la construction de l'automate \"Figure 3 – Automate 2\" du TP3 :");

            ArrayList<Etat> etats = new ArrayList<>();
            etats.add(new Etat(0, false, true));
            etats.add(new Etat(1));
            etats.add(new Etat(2, true));

            ArrayList<HashMap<Etat, char[]>> transitions = new ArrayList<>();

            HashMap<Etat, char[]> t1 = new HashMap<>();
            t1.put(etats.get(1), new char[]{'b'});
            transitions.add(t1);

            HashMap<Etat, char[]> t2 = new HashMap<>();
            t2.put(etats.get(1), new char[]{'a'});
            t2.put(etats.get(2), new char[]{'a'});
            transitions.add(t2);

            HashMap<Etat, char[]> t3 = new HashMap<>();
            t3.put(etats.get(2), new char[]{'b'});
            t3.put(etats.get(1), new char[]{'b'});
            transitions.add(t3);

            Automate automate2 = new Automate(etats, transitions);
            System.out.println("Automate créé avec succès ✅");

            System.out.println("Reconnaissance du mot \"ba\" sur cet automate :");
            if (automate2.reconnait("ba")) {
                System.out.println("Reconnaissance effectuée avec succès ✅");
            } else {
                System.out.println("La reconnaissance a échoué ❌");
            }

            System.out.println("Reconnaissance du mot \"babba\" sur cet automate :");
            if (automate2.reconnait("babba")) {
                System.out.println("Reconnaissance effectuée avec succès ✅");
            } else {
                System.out.println("La reconnaissance a échoué ❌");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Une erreur s'est produite ❌");
        }
    }

    private static void question8() {
        System.out.println(SEP);
        System.out.println("Tests question 8 :");

        try {
            String regex = "aba";
            String[] textes = {
                    "fvhuehvjhbsudihdhiqobvuaeivabaiqz",
                    "",
                    "abc",
                    "bbbbbb",
                    "aaa",
                    "a",
                    "aaaaa",
                    "aba"
            };

            for (String texte: textes) {
                System.out.println("Recherche du mot \"" + regex + "\" dans la chaîne \"" + texte + "\" :");
                if (recherche(regex, texte)) {
                    System.out.println("Le mot a bien été reconnu ✅");
                } else {
                    System.out.println("Le mot n'a pas été reconnu ❌");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Une erreur s'est produite ❌");
        }
    }

    private static boolean recherche(String regex, String texte) {
        Automate figure4 = new Automate(regex, texte);
        return figure4.reconnait(texte);
    }

}
