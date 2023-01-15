package B_MultidimensionalArrays;

import java.util.Scanner;

public class T05MaximumSumOf2x2Submatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] valueLine = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(valueLine[j]);
            }
        }

        int sumTemp = matrix[0][0];
        int sumMax = Integer.MIN_VALUE;

        int iMax = 0;
        int jMax = 0;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                sumTemp = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];

                if (sumTemp > sumMax) {
                    sumMax = sumTemp;
                    iMax = i;
                    jMax = j;
                }

            }
        }

        for (int i = iMax; i <= iMax + 1; i++) {
            System.out.println();
            for (int j = jMax; j <= jMax + 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        System.out.println();
        System.out.println(sumMax);

    }

}
