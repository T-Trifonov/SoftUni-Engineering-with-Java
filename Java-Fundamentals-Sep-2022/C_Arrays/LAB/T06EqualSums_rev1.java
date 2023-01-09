package C_Arrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class T06EqualSums_rev1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumLeft = 0;
        int sumRight = 0;

        boolean isEquals = false;

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < array.length; i++) {
            sumLeft=0;
            sumRight=0;
            for (int j = 0; j < i; j++) {
                sumLeft += array[j];
            }

            for (int k = i + 1; k < array.length; k++) {
                sumRight += array[k];
            }

            if (sumLeft == sumRight) {
                System.out.println(i);
                isEquals = true;
                break;
            }

        }

        if (!isEquals){
            System.out.println("no");
        }

    }
}
