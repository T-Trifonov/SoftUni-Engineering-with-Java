package B_MultidimensionalArrays;

import java.util.Scanner;

public class T01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstMatrixDimension = scanner.nextLine().split(" ");
        int rowsFirstMatrix = Integer.parseInt(firstMatrixDimension[0]);
        int columnFirstMatrix = Integer.parseInt(firstMatrixDimension[1]);

        int[][] firstMatrix = new int[rowsFirstMatrix][columnFirstMatrix];

        for (int i = 0; i < rowsFirstMatrix; i++) {
            String[] valuesFirstMatrix = scanner.nextLine().split(" ");

            for (int j = 0; j < columnFirstMatrix; j++) {
                firstMatrix[i][j] = Integer.parseInt(valuesFirstMatrix[j]);
            }

        }

        String[] secondMatrixDimension = scanner.nextLine().split(" ");
        int rowSecondMatrix = Integer.parseInt(secondMatrixDimension[0]);
        int columnSecondMatrix = Integer.parseInt(secondMatrixDimension[1]);

        int[][] secondMatrix = new int[rowSecondMatrix][columnSecondMatrix];

        for (int i = 0; i < rowSecondMatrix; i++) {
            String[] valuesSecondMatrix = scanner.nextLine().split(" ");

            for (int j = 0; j < columnSecondMatrix; j++) {
                secondMatrix[i][j] = Integer.parseInt(valuesSecondMatrix[j]);
            }

        }

        if (rowsFirstMatrix != rowSecondMatrix || columnFirstMatrix != columnSecondMatrix) {
            System.out.println("not equal");
            return;
        }

        for (int i = 0; i < rowsFirstMatrix; i++) {
            for (int j = 0; j < columnFirstMatrix; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }

        System.out.println("equal");

    }
}
