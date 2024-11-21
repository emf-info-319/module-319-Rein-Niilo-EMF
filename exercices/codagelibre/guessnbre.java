package exercices.codagelibre;

import java.util.Scanner; // Import the Scanner class

public class guessnbre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("jouons à un jeux je vais choisir un nombre aléatoir entre 0 et 100");
        System.out.println("vous devrez deviner ce nombre en 5 essais");
        int réponse;
        int max = 100, min = 0;
        // min c'est le minimum des nombres aléatoirs
        // max c'est le maximum des nombres aléatoirs
        int nombre = min + (int) (Math.random() * ((max | min)));
        int admincodeused = 0;
        System.out.println("quel difficultés voudrez-vous?");
        System.out.println("1 : facile");
        System.out.println("2 : medium");
        System.out.println("3 : difficile");
        System.out.println("4 : impossible");
        System.out.println("mettez le nombre de la difficulté souhaité");
        int essais;
        réponse = scanner.nextInt(); // Read user input
        switch (réponse) {
            case 1:
                essais = 10;
                break;

            case 2:
                essais = 6;
                break;

            case 3:
                essais = 3;
                break;

            case 4:
                essais = 2;
                break;
            default:
                essais = 1;
                System.out.println("t'aurais du mettre un des nombres!");
                break;
        }

        System.out.println("allez-y essayez un nombre");
        System.out.println(" ");
        while (essais != 0) {
            réponse = scanner.nextInt(); // Read user input
            if (réponse == 140708) {
                System.out.println("admincode : givenumber");
                System.out.println("le nombre est " + nombre);
                System.out.println("remettez un nombre");
                admincodeused = 1;
            }
            if (réponse == nombre) {
                System.out.println("vous avez deviné correctement le nombre était " + nombre);
                break;
            } else if (réponse < nombre) {
                if (admincodeused == 0) {
                    System.out.println("trop petit!");
                    System.out.println(" ");
                }
            } else if (réponse > nombre) {
                if (admincodeused == 0) {
                    System.out.println("trop grand!");
                    System.out.println(" ");
                }
            }
            if (admincodeused == 0) {
                essais = essais - 1;
                System.out.println("essais restants : " + essais);
                System.out.println(" ");
            }
            admincodeused = 0;
        }
        scanner.close();
        if (essais <= 0) {
            System.out.println(" ");
            System.out.println("vous avez perdu :(");
            System.out.println("le nombre était : " + nombre);
            System.out.println(" ");
        }

    }
}
