package exercices.exercice12;

public class exstring {
    public static void main(String[] args) {
        String machainedecharactères = "voici le contenu d'un string avec un autre contenu";
        
        // Print the length of the string
        int length = machainedecharactères.length();
        System.out.println("Length of the string: " + length);
        
        // Word to find
        String wordToFind = "contenu";
        int index = machainedecharactères.indexOf(wordToFind); // Find the first occurrence
        
        // Loop through to find all occurrences of the word
        while (index != -1) {
            System.out.println("The word '" + wordToFind + "' found at index: " + index);
            index = machainedecharactères.indexOf(wordToFind, index + 1); // Look for the next occurrence
        }
         // Afficher la lettre à la position 10
         char lettrePosition10 = maChaineDeCaractere.charAt(10); // Notez que l'index commence à 0
         System.out.println("La lettre à la position 10 est : " + lettrePosition10);
    }
}