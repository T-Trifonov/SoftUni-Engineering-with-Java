package B_MultidimensionalArrays.LAB;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> base = new HashMap<>();
        int rows = 0;
        int cols = Integer.MIN_VALUE;

        String rotateCommand = scanner.nextLine();

        int angleOfRotation = rotateDefinition(rotateCommand);

        angleOfRotation = checkRotation(angleOfRotation);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            int tempL = length(input);

            if (tempL > cols) {
                cols = tempL;
            }

            base.put(rows, input);

            input = scanner.nextLine();
            rows++;
        }

        String[][] matrix = new String[rows][cols];

        fillmatrix(base, matrix);

        if (angleOfRotation == 0 || angleOfRotation == 360) {
            printMatrix(matrix);
        } else if (angleOfRotation == 90) {
            ninetyDegreePrinting(matrix);
        } else if (angleOfRotation == 180) {
            hundredAndEightyPrinting(matrix);
        } else if (angleOfRotation==270) {
            twoHundredAndSeventyPrinting(matrix);
        }

    }

    private static void twoHundredAndSeventyPrinting(String[][] matrix) {

        for (int j = matrix[0].length - 1; j >= 0; j--) {
            System.out.println();
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j]);
            }
        }

    }

    private static void hundredAndEightyPrinting(String[][] matrix) {

        for (int i = matrix.length - 1; i >= 0; i--) {
            System.out.println();
            for (int j = matrix[0].length - 1; j >= 0; j--) {

                System.out.print(matrix[i][j]);
            }
        }

    }

    private static void ninetyDegreePrinting(String[][] matrix) {

        for (int j = 0; j < matrix[0].length; j++) {
            System.out.println();
            for (int i = matrix.length - 1; i >= 0; i--) {

                System.out.print(matrix[i][j]);
            }
        }

    }

    private static void printMatrix(String[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);

            }
        }

    }

    private static void fillmatrix(Map<Integer, String> base, String[][] matrix) {

        String position;

        for (int i = 0; i < matrix.length; i++) {
            String temp = base.get(i);
            int length = temp.length();
            for (int j = 0; j < matrix[0].length; j++) {
                if (length <= j) {
                    position = " ";
                } else {
                    position = String.valueOf(temp.charAt(j));
                }

                matrix[i][j] = position;

            }
        }

    }

    private static int length(String input) {

        char[] characters = input.toCharArray();

        return characters.length;
    }

    private static int checkRotation(int angleOfRotation) {

        while (angleOfRotation > 360) {

            angleOfRotation -= 360;

        }

        return angleOfRotation;

    }

    private static int rotateDefinition(String command) {
        int value = 0;

        String patternString = "(?<value>(\\d+))";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(command);

        if (matcher.find()) {
            value = Integer.parseInt(matcher.group("value"));
        }

        return value;
    }

}
