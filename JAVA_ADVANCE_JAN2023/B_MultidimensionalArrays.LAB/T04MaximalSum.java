package B_MultidimensionalArrays.LAB;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class T04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsColsValues = scanner.nextLine().split("\\s+");

        int numRows = Integer.parseInt(rowsColsValues[0]);
        int numCols = Integer.parseInt(rowsColsValues[1]);

        int[][] matrix = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            String[] rowValues = scanner.nextLine().split("\\s+");

            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = Integer.parseInt(rowValues[j]);

            }
        }

        int rowSteps = (matrix.length) - 3;
        int colSteps = (matrix[0].length) - 3;

        int maxValue = Integer.MIN_VALUE;
        int tempValue = 0;

        int[] startPoint = new int[2];

        for (int i = 0; i <= rowSteps; i++) {
            for (int j = 0; j <= colSteps; j++) {

                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        tempValue += matrix[k][l];
                    }
                }

                if (tempValue > maxValue) {
                    maxValue = tempValue;
                    startPoint[0] = i;
                    startPoint[1] = j;
                }

                tempValue = 0;

            }
        }

        System.out.printf("Sum = %d",maxValue);

        for (int i = startPoint[0]; i < startPoint[0]+3; i++) {
            System.out.println();
            for (int j = startPoint[1]; j <startPoint[1]+3; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
        }

    }
}
