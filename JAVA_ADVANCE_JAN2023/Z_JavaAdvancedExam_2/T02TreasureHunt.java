package Z_JavaAdvancedExam_2;

import java.util.*;
import java.util.stream.Collectors;

public class T02TreasureHunt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(el -> Integer.parseInt(el)).toArray();

        String[][] matrix = new String[matrixSize[0]][];

        List<String> route = new ArrayList<>();

        for (int i = 0; i < matrixSize[0]; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            matrix[i] = input;
        }

        int currentRow = 0;
        int currentCols = 0;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j].equals("Y")) {
                    currentRow = i;
                    currentCols = j;
                }

            }

        }

        String command = scanner.nextLine();

        while (!command.equals("Finish")) {

            if (command.equals("up")) {
                if (currentRow - 1 >= 0) {
                    if (!matrix[currentRow - 1][currentCols].equals("T")) {
                        currentRow = currentRow - 1;
                        route.add(command);
                    }
                }
            }

            if (command.equals("down")) {
                if (currentRow + 1 <= matrix.length - 1) {
                    if (!matrix[currentRow + 1][currentCols].equals("T")) {
                        currentRow = currentRow + 1;
                        route.add(command);
                    }
                }
            }

            if (command.equals("left")) {
                if (currentCols - 1 >= 0) {
                    if (!matrix[currentRow][currentCols - 1].equals("T")) {
                        currentCols = currentCols - 1;
                        route.add(command);
                    }
                }
            }

            if (command.equals("right")) {
                if (currentCols + 1 <= matrix[0].length-1) {
                    if (!matrix[currentRow][currentCols + 1].equals("T")) {
                        currentCols = currentCols + 1;
                        route.add(command);
                    }
                }
            }

            command = scanner.nextLine();
        }

        if (matrix[currentRow][currentCols].equals("X")) {
            System.out.println("I've found the treasure!");

            System.out.print("The right path is ");

            boolean isFirst = true;
            for (String current : route) {
                if (isFirst) {
                    System.out.print(current);
                    isFirst = false;
                } else {
                    System.out.print(", " + current);
                }
            }

        } else {

            System.out.println("The map is fake!");
        }

    }

}
