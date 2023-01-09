package C_Arrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class T03ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputLines = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[inputLines];
        int[] secondArray = new int[inputLines];

        for (int i = 1; i <= inputLines; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int arrValues = 1; arrValues <= arr.length - 1; arrValues++) {
                if (i % 2 == 0) {
                    firstArray[i - 1] = arr[arrValues];
                    secondArray[i - 1] = arr[arrValues-1];
                } else {
                    firstArray[i - 1] = arr[arrValues - 1];
                    secondArray[i - 1] = arr[arrValues];

                }
            }

        }

        for (int firstArrayV: firstArray) {
            System.out.print(firstArrayV+" ");
        }

        System.out.println();

        for (int secondArrayV: secondArray) {
            System.out.print(secondArrayV+" ");
        }

    }
}
