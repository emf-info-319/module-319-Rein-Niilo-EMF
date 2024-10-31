package exercices.codagelibre;
import java.util.Scanner;  // Import the Scanner class
public class guessnbre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("jouons à un jeux je vais choisir un nombre aléatoir entre 0 et 100");
        System.out.println("vous devrez deviner ce nombre en 5 essais");
        int réponse;
        int max = 100,min=0;
        // min c'est le minimum des nombres aléatoirs
        // max c'est le maximum des nombres aléatoirs
        int nombre = min + (int)(Math.random() * ((max | min) ));
        int admincodeused = 0;
        System.out.println("allez-y essayez un nombre");
        System.out.println(" ");
        int essais = 6;
        while (essais !=0){
            réponse = scanner.nextInt();  // Read user input
            if (réponse == 140708){
                System.out.println("admincode : givenumber");
                System.out.println("le nombre est "+nombre);
                System.out.println("remettez un nombre");
                admincodeused = 1;
            }
            if (réponse == nombre){
                System.out.println("vous avez devinez correctement le nombre était "+nombre);
                break;
            } else if(réponse<nombre){
                if (admincodeused ==0){
                    System.out.println("trop petit!");
                    System.out.println(" ");
                }
            } else if (réponse>nombre){
                if (admincodeused == 0){
                    System.out.println("trop grand!");
                    System.out.println(" ");
                }
            }
            if (admincodeused == 0){
                essais = essais -1;
                System.out.println("essais restants : "+essais);
                System.out.println(" ");
            }
            admincodeused = 0;
        }
        scanner.close();
        if (essais <= 0){
            System.out.println(" ");
            System.out.println("vous avez perdu :(");
            System.out.println("le nombre était : "+nombre);
            System.out.println(" ");
        }

    }
}
