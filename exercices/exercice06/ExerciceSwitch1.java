package exercice06;

public class ExerciceSwitch1 {
    public static void main(String[] arg){
        int note = 1;
        if (note > 1){
            if (note > 2){
                if (note > 3){
                    if (note > 4){
                        if (note > 5){
                            if (note > 6){
                                System.out.println("if else : Note impossible");
                            } else {
                                System.out.println("if else : Très Bien!!!!!!!!!");
                            }

                        } else {
                            System.out.println("if else : bien!");
                        }

                    } else {
                        System.out.println("if else : suffissant");
                    }

                } else {
                    System.out.println("if else : Insuffisant");
                }
            } else {
                System.out.println("if else : Très insuffisant");
            }

        } else {
            System.out.println("if else : exercice non rendu");
        }








        switch (note){
            case 1 :
                System.out.println("Switch : Travail non rendu");
                break;
            case 2 :
                System.out.println("Switch : Très insuffisant");
                break;
            case 3 :
                System.out.println("Switch : Insuffisant");
                break;
            case 4 :
                System.out.println("Switch : Suffisnat");
                break;
            case 5 :
                System.out.println("Switch : Bien");
                break;
            case 6 :
                System.out.println("Switch : Très BIEN!!!!!");
                break;

        }
    }
    
}
//- `Travail non rendu` si la noteDuModule est 1 
  //  - `Très insuffisant` si la noteDuModule est 2 
    //- `Insuffisant` si la noteDuModule est 3
    //- `Suffisant` si la noteDuModule est 4
    //- `Bien` si la noteDuModule est 5
    //- `Très bien` si la noteDuModule est 6