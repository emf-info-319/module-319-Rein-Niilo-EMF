package devoirs.devoir06;

public class devoir6 {
    public final static int TAILLE_TABLEAU =20;
    public final static int VALEUR_MAX =50;
    public final static int VALEUR_MIN =0;
    public final static int VALEUR_RECHERCHEE=7;
    public static void main(String[] args) {
        int randomAnswer=(int) ( Math.random() * (VALEUR_MIN|VALEUR_MAX));
        int[] tableau=remplirAvecAleatoire(TAILLE_TABLEAU, VALEUR_MIN, VALEUR_MAX);
        afficherTableau(tableau);
        int min = valeurMin(tableau);
        int max = valeurMax(tableau);
        System.out.println("La plus petite valeur trouvée est : " + min);
        System.out.println("La plus grande valeur trouvée est : " + max);
        trouverSept(tableau);
        boolean trouve = false;
 
        // Parcourir le tableau
        for (int nombre : tableau) {
            if (nombre == 7) {
                trouve = true;
                break; // On arrête la boucle dès qu'on trouve un 7
            }
        }
 
        // Si le nombre 7 n'a pas été trouvé, on affiche un message
        if (!trouve) {
            System.out.println("Le nombre [7] est à la position ["+randomAnswer+"] du tableau");
        }
    }
    public static int[] remplirAvecAleatoire(int taille, int min, int max) {
        taille=20;
        min=0;
        max=50;
        int[] tab=new int[taille];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) ( Math.random() * (min|max)); // Valeurs aléatoires entre 0 et 20
        }
        return tab;
    }
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tableau[" + i + "] = [" + tableau[i]+"]");
        }
    }
    public static int valeurMin(int[] tableau) {
        int min = tableau[0];
        for (int val : tableau) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }
 
    // 7.
    public static int valeurMax(int[] tableau) {
        int max = tableau[0];
        for (int val : tableau) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
    public static void trouverSept(int[] tableau){
        int nombreRechercher=7;
        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i]==nombreRechercher){
                System.out.println("Le nombre [7] est à la position ["+i+"] du tableau");
            }
           
        }
    }
 
}
