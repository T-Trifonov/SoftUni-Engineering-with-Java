package B_MultidimensionalArrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class T01FillTheMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(command[0]);
        int cols = rows;

        String type = command[1];

        int[][] matrix = new int[rows][cols];

        if (type.equals("A")) {

            fillMatrixAType(matrix);

            printMatrix(matrix);

        } else if (type.equals("B")) {
            printMatrixB(matrix);

            printMatrix(matrix);

        } else {
            System.out.println("Unknown type");
        }

    }

    private static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
        }

    }

    private static void printMatrixB(int[][] matrix) {
        int numbers = 1;

        for (int cols = 1; cols <= matrix.length; cols++) {
            if (cols % 2 == 0 && cols > 0) {
                for (int rows = matrix.length-1; rows >= 0; rows--) {
                    matrix[rows][cols-1] = numbers;
                    numbers++;
                }
            } else {
                for (int rows = 0; rows < matrix.length; rows++) {
                    matrix[rows][cols-1] = numbers;
                    numbers++;
                }
            }
        }
    }

    private static void fillMatrixAType(int[][] matrix) {

        int numbers = 1;
        for (int cols = 0; cols < matrix.length; cols++) {
            for (int rows = 0; rows < matrix.length; rows++) {
                matrix[rows][cols] = numbers;
                numbers++;
            }
        }
    }

}
