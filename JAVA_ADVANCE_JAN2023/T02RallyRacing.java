package Z_JavaAdvancedExam_1;

import java.util.*;

public class T02RallyRacing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rowsCols = Integer.parseInt(scanner.nextLine());
        String[][] matrixRace = new String[rowsCols][];

        String racingCarNumber = scanner.nextLine();
        int currentRow = 0;
        int currentCols = 0;
        int distance = 0;
        int counter = 0;

        boolean isFinish = false;
        boolean isFound = false;

        for (int i = 0; i < rowsCols; i++) {
            String[] rowInput = scanner.nextLine().split("\\s+");
            matrixRace[i] = rowInput;
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {


            if (matrixRace[currentRow][currentCols].equals("T")) {
                matrixRace[currentRow][currentCols] = "A";

                for (int i = currentRow; i <= matrixRace.length - 1; i++) {

                    counter++;
                    if (counter >= 2) {
                        currentCols = 0;
                    }
                    for (int j = currentCols; j < matrixRace.length; j++) {

                        if (matrixRace[i][j].equals("T")) {
                            matrixRace[i][j] = "A";
                            currentRow = i;
                            currentCols = j;
                            distance = distance + 30;
                            isFound = true;
                        }

                    }

                    if (isFound) {
                        break;
                    }

                }

            } else if (matrixRace[currentRow][currentCols].equals("F")) {

                matrixRace[currentRow][currentCols] = "C";
                isFinish = true;
                break;

            }

            if (command.equals("down")) {
                if (currentRow + 1 <= matrixRace.length - 1) {
                    currentRow += 1;
                    if (matrixRace[currentRow - 1][currentCols].equals(".")) {
                        distance = distance + 10;
                    }
                }
            }

            if (command.equals("up")) {
                if (currentRow - 1 >= 0) {
                    currentRow -= 1;
                    if (matrixRace[currentRow + 1][currentCols].equals(".")) {
                        distance = distance + 10;
                    }

                }
            }

            if (command.equals("left")) {
                if (currentCols - 1 >= 0) {
                    currentCols -= 1;
                    if (matrixRace[currentRow][currentCols+1].equals(".")) {
                        distance = distance + 10;
                    }

                }
            }

            if (command.equals("right")) {
                if (currentCols + 1 <= matrixRace.length - 1) {
                    currentCols += 1;
                    if (matrixRace[currentRow][currentCols-1].equals(".")) {
                        distance = distance + 10;
                    }
                }
            }


            command = scanner.nextLine();
        }

        removeSymbol(matrixRace);

        if (isFinish) {
            System.out.printf("Racing car %s finished the stage!%n", racingCarNumber);
        } else {
            System.out.printf("Racing car %s DNF.%n", racingCarNumber);
        }

        System.out.printf("Distance covered %d km.", distance);

        matrixRace[currentRow][currentCols] = "C";

        printMatrixRace(matrixRace);

    }

    private static void removeSymbol(String[][] matrixRace) {
        for (int i = 0; i < matrixRace.length; i++) {
            for (int j = 0; j < matrixRace.length; j++) {
                if(matrixRace[i][j].equals("A")){
                    matrixRace[i][j]=".";
                }
            }
        }


    }

    private static void printMatrixRace(String[][] matrixRace) {

        for (int i = 0; i < matrixRace.length; i++) {
            System.out.println();
            for (int j = 0; j < matrixRace.length; j++) {
                System.out.print(matrixRace[i][j]);
            }
        }

    }

}
