package C_Arrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class T06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumLeft = 0;
        int sumRight = 0;

        boolean isEquals = true;

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (array.length > 1) {

            for (int i = 0; i < array.length; i++) {
                sumLeft += array[i];
                for (int j = i + 1; j < array.length; j++) {
                    sumRight += array[j];
                }

                if (sumLeft == sumRight) {
                    System.out.printf("%d", i + 1);
                    isEquals = true;
                    break;
                } else {
                    isEquals = false;
                }

                sumRight = 0;

            }

            if (!isEquals) {
                System.out.println("no");
            }

        } else {
            System.out.println("0");
        }

    }
}
