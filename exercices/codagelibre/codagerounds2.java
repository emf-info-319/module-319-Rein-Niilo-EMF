package exercices.codagelibre;

public class codagerounds2 {
    public static final String[] eleves = {"Jean", "Paul", "Matthieu", "Jacques", "Louis", "Emile", "Eric", "Julien", "Yvan", "Philippe"};
    public static final int nombreeleves = 5;
    public static void main(String[] args) {
    String printline = "";
    String[] tableautemp;
        tableautemp = creergroupe(nombreeleves); // Creating a group of 3 students
        printline = "le groupe est : ";
        for (int j = 0; j < tableautemp.length; j++) {
            printline += tableautemp[j] + ", "; // Use j instead of i
        }
        System.out.println(printline);
    }

    public static String choirirEleve() {
        return eleves[(int) (Math.random() * eleves.length)];
    }

    public static boolean controledoublons(String tableau[], String nom) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] != null && tableau[i].equals(nom)) { // Check for null to avoid NullPointerException
                return true;
            }
        }
        return false;
    }

    public static String[] creergroupe(int nombreeleves) {
        int i = 0;
        String eleve;
        String[] groupe = new String[nombreeleves];

        while (i != nombreeleves) { // Fix loop condition
            eleve = choirirEleve();
            if (!controledoublons(groupe, eleve)) { // Add student if not already in the group
                groupe[i] = eleve;
                i++;
            }
        }
        return groupe;
    }
}
