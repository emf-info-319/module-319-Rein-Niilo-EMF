package exercices.codagelibre;

import java.util.Scanner; // Import the Scanner class

public class revision01 {
    public static final int width = 100;
    public static final int height = 50;
    public static int[][] cords = new int[height][width];
    public static final int max = 1;
    public static final int min = 0;

    public static void main(String[] args) {
        int wave = 5;
        int choix2 = 0;
        boolean choix = false;
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                cords[i][j] = 1 + (int) (Math.random() * 3);
                if (cords[i][j] == 2 | cords[i][j] == 3) {
                    cords[i][j] = 0;
                }
            }
        }
        int taille = 0;
        printcords();
        generate();
        int x;
        int y;
        for (;;) {
            int réponse = scanner.nextInt(); // Read user input
            switch (réponse) {
                case 1:
                    réponse = scanner.nextInt(); // Read user input
                    for (int i = 0; i != réponse; i++) {
                        generate();
                    }
                    break;
                case 2:
                    System.out.println("Enter X coordinate (0 to " + (width - 1) + "):");
                    x = scanner.nextInt();
                    System.out.println("Enter Y coordinate (0 to " + (height - 1) + "):");
                    y = scanner.nextInt();

                    // Validate inputs
                    if (y >= 0 && y < height && x >= 0 && x < width) {
                        cords[y][x] = (cords[y][x] == 0) ? 1 : 0;
                        printcords();
                    } else {
                        System.out.println("Invalid coordinates. Please try again.");
                    }
                    break;
                case 3:
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            cords[i][j] = 0;
                        }
                    }
                    printcords();
                    break;
                case 4:
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            cords[i][j] = 1;
                        }
                    }
                    printcords();
                    break;
                case 5:
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            cords[i][j] = 1 + (int) (Math.random() * 3);
                            if (cords[i][j] == 2 | cords[i][j] == 3) {
                                cords[i][j] = 0;
                            }
                        }
                    }
                    printcords();
                    break;
                case 6:
                    addGlider(width / 2, height / 2);
                    printcords();
                    break;
                case 7:

                    break;
                case 8:
                    System.out.println("Enter X coordinate (0 to " + (width - 1) + "):");
                    x = scanner.nextInt();
                    System.out.println("Enter Y coordinate (0 to " + (height - 1) + "):");
                    y = scanner.nextInt();
                    System.out.println("entrez la taille souhaité");
                    taille = scanner.nextInt();
                    System.out.println("voulez vous le remplir ou pas? 1 oui 0 non.");
                    choix2 = scanner.nextInt();
                    if (choix2 == 1) {
                        choix = true;
                    } else {
                        choix = false;
                    }
                    for (int i = taille; i > 0; i--) {
                        generateRipple(taille - i, x, y);
                        if (!choix) {
                            ungenerateRipple(taille - i - 1, x, y);
                        }
                    }
                    break;
                case 9:
                    rain();
                    break;
                case 10:
                    System.out.println("Enter X coordinate (0 to " + (width - 1) + "):");
                    x = scanner.nextInt();
                    System.out.println("Enter Y coordinate (0 to " + (height - 1) + "):");
                    y = scanner.nextInt();
                    System.out.println("entrez la taille souhaité");
                    taille = scanner.nextInt();
                    generateTriangle(taille,x,y);
                    break;

            }
        }

    }

    public static void printcords() {
        try {
            Thread.sleep(5); // Pause for 50 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J"); // Clear screen
        System.out.flush(); // Ensure output is sent to the terminal immediately

        // Iterate from bottom to top to correct Y-axis inversion
        for (int i = height - 1; i >= 0; i--) {
            String printline = "|"; // Start a new line
            for (int j = 0; j < width; j++) {
                if (cords[i][j] == 1) {
                    printline += " ■"; // Alive cell
                } else if (cords[i][j] == 0) {
                    printline += "  "; // Dead cell
                } else if (cords[i][j] == 2){
                    printline += " !";
                } else if (cords[i][j]== 3){
                    printline += " @";
                }
            }
            System.out.println(printline); // Print the row
        }
        try {
            Thread.sleep(15); // Pause for 50 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int[][] generate() {
        int[][] newCords = new int[height][width]; // Temporary grid for next state

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int voisins = 0;

                // Check all eight neighbors
                for (int dy = -1; dy <= 1; dy++) {
                    for (int dx = -1; dx <= 1; dx++) {
                        if (dx == 0 && dy == 0)
                            continue; // Skip the current cell
                        int neighborX = j + dx;
                        int neighborY = i + dy;

                        // Ensure neighbors are within bounds
                        if (neighborX >= 0 && neighborX < width && neighborY >= 0 && neighborY < height) {
                            voisins += cords[neighborY][neighborX];
                        }
                    }
                }

                // Apply Conway's Game of Life rules
                if (cords[i][j] == 1) {
                    // Live cell rules
                    if (voisins < 2 || voisins > 3) {
                        newCords[i][j] = 0; // Dies
                    } else {
                        newCords[i][j] = 1; // Survives
                    }
                } else {
                    // Dead cell rules
                    if (voisins == 3) {
                        newCords[i][j] = 1; // Becomes alive
                    } else {
                        newCords[i][j] = 0; // Stays dead
                    }
                }
            }
        }

        cords = newCords; // Update the original grid
        printcords(); // Display the grid
        return cords;
    }

    public static void addGlider(int startX, int startY) {
        // Glider pattern:
        // 0 ■ 0
        // 0 0 ■
        // ■ ■ ■

        // Ensure the glider fits within the grid
        if (startX >= 0 && startX + 2 < width && startY >= 0 && startY + 2 < height) {
            cords[startY][startX + 1] = 1; // Top-center
            cords[startY + 1][startX + 2] = 1; // Middle-right
            cords[startY + 2][startX] = 1; // Bottom-left
            cords[startY + 2][startX + 1] = 1; // Bottom-center
            cords[startY + 2][startX + 2] = 1; // Bottom-right
        } else {
            System.out.println("Invalid coordinates for glider. Ensure it fits within the grid.");
        }
    }

    public static void generateRipple(int wave, int x, int y) {
        // For each "wave" level, create a ring of affected cells
        for (int i = -wave; i <= wave; i++) {
            for (int j = -wave; j <= wave; j++) {
                // This makes sure to create a ring shape (Manhattan distance = wave)
                if (Math.abs(i) + Math.abs(j) == wave) {
                    // Ensure the coordinates are within bounds
                    if (y + i >= 0 && y + i < height && x + j >= 0 && x + j < width) {
                        cords[y + i][x + j] = 1; // Mark this cell as affected by the ripple
                    }
                }
            }
        }
        printcords(); // Print the grid after the current ripple expansion
    }

    public static void createRippleEffect(int x, int y, int maxWave) {
        // Create the initial ripple (the droplet impact at (x, y))
        cords[y][x] = 1;
        printcords(); // Print after initial impact
        // Gradually expand the ripple over time
        for (int wave = 1; wave <= maxWave; wave++) {
            // Expand the ripple by increasing the wave size
            generateRipple(wave, x, y);
            try {
                Thread.sleep(50); // Pause between each ripple expansion (for effect)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void ungenerateRipple(int wave, int x, int y) {
        // For each "wave" level, create a ring of affected cells
        for (int i = -wave; i <= wave; i++) {
            for (int j = -wave; j <= wave; j++) {
                // This makes sure to create a ring shape (Manhattan distance = wave)
                if (Math.abs(i) + Math.abs(j) == wave) {
                    // Ensure the coordinates are within bounds
                    if (y + i >= 0 && y + i < height && x + j >= 0 && x + j < width) {
                        cords[y + i][x + j] = 0; // Mark this cell as affected by the ripple
                    }
                }
            }
        }
        printcords(); // Print the grid after the current ripple expansion
    }

    public static void uncreateRippleEffect(int x, int y, int maxWave) {
        // Create the initial ripple (the droplet impact at (x, y))
        cords[y][x] = 0;
        printcords(); // Print after initial impact
        // Gradually expand the ripple over time
        for (int wave = 1; wave <= maxWave; wave++) {
            // Expand the ripple by increasing the wave size
            ungenerateRipple(wave, x, y);
            try {
                Thread.sleep(50); // Pause between each ripple expansion (for effect)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void rain() {
        int x = 0 + (int) (Math.random() * ((width | 0)));
        int y = 0 + (int) (Math.random() * ((height | min)));
        int wave = 0 + (int) (Math.random() * ((5 | 0)));
        for (int j = 0; j < 20; j++) {
            wave = 5 + (int) (Math.random() * ((20 | 5)));
            y = 0 + (int) (Math.random() * ((height | min)));
            x = 0 + (int) (Math.random() * ((width | 0)));
            for (int i = wave; i > 0; i--) {
                generateRipple(wave - i, x, y);
                ungenerateRipple(wave - i - 1, x, y);
            }
        }
    }

    public static void generateTriangle(int baseWidth, int x, int y) {
        // Calculate the triangle height from the base width
        int heightTriangle = (baseWidth + 1) / 2;

        // Loop to create the triangle rows
        for (int i = 0; i < heightTriangle; i++) {
            int rowWidth = 2 * i + 1; // Row width increases by 2 each time
            int startX = x - i; // Center-align the triangle

            for (int j = 0; j < rowWidth; j++) {
                int currentX = startX + j;
                if (currentX >= 0 && currentX < width && y - i >= 0 && y - i < height) {
                    cords[y - i][currentX] = 1; // Set the cell to alive
                }
            }
            printcords(); // Print the grid after updating each row
            try {
                Thread.sleep(100); // Pause for visualization effect
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void maze(){
        int playery =  0 + (int) (Math.random() * ((height | min)));
        int playerx =  0 + (int) (Math.random() * ((width | min)));
    }
}
