package exercices.exercice10;

public class tabmeth {
    public static void main(String[] args) {
        //définir la taille du tableau
        int taille = 50;
        int[] tableau = creerTableau(taille);
        remplirAvecAleatoire(tableau);
 
        System.out.println("Le tableau a une taille de " + taille + " cellules.\n");
        System.out.println("Contenu du tableau aléatoire :");
        afficherTableau(tableau);
 
        int min = valeurMin(tableau);
        int max = valeurMax(tableau);
        System.out.println("La valeur min trouvée = " + min);
        System.out.println("La valeur max trouvée = " + max + "\n");
 
        // Remplacer une valeur
        remplacerValeur(tableau, 12, 5);
        System.out.println("Après remplacement de la valeur 12 par la valeur 5 voici le contenu du tableau :");
        afficherTableau(tableau);
        System.out.println();
 
        int somme = sommeTableau(tableau);
        double moyenne = moyenneTableau(tableau);
        System.out.println("La somme des cellules du tableau = " + somme);
        System.out.printf("La moyenne des cellules du tableau = %.2f\n", moyenne);
 
        int valeurRecherchee = 13;
        int premierePos = premiereOccurrence(tableau, valeurRecherchee);
        int dernierePos = derniereOccurrence(tableau, valeurRecherchee);
        System.out.println("La valeur " + valeurRecherchee + " a été trouvée à la 1ère position N°" + premierePos);
        System.out.println("La valeur " + valeurRecherchee + " a été trouvée à la dernière position N°" + dernierePos);
        int taille2=5;
        creerTableau(taille2);
    }
      // 1.
    public static int[] creerTableau(int taille) {
        return new int[taille];
    }
 
    // 2.
    public static int[] remplirAvecValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = valeur;
        }
        return tableau;
    }
    // 3.
    public static int[] remplirAvecAleatoire(int[] tableau) {
        Random rand = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt(21); // Valeurs aléatoires entre 0 et 20
        }
        return tableau;
    }
 
    // 4.
    public static int tailleTableau(int[] tableau) {
        return tableau.length;
    }
 
    // 5.
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tab[" + i + "]=" + tableau[i]);
        }
    }
 
    // 6.
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
 
    // 8.
    public static int compterFrequence(int[] tableau, int valeur) {
        int count = 0;
        for (int val : tableau) {
            if (val == valeur) {
                count++;
            }
        }
        return count;
    }
 
    // 9.
    public static int sommeTableau(int[] tableau) {
        int somme = 0;
        for (int val : tableau) {
            somme += val;
        }
        return somme;
    }
 
    // 10.
    public static double moyenneTableau(int[] tableau) {
        return (double) sommeTableau(tableau) / tableau.length;
    }
 
    // 11.
    public static int[] remplacerValeur(int[] tableau, int valeurRecherchee, int valeurRemplacement) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                tableau[i] = valeurRemplacement;
            }
        }
        return tableau;
    }
 
    // 12.
    public static int premiereOccurrence(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1;
    }
 
    // 13.
    public static int derniereOccurrence(int[] tableau, int valeur) {
        for (int i = tableau.length - 1; i >= 0; i--) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1;
    }
}
