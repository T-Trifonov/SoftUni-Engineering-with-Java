package B_MultidimensionalArrays.LAB;

import java.util.Scanner;

public class T5MatrixShuffling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] rowsColsValues = scanner.nextLine().split("\\s+");

        int numRows = Integer.parseInt(rowsColsValues[0]);
        int numCols = Integer.parseInt(rowsColsValues[1]);

        String[][] matrix = new String[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            String[] rowValues = scanner.nextLine().split("\\s+");

            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = rowValues[j];

            }
        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String[] command = input.split("\\s+");

            Boolean isValidCommand = false;
            Boolean isCommand = false;

            int row1 = 0;
            int col1 = 0;
            int row2 = 0;
            int col2 = 0;

            if (input.contains("swap") && command.length==5) {

                row1 = Integer.parseInt(command[1]);
                col1 = Integer.parseInt(command[2]);
                row2 = Integer.parseInt(command[3]);
                col2 = Integer.parseInt(command[4]);
                isCommand = true;

            }

           if (isCommand && row1 <= matrix.length && row1>=0 && col1 <= matrix[0].length && col1>=0
                    && row2 <= matrix.length && row2>=0 && col2 <= matrix[0].length && col2>=0) {

                isValidCommand = true;
            }

            if (isValidCommand) {

                String tempValue1 = matrix[row1][col1];
                String tempValue2 = matrix[row2][col2];

                matrix[row1][col1] = tempValue2;
                matrix[row2][col2] = tempValue1;


                printMatrix(matrix);

            } else {

                System.out.printf("%nInvalid input!");
            }

            input = scanner.nextLine();
        }


    }

    private static void printMatrix(String[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
        }


    }
}