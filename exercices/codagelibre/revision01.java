package exercices.codagelibre;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner; // Import the Scanner class

public class revision01 {
    public static int width = 100;
    public static int height = 10;
    public static int[][] cords = new int[height][width];
    public static int max = 1;
    public static int min = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                cords[i][j] = 1 + (int) (Math.random() * 2);
                if (cords[i][j] == 2) {
                    cords[i][j] = 0;
                }
            }
        }
        
        printcords();
        String line = "¦";
        for (int i = 0; i != width; i++) {
            line = line + "" + "¦";
        }
        System.out.println(line);
        System.out.println(line);
        generate();
        int x;
        int y;
        for (;;) {
            int réponse = scanner.nextInt(); // Read user input
            switch (réponse) {
                case 1:
                    réponse = scanner.nextInt(); // Read user input
                    for (int i = 0; i != réponse; i++) {
                        System.out.println(line);
                        System.out.println(line);
                        generate();
                    }
                    break;
                case 2:
                    System.out.println("Enter X coordinate (0 to " + (height - 1) + "):");
                    x = scanner.nextInt();
                    System.out.println("Enter Y coordinate (0 to " + (width - 1) + "):");
                    y = scanner.nextInt();

                    // Validate inputs
                    if (x >= 0 && x < height && y >= 0 && y < width) {
                        cords[x][y] = (cords[x][height-y] == 0) ? 1 : 0;
                        printcords();
                    } else {
                        System.out.println("Invalid coordinates. Please try again.");
                    }
                    break;
            }
        }

    }

    public static void printcords() {
        String printline = "|";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (cords[i][j] == 1) {
                    printline = printline + "" + "■";
                } else if (cords[i][j] == 0) {
                    printline = printline + "" + "_";
                }
            }
            System.out.println(printline);
            printline = "|";
        }
    }

    public static int[][] generate() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int voisins = 0;

                // Check each neighbor conditionally
                if (i > 0) {
                    voisins += cords[i - 1][j];
                } // Top
                if (i < height - 1) {
                    voisins += cords[i + 1][j];
                } // Bottom
                if (j > 0) {
                    voisins += cords[i][j - 1];
                } // Left
                if (j < width - 1) {
                    voisins += cords[i][j + 1];
                } // Right
                if (i > 0 && j > 0) {
                    voisins += cords[i - 1][j - 1];
                } // Top-left
                if (i > 0 && j < width - 1) {
                    voisins += cords[i - 1][j + 1];
                } // Top-right
                if (i < height - 1 && j > 0) {
                    voisins += cords[i + 1][j - 1];
                } // Bottom-left
                if (i < height - 1 && j < width - 1) {
                    voisins += cords[i + 1][j + 1];
                } // Bottom-right

                // Apply the game rules
                if (voisins < 2 && cords[i][j] == 1) {
                    cords[i][j] = 0;
                } else if (voisins > 3 && cords[i][j] == 1) {
                    cords[i][j] = 0;
                } else if (voisins == 3 && cords[i][j] == 0) {
                    cords[i][j] = 1;
                }

            }
        }
        
        printcords();
        return cords;
    }
}
