package C_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class T07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isCondensed = true;

        int[] inputArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (inputArray.length != 1) {

            while (isCondensed) {

                int[] reducedArray = new int[inputArray.length - 1];

                for (int position = 0; position < inputArray.length - 1; position++) {
                    reducedArray[position] = inputArray[position] + inputArray[position + 1];
                }

                inputArray = reducedArray;

                if (inputArray.length == 1) {
                    isCondensed = false;
                }

            }
        }

        System.out.println(inputArray[0]);

    }

}
