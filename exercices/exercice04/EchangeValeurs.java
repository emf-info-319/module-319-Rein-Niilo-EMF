public class EchangeValeurs {
    public static void main(String[] args) {
        int valeur1 = 1;
        int valeur2 = 2;
        System.out.println(" ");
        System.out.println("valeur1 = " + valeur1 );
        System.out.println("valeur2 = " + valeur2 );
        System.out.println(" ");
        int valeur3 = valeur1;

        valeur1 = valeur2;
        valeur2 = valeur3;
        
        System.out.println("...traitement...");
        System.out.println(" ");
        System.out.println("valeur1 = " + valeur1 );
        System.out.println("valeur2 = " + valeur2 );
        System.out.println(" ");

    }
    
}
