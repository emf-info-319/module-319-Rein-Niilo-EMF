import java.util.Scanner; // Importe le scanneur
public class E1_ShutTheBox_ReinNiilo {
    public static final int DES_MIN = 1;
    public static final int DES_MAX = 6;
    public static final int Nombre_Tuiles = 12;
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int[] tuiles = new int[Nombre_Tuiles];
        boolean enjeu = true;
        System.out.println("**********************************");
        System.out.println("*         'Shut The Box'         *");
        System.out.println("**********************************");
        for(int i = 0;i<Nombre_Tuiles;i++){
            tuiles[i]=1;
        }
        while (enjeu){
            affichetuiles(tuiles);
            int totalDes = tireLesDes();
            tuiles = enlèvetuiles(tuiles, totalDes);
            if (!contientEncoreDesTuilesABaisse(tuiles)){
                enjeu = false;
            }

        }
        SCANNER.close();
    }
    public static void affichetuiles(int[] tuiles){
        String printline = "|";
        for (int i = 0;i != tuiles.length;i++){
            if (tuiles[i] == 0){
                printline += "__|";
            } else if(i<9){
                printline += "0"+(i+1)+"|";
            } else {
                printline += (i+1) +"|";
            }
        }
        System.out.println(printline);
    }
    public static int tireLesDes(){
        int nombre2 = DES_MIN + (int)(Math.random() * (((DES_MAX | DES_MIN) + 1)));
        int nombre1 = DES_MIN + (int)(Math.random() * (((DES_MAX | DES_MIN) + 1)));
        System.out.println("les nombres tirés sont : "+nombre1+" et "+nombre2+" qui fait un total de : "+(nombre1+nombre2));
        return nombre1+nombre2;

    }
    public static int[] enlèvetuiles(int[] tableau,int totalDes){
        System.out.println("Donnez le(s) nombre(s) à enlever");
        int[] tuilestemp = copie(tableau);
        int valeur;
        int totalenleve = 0;
        boolean demandeencore = true;
        do{
            valeur = SCANNER.nextInt();
            totalenleve += valeur;
            if (valeur == 0){
                System.out.println("abandon...");
                for (int i = 0; i!= tuilestemp.length;i++){
                    tuilestemp[i]= 0;
                }
                tableau = copie(tuilestemp);
                demandeencore = false;
            } else if (valeur <1 | valeur> Nombre_Tuiles){
                System.out.println("hors limites!");
                totalenleve = 0;
            } else if (tuilestemp[valeur-1]==0){
                System.out.println("vous avez déja baissé la tuile a la position : "+ valeur);
                totalenleve -= valeur;
            } else if (totalenleve < totalDes){
                tuilestemp[valeur-1] = 0;
                System.out.println("ceci n'est pas suffisant merci d'enlever encore");
            } else if (totalenleve> totalDes){
                System.out.println("Le total est dépassé merci de choisir d'autres nombres");
                totalenleve = 0;
                tuilestemp = copie(tableau);
                affichetuiles(tableau);
            } else {
                tuilestemp[valeur-1]= 0;
                System.out.println("parfait!");
                tableau = copie(tuilestemp);
                demandeencore = false;
            }
        }while (demandeencore);
        
        return tableau;
    }
    public static boolean contientEncoreDesTuilesABaisse(int[] tuiles){
        int nombretuiles = 0;
        boolean vraioufaux;
        for(int i=0;i != tuiles.length;i++){
            nombretuiles +=tuiles[i];
        }
        if (nombretuiles==0){
            vraioufaux = false;
        } else{
            vraioufaux = true;
        }
        return vraioufaux;
    }
    public static int[] copie(int[] tuiles){
        int[] copie = new int[Nombre_Tuiles];
        for(int i = 0;i != tuiles.length;i++){
            copie[i] = tuiles[i];
        }
        return copie;

    }
}
