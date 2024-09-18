package exercices.exercice08;

public class ex804 {
    public static void main(String[] arg){
        for (int i =5; i>=1; i --) {
            System.out.println ("boucle for : " + i);
        }
        System.out.println ("décollage");
        int i = 6;
        while (i >= 1) {
            i --;
            System.out.println("boucle while : " + i);
        }
        System.out.println ("décollage");
        i = 6;
        do{
            i --;
            System.out.println("do while : " + i);
        } while (i != 1);
        System.out.println ("décollage");
    }
}
