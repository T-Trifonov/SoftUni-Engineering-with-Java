package B_MultidimensionalArrays.LAB;

import java.util.*;

public class T07Crossfire {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] dimensionMatrix = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimensionMatrix[0]);
        int cols = Integer.parseInt(dimensionMatrix[1]);

        List<List<Integer>> matrix = new ArrayList<>();

        fillListMatrix(rows, cols, matrix);

        String command = scanner.nextLine();

        while (!command.equals("Nuke it from orbit")) {

            int rowPosition = Integer.parseInt(command.split("\\s+")[0]);
            int colsPosition = Integer.parseInt(command.split("\\s+")[1]);
            int radius = Integer.parseInt(command.split("\\s+")[2]);

            for (int i = rowPosition - radius; i < rowPosition + radius; i++) {
                if (isInMatrixRow(matrix, i)) {
                    if (i != rowPosition) {
                        matrix.get(i).set(i, -1);
                    }
                }
            }

            int size = matrix.get(rowPosition).size();

            for (int i = colsPosition + radius; i >= colsPosition - radius; i--) {
                if (isInMatrixCols(matrix, rowPosition, i)) {
                    matrix.get(rowPosition).set(i, -1);
                    //i -= 1;
                }
            }

            command = scanner.nextLine();
        }


        System.out.println();


    }

    private static boolean isInMatrixCols(List<List<Integer>> matrix, int i, int i1) {

        boolean isTrue = false;

        if (matrix.get(i).size() >= 0 && matrix.get(i).size() - 1 >= i1) {
            isTrue = true;
        }

        return isTrue;

    }

    private static boolean isInMatrixRow(List<List<Integer>> matrix, int i) {

        boolean isTrue = false;

        if (matrix.size() >= i) {
            isTrue = true;
        }

        return isTrue;

    }

    private static void fillListMatrix(int rows, int cols, List<List<Integer>> matrix) {

        int counter = 1;

        for (int i = 0; i < rows; i++) {
            List<Integer> rowValues = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                rowValues.add(counter);
                counter++;
            }

            matrix.add(rowValues);

        }
    }
}
