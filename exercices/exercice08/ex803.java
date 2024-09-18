package exercices.exercice08;

public class ex803 {
    public static void main(String[] arg){
        int i = 0;
        while (i != 5) {
            i ++;
            System.out.println("boucle while iteration : " + i);
            if (i >= 3){
                break;
            }
        }
    }
}
