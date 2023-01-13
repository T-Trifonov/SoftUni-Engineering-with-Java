package B_MultidimensionalArrays;

import java.util.Scanner;

public class T04SumMatrixElements {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] data = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j]=Integer.parseInt(data[j]);
            }
        }

        int sum=0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }
}
