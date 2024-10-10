package exercices.codagelibre;

import java.util.Base64;

public class bruteforce {
    public static final String PASSWORD = "bTBsZHU=";
    public static final char[] CHARACTERS = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b',
            'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z' };
    public static final int MAXCHAR = 5;

    public static void main(String[] args) {

        /*
         * à faire : afficher le mot de passe trouvé avec un sout
         * Le mot de passe contient exactement entre 0 et 5 caractères
         * Pour tester si un mot de passe est correct, il faut appeler la méthode
         * testPassword en lui donnant en paramètre le password à tester
         */
        int char_amount = 1;
        int char_place_rotation = 0;
        char[] passwordarray;
        passwordarray = new char[] {};
        String test = "";
        for (;;) {
            char_amount++;
            for (int j = 0; j < char_amount; j++) {
                for (int i = 0; i < CHARACTERS.length; i++) {
                    passwordarray[char_place_rotation] = CHARACTERS[i];
                }
                char_place_rotation++;
            }
            test = passwordarray[0];
            for (int k = 1; k < passwordarray.length; k++)
                test = test + "" + passwordarray[k];
            System.out.println(test);
        }

    }

    public static boolean testPassword(String password) {
        boolean retour = false;
        byte[] decodedBytes = Base64.getDecoder().decode(PASSWORD);
        String decodedPwd = new String(decodedBytes);

        if (password.equals(decodedPwd)) {
            retour = true;
        }

        return retour;
    }

}
