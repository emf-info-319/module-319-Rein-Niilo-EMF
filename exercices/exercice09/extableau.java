package exercices.exercice09;
      
public class extableau {
    public static void main(String[] arg){
        int max = 6,min=1;
        // min c'est le minimum des nombres aléatoirs
        // max c'est le maximum des nombres aléatoirs
        int[] monTableau;
        monTableau = new int[10];{};
        int i = 0;
        int valleurcellule;
        int moyenne = 0;
        for (int j = 0 ;j <= 10 ; j++){
            valleurcellule = min + (int)(Math.random() * ((max | min) ));
            monTableau[i] = valleurcellule;
            moyenne = moyenne + valleurcellule;
        }
        System.out.println("la moyenne est de : "+(moyenne/10));
    } 
}     
      