package B_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class T08WrongMeasurements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[num][];

        int colsOut = 0;
        for (int i = 0; i < num; i++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(el -> Integer.parseInt(el)).toArray();
            colsOut = currentRow.length;
            matrix[i] = currentRow;

        }

        String[] fixValue = scanner.nextLine().split("\\s+");

        int[][] matrixOut = new int[num][colsOut];

        int row = Integer.parseInt(fixValue[0]);
        int cols = Integer.parseInt(fixValue[1]);

        int replacementValue = matrix[row][cols];
        int tempValue = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == replacementValue) {

                    if (i - 1 >= 0) {
                        if (matrix[i - 1][j] != replacementValue) {
                            tempValue += matrix[i - 1][j];
                        }
                    }

                    if (i + 1 <= matrix.length - 1) {
                        if (matrix[i + 1][j] != replacementValue) {
                            tempValue += matrix[i + 1][j];
                        }
                    }

                    if (j - 1 >= 0) {
                        if (matrix[i][j - 1] != replacementValue)
                            tempValue += matrix[i][j - 1];
                    }

                    if (j + 1 <= matrix[i].length - 1) {
                        if (matrix[i][j + 1] != replacementValue) {
                            tempValue += matrix[i][j + 1];
                        }
                    }

                    matrixOut[i][j] = tempValue;

                    tempValue = 0;

                } else {

                    matrixOut[i][j] = matrix[i][j];

                }
            }
        }

        for (int i = 0; i < matrixOut.length; i++) {
            System.out.println();
            for (int j = 0; j < matrixOut[i].length; j++) {
                System.out.print(matrixOut[i][j] + " ");
            }
        }

    }
}
