package B_MultidimensionalArrays.LAB;

import java.util.Scanner;

public class T03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[num][num];

        for (int i = 0; i < num; i++) {
            String[] rowValues = scanner.nextLine().split("\\s+");
            for (int j = 0; j < num; j++) {
                matrix[i][j]=Integer.parseInt(rowValues[j]);
            }
        }

        int diaT = 0;
        int diaB = 0;

        int step=0;
        while(step <= matrix.length-1){

            diaT+=matrix[step][step];

            step++;
        }

        step=0;
        int stepB= matrix.length-1;
        while(stepB>=0){

            diaB+=matrix[stepB][step];

            step++;
            stepB--;
        }

        System.out.println(Math.abs(diaT-diaB));

    }
}
