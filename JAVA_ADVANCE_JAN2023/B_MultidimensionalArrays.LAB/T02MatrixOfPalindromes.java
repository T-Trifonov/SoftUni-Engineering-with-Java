package B_MultidimensionalArrays.LAB;

import java.util.Scanner;

public class T02MatrixOfPalindromes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = inputValue(i, j);

            }

        }

        printMatrix(matrix);

    }

    private static String inputValue(int rows, int cols) {
        StringBuilder string = new StringBuilder();

                string.append(Character.toChars(rows+97));
                string.append(Character.toChars(rows+cols+97));
                string.append(Character.toChars(rows+97));

        return string.toString();
    }

    private static void printMatrix(String[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
        }

    }

}
