public class pourRP {
    // Constantes pour les valeurs MIN et MAX
    private static final int MIN = 5;
    private static final int MAX = 20;

    public static void main(String[] args) {
        // Choisir deux nombres
        int nombre1 = choisirUnNombre();
        int nombre2 = choisirUnNombre();

        // Afficher les deux nombres choisis
        System.out.println("Les chiffres sont : " + nombre1 + " " + nombre2);

        // Construire et afficher le tableau de multiplication
        String[] montableau = creationTab(nombre1, nombre2);
        for (int i = 0; i < montableau.length; i++) {
            System.out.println(montableau[i]);
        }
    }

    // Méthode pour choisir un nombre aléatoire entre MIN et MAX
    public static int choisirUnNombre() {
        return MIN + (int)(Math.random() * (MAX - MIN + 1));
    }

    // Méthode pour créer un tableau contenant la table de multiplication
    public static String[] creationTab(int nombre1, int nombre2) {
        int taille = nombre1 * nombre2;
        String[] montableau = new String[taille];
        int index = 0;

        for (int i = 1; i <= nombre1; i++) {
            for (int j = 1; j <= nombre2; j++) {
                int réponse = i * j;
                String cellule = i + " * " + j + " = " + réponse;
                montableau[index] = cellule;
                index++;
            }
        }
        return montableau;
    }
}