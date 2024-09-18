package exercices.exercice08;

public class ex801 {
    public static void main(String[] arg){
        for (int i =1; i<=5; i ++) {
            System.out.println ("boucle for iteration : " + i);
        }
        int i = 0;
        while (i != 5) {
            i ++;
            System.out.println("boucle while iteration : " + i);
        }
        i = 0;
        do{
            i ++;
            System.out.println("do while itération : " + i);
        } while (i != 5);
    }
}
