package B_MultidimensionalArrays;

import java.util.Scanner;

public class T07FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] table = new String[8][8];

        boolean verticalCheck = true;
        boolean horizontalCheck = true;
        boolean diagonalCheck = true;

        for (int i = 0; i < 8; i++) {
            String[] row = scanner.nextLine().split("\\s+");
            for (int j = 0; j < 8; j++) {
                table[i][j] = row[j];
            }
        }

        for (int rows = 0; rows < 8; rows++) {
            for (int cols = 0; cols < 8; cols++) {
                if (table[rows][cols].equals("q")) {

                    //vertical check

                    for (int i = rows + 1; i < table.length; i++) {
                        if (table[i][cols].equals("q")) {
                            verticalCheck = false;
                            break;
                        }
                    }
                    if (rows - 1 != 0 && verticalCheck) {
                        for (int j = rows - 1; j >= 0; j--) {
                            if (table[j][cols].equals("q")) {
                                verticalCheck = false;
                                break;
                            }
                        }
                    }

                    //horizontal check

                    for (int i = cols + 1; i < table.length; i++) {
                        if (table[rows][i].equals("q")) {
                            horizontalCheck = false;
                            break;
                        }
                    }

                    if (cols - 1 != 0 && horizontalCheck) {
                        for (int i = cols - 1; i >= 0; i--) {
                            if (table[rows][i].equals("q")) {
                                horizontalCheck = false;
                                break;
                            }

                        }
                    }

                    //diagonal check

                    int counter = 1;

                    while (rows + counter <= table.length-1 && cols + counter <= table.length-1) {

                        if (table[rows + counter][cols + counter].equals("q")) {
                            diagonalCheck = false;
                            break;
                        }

                        counter++;
                    }

                    counter = 1;
                    while (rows - counter >= 0 && cols - counter >= 0 && diagonalCheck) {
                        if (table[rows - counter][cols - counter].equals("q")) {
                            diagonalCheck = false;
                            break;
                        }
                        counter++;
                    }

                    counter = 1;
                    while (rows + counter <= table.length-1 && cols - counter >= 0 && diagonalCheck) {
                        if (table[rows + counter][cols - counter].equals("q")) {
                            diagonalCheck = false;
                            break;
                        }
                        counter++;
                    }

                    counter=1;
                    while (rows - counter >= 0 && cols + counter <= table.length-1 && diagonalCheck) {
                        if (table[rows - counter][cols + counter].equals("q")) {
                            diagonalCheck = false;
                            break;
                        }
                        counter++;
                    }

                    if (verticalCheck && horizontalCheck && diagonalCheck) {
                        System.out.print(rows + " ");
                        System.out.println(cols);
                    }

                }

                verticalCheck = true;
                horizontalCheck = true;
                diagonalCheck = true;

            }
        }


    }
}

