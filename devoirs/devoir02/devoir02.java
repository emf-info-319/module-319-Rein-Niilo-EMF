package devoirs.devoir02;
public class devoir02 {
    public static void main(String[] arg){
        int CAPACITE_RESERVOIR_A = 3;
        int CAPACITE_RESERVOIR_B = 5;
        int reservoirA = 0;
        int reservoirB = 0;
        int max = 8,min=0;
        // min c'est le minimum des nombres aléatoirs
        // max c'est le maximum des nombres aléatoirs
        int remplissage = min + (int)(Math.random() * ((max | min) ));
        System.out.println("il y a " +remplissage +"L à remplir");
        System.out.println("remplissage du réservoir A");
        System.out.println("Le réservoir A : "+ reservoirA +" , le réservoir B : "+ reservoirB);
        while ((reservoirA < CAPACITE_RESERVOIR_A) & (remplissage > 0)) {
            reservoirA++;
            remplissage--;
            System.out.println("Le réservoir A : "+ reservoirA +" , le réservoir B : "+ reservoirB);
        }
        if (remplissage != 0){
            System.out.println("remplissage du réservoir B");
            while ((reservoirB < CAPACITE_RESERVOIR_B) & (remplissage > 0)){
            reservoirB++;
            remplissage--;
            System.out.println("Le réservoir A : "+ reservoirA +" , le réservoir B : "+ reservoirB);
            }
        }
        System.out.println("remplissage terminé");
    }
}