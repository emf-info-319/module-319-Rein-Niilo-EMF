public class ExerciceCondition4 {
    public static void main(String[] arg){
        int Température = 36;
        if (Température< 0){
            if (Température < -10){
                System.out.println("il fait treès froid");

            } else {
                System.out.println("il fait froid");

            }
        } else {
            if (Température > -1){
                if (Température > 25){
                    if (Température > 35){
                        System.out.println("il fait très chaud");

                    } else {
                        System.out.println("il fait chaud");
                    }
                
                } else {
                    System.out.println("il fait normale");
                }
        }
    }
}}



//Si la température est inférieure à -10, vous afficherez "Il fait très froid".
//- Si la température est entre -10 (y compris) et 0 (non compris), vous afficherez "Il fait froid".
//- Si la température est entre 0 (y compris) et 25 (non compris), vous afficherez "Il fait normal".
//- Si la température est entre 25 (y compris) et 35, vous afficherez "Il fait chaud".
//- Si la température est supérieure à 35, vous afficherez "Il fait très chaud".