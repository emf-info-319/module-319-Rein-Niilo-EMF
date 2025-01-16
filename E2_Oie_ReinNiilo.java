import java.util.Scanner; // Importe le scanneur

public class E2_Oie_ReinNiilo {
    public static final int TAILLE_PLATEAU = 20;
    public static final char CASE_VIDE = '_';
    public static final char CASE_REJOUER = 'R';
    public static final char CASE_RECULER = 'B';
    public static final char CASE_AVANCER = 'A';
    public static final char CASE_DEPART = 'D';
    public static final char CASE_FIN = 'F';
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char[] plateau = initialiserPlateau();
        int positionJoueur = 0;
        boolean jeuTermine = false;
        int nombreDeLance = 0;
        System.out.println("bienvenue au jeu de l'oie !");
        int de;
        afficherPlateau(plateau, positionJoueur);
        while (!jeuTermine) {
            System.out.println("Appuyez sur Entrée pour lancer le dé...");
            scanner.nextLine();
            de = lancerDe();
            nombreDeLance += 1;
            System.out.println("vous avez obtenus : " + de);
            positionJoueur = deplacerJoueur(positionJoueur, de, plateau);
            positionJoueur = appliquerEffetCase(plateau, positionJoueur);
            afficherPlateau(plateau, positionJoueur);
            if (positionJoueur == plateau.length - 1) {
                System.out.println("Félicitations, vous avez atteint la case finale et gagné le jeu en " + nombreDeLance
                        + " coups!");
                jeuTermine = true;
            }
        }
    }

    public static int appliquerEffetCase(char[] plateau, int positionActuelle) {
        switch (plateau[positionActuelle]) {
            case CASE_AVANCER:
                System.out.println("case avancer : Vous avancez de 2 cases Nouvelle position : " + (positionActuelle + 2));
                positionActuelle = deplacerJoueur(positionActuelle, 2, plateau);
                break;
            case CASE_REJOUER:
                System.out.println("case rejouer relancez le dé immédiatement");
                positionActuelle = deplacerJoueur(positionActuelle, lancerDe(), plateau);
                break;
            case CASE_RECULER:
                System.out.println("case reculer : vous reculez de 3 cases nouvelle position : " + (positionActuelle - 3));
                positionActuelle = deplacerJoueur(positionActuelle, -3, plateau);
                break;
            case CASE_VIDE:
                System.out.println("case normale");
                break;
        }
        return positionActuelle;
    }

    public static int deplacerJoueur(int positionActuelle, int nombreDe, char[] plateauTemporaire) {
        int nouvellePosition = positionActuelle;
        nouvellePosition += nombreDe;
        if (nouvellePosition >= plateauTemporaire.length) {
            nouvellePosition = plateauTemporaire.length - 1;
        } else if (nouvellePosition < 0) {
            nouvellePosition = 0;
        }
        System.out.println("vous avancez à la position : " + (nouvellePosition) + ".");
        return nouvellePosition;
    }

    public static int lancerDe() {
        int mathRand;
        mathRand = 1 + (int) (Math.random() * (((6 | 0))));

        return mathRand;
    }

    public static char[] initialiserPlateau() {
        char[] plateauCree = new char[TAILLE_PLATEAU];
        int mathRand;
        for (int i = 0; i < plateauCree.length; i++) {
            mathRand = 1 + (int) (Math.random() * (((4 | 0))));
            switch (mathRand) {
                case 1:
                    plateauCree[i] = CASE_VIDE;
                    break;
                case 2:
                    plateauCree[i] = CASE_REJOUER;
                    break;
                case 3:
                    plateauCree[i] = CASE_RECULER;
                    break;
                case 4:
                    plateauCree[i] = CASE_AVANCER;
                    break;
                default:
                    System.out.println("erreur d'initialisation");
                    break;
            }
        }
        plateauCree[0] = CASE_DEPART;
        plateauCree[(plateauCree.length - 1)] = CASE_FIN;
        return plateauCree;
    }

    public static void afficherPlateau(char[] plateauTemporaire, int positionJoueur) {
        String affichage = "|";
        for (int i = 0; i < plateauTemporaire.length; i++) {
            if (i != positionJoueur) {
                affichage += plateauTemporaire[i];
            } else {
                affichage += "P";
            }
            affichage += "|";
        }
        System.out.println(affichage);
    }
}
