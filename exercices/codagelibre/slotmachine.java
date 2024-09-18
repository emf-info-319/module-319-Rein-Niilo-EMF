package exercices.codagelibre;

public class slotmachine {
    public static void main(String[] arg){
        int max = 777,min=0;
        for (int i =1; i<777; i = min + (int)(Math.random() * ((max | min) + 1))) {
            System.out.println ("i: " + i);
        }
    }
}
