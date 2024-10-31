public class exstring {
    public static void main(String[] args) {
        // 1. Déclarez une variable de type String avec le nom `maChaineDeCaractere`
        String maChaineDeCaractere = "Voici du contenu stocké dans un String.";

        // 3. Indiquez (avec un sout) le nombre de caractères contenu dans la variable
        int length = maChaineDeCaractere.length();
        System.out.println("Nombre de caractères contenu dans la variable maChaineDeCaractere : " + length);

        // 4. Indiquez (avec un sout) à quelle position commence "contenu"
        int positionContenu = maChaineDeCaractere.indexOf("contenu");
        System.out.println("Le mot \"contenu\" commence à la position : " + positionContenu);

        // 5. Indiquez (avec un sout) la lettre contenue à la position 10
        char lettrePosition10 = maChaineDeCaractere.charAt(10);
        System.out.println("La lettre à la position 10 est : " + lettrePosition10);

        // 6. Déclarez une nouvelle variable de type String avec le nom `monPrenom`
        String monPrenom = "Nicolas";  // Changez "Nicolas" par votre prénom si nécessaire

        // 7. A l'aide d'une boucle for, affichez chaque lettre du prénom
        for (int i = 0; i < monPrenom.length(); i++) {
            System.out.println("La lettre à la position " + i + " est : " + monPrenom.charAt(i));
        }

        // 9. Testez si la variable `monPrenom` contient la chaîne de caractères "test"
        if (monPrenom.contains("test")) {
            System.out.println("La chaîne de caractère \"" + monPrenom + "\" contient le texte \"test\".");
        } else {
            System.out.println("La chaîne de caractère \"" + monPrenom + "\" ne contient pas le texte \"test\".");
        }
    }
}