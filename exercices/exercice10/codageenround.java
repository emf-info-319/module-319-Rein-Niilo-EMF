package exercices.exercice10;

public class codageenround {
    public static double PI = 3.14;

    public static void main(String[] args) {
        int[] rayons;
        rayons = new int[10];
        int min = 1;
        int max = 10;
        for (int i = 0; i < rayons.length; i++) {
            rayons[i] = genereNombre(min, max);
        }
        for (int i = rayons.length; i > rayons.length; i--) {
            System.out.println(rayons[i]);
            if (i >= 50) {
                System.out.println("aire" + PI * (rayons[i] * rayons[i]));
            } else {
                System.out.println("Pereimètre" + PI * 2 * rayons[i]);
            }
        }
        int réponse;
        System.out.println("le nombre est"+réponse);
    }

    public static int genereNombre(int min, int max) {
        int nombreAleatoire = min + (int) (Math.random() * ((max | min)));
        return nombreAleatoire;
    }
}
