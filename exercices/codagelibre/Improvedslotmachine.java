package exercices.codagelibre;

public class Improvedslotmachine {
    public static void main(String[] arg){
        while (true) {
            int i = 0;
            // i c'est la variable aléatoire
            int max = 9,min=1;
            // min c'est le minimum des nombres aléatoirs
            // max c'est le maximum des nombres aléatoirs
            i = min + (int)(Math.random() * ((max | min) ));
            int rand1 = i;
            i = min + (int)(Math.random() * ((max | min) ));
            int rand2 = i;
            i = min + (int)(Math.random() * ((max | min) ));
            int rand3 =i;
            System.out.println(rand1 + " " + rand2 + " " + rand3);
            if (rand1 == rand2) {
                if (rand2 == rand3) {
                    if (rand1 == 7){
                        System.out.println("holy moly i just won the jackpot!!!!!");
                    } else{
                        System.out.println("oh my god i actually won!!!");
                    }
                    break;
                }

            } else {
                System.err.println("aw dangit!");
            
            }
        }
    }
}
