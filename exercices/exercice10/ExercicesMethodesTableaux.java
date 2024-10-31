package exercices.exercice10;

public class ExercicesMethodesTableaux {
    public static void main(String[] args) {
        int max = 100,min=0;
        // min c'est le minimum des nombres aléatoirs
        // max c'est le maximum des nombres aléatoirs
        // = min + (int)(Math.random() * ((max | min) ));


        int taille = 5;
        int tab1[] =tab1(5);
        for (int i = 0;i>=5;i++){
            tab1[i] = min + (int)(Math.random() * ((max | min) ));
            System.out.println(tab1[i]);
        }
    }
    public static int[] tab1(int taille){
        int[] tableau;
        tableau= new int[taille];
        return tableau;
    }
    
    
}
