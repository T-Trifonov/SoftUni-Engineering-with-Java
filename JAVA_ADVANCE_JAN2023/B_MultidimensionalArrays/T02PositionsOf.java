package B_MultidimensionalArrays;

import java.util.Scanner;

public class T02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowAndCols = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(rowAndCols[0]);
        int cols = Integer.parseInt(rowAndCols[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] data = scanner.nextLine().split(" ");

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(data[j]);
            }

        }

        int search = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == search) {
                    System.out.println(i + " " + j);
                    isFound = true;
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }

    }
}
