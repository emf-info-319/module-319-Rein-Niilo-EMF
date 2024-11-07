package exercices.exercice11;

public class exerciceinversiontab {
    public static int min = 1;
    public static int max = 100;
    public static void main(String[] args) {
        int[] tabinitial;
        tabinitial = new int[4];
        for (int i = 0;i < 4;i++){
            tabinitial[i] = min + (int)(Math.random() * (max - min + 1));
        }
        System.out.println("tableau initial");
        System.out.println("");
        System.out.println("| index |0  |1  |2  |3  |");
        System.out.println("|_______|___|___|___|___|");
        System.out.println("|valeur |"+tabinitial[0]+" |"+tabinitial[1]+" |"+tabinitial[2]+" |"+tabinitial[3]+" |");
        inversetableaux(tabinitial);
    }
    public static void inversetableaux(int tableau[]){
        int[] tabinverse;
        tabinverse = new int[tableau.length];
        int j =0;
        for (int i = tableau.length-1;i>=0;i--){
            tabinverse[j] = tableau[i];
            j++;
        }
        System.out.println("tableau inversé");
        System.out.println("| index |0  |1  |2  |3  |");
        System.out.println("|_______|___|___|___|___|");
        System.out.println("|valeur |"+tabinverse[0]+" |"+tabinverse[1]+" |"+tabinverse[2]+" |"+tabinverse[3]+" |");
    }
}
