package T05JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final String END_COMMAND = "Let the Force be with you";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = matrixField(scanner);

        String command = scanner.nextLine();

        long sum = 0;
        while (!command.equals(END_COMMAND)) {

            int[] playerStartCoordinates = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilStartCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int rowE = evilStartCoordinates[0];
            int colE = evilStartCoordinates[1];

            while (rowE >= 0 && colE >= 0) {
                Process.destroetCell(matrix, rowE, colE);
                rowE--;
                colE--;
            }

            int rowP = playerStartCoordinates[0];
            int colP = playerStartCoordinates[1];

            while (rowP >= 0 && colP < matrix[1].length) {
                sum += Process.getPoints(matrix, rowP, colP, 0);
                colP++;
                rowP--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static int[][] matrixField(Scanner scanner) {
        int[] coordinates = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int rows = coordinates[0];
        int cols = coordinates[1];

        int[][] matrix = new int[rows][cols];

        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }
}
