package exercice06;

public class ExerciceSwitch2 {
    public static void main(String[] arg){
        int age = 11;
        if (age > 6){
            if (age > 7){
                if (age > 9){
                    if (age > 11){
                        System.out.println("if else : Inconnu");
                    } else {
                        System.out.println("if else : Minime");
                    }
                } else {
                    System.out.println("if else : Pupille");
                }
            } else{
                System.err.println("if else : Poussin");
            }
        } else {
            System.out.println("if else : Inconnu");







        }
        switch (age){
            case 7 :
            System.out.println("Switch : Poussin");
            break;

            case 8 & 9:
            System.out.println("Switch : Pupille");
            break;

            case 10 & 11:
            System.out.println("Switch : Minim");
            break;

            default :
            System.out.println("Switch : Inconnu");
            break;

        } 
    }
}




//- `Poussin` si l'âge est de 7 ans
  //  - `Pupille` si l'âge est 8 ou 9 ans
    //- `Minime` si l'âge est 10 ou 11 ans
    //- `Inconnu` pour les autres catégories