package B_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class T06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsAndCols = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rowsAndCols][rowsAndCols];

        for (int i = 0; i < rowsAndCols; i++) {
            int[] values = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(el -> Integer.parseInt(el)).toArray();
            for (int j = 0; j < rowsAndCols; j++) {
                matrix[i][j] = values[j];
            }
        }

        for (int i = 0; i < rowsAndCols; i++) {
            System.out.print(matrix[i][i] + " ");

        }

        System.out.println();
        int counter=0;

        for (int i = rowsAndCols-1; i >= 0; i--) {
            System.out.print(matrix[i][counter]+" ");
            counter++;
        }

    }
}
