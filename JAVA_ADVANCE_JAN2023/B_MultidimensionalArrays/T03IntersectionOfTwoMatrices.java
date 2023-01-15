package B_MultidimensionalArrays;

import java.util.Scanner;

public class T03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        String[][] matrixF = new String[rows][cols];
        String[][] matrixS = new String[rows][cols];
        String[][] matrixO = new String[rows][cols];

//load first matrix
        for (int i = 0; i < rows; i++) {
            String[] symbol = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                matrixF[i][j] = symbol[j];
            }
        }

//load second matrix
        for (int i = 0; i < rows; i++) {
            String[] symbol = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                matrixS[i][j] = symbol[j];
            }
        }

//output matrix

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrixF[i][j].equals(matrixS[i][j])) {
                    matrixO[i][j] = matrixF[i][j];
                } else {
                    matrixO[i][j] = "*";
                }

            }
        }

//print output

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {
                System.out.print(matrixO[i][j] + " ");
            }
        }

    }
}
