package C_Arrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class T07MaxSequenceOfEqualElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int lengthMax = 0;
        int length = 0;
        int position = 0;

        for (int i = 1; i <= array.length - 1; i++) {


            int symbol = array[i - 1];
            int symbolNext = 0;

            symbolNext = array[i];

            if (symbol == symbolNext) {
                lengthMax++;
            } else {
                lengthMax = 0;

            }

            if (lengthMax > length) {
                length = lengthMax;
                position = i;
            }

        }

        for (int i = position - length; i <= position; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
