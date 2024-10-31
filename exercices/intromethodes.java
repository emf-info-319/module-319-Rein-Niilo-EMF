package exercices;
import java.util.Scanner;  // Import the Scanner class
public class intromethodes {
    public static void main(String[] arg){
        début();
        int nbramettre = 1;
        int nbr1 = demandenombre(nbramettre);
        nbramettre = 15;
        int nbr2 = demandenombre(nbramettre);
        nbramettre = 20;
        int nbr3 = demandenombre(nbramettre);
        int somme = somme(nbr1,nbr2,nbr3);
        System.out.println("la somme est "+somme);
        fin();
    
    }
    public static int demandenombre(int nbramettre){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("mettez un nombre : > "+ nbramettre);
        int reponse = scanner.nextInt();  // Read user input
        System.out.println("merci j'enregistre "+reponse+"!");
        return reponse;
    }
    public static void fin(){
        System.out.println("programme terminé");
    }
    public static void début(){
        System.out.println("Bonjour et bienvenu sur ce premier programme ");
        System.out.println("On va voir les méthodes dans ce cour");
    }
    public static int somme(int nbr1,int nbr2,int nbr3){
        int somme = nbr1+nbr2+nbr3;
        return somme;
    }
}
