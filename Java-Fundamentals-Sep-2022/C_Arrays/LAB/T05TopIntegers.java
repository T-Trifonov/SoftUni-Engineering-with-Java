package C_Arrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class T05TopIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isMax = false;

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < array.length; i++) {
            int digit = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (digit>array[j]){
                    isMax = true;
                } else {
                    isMax = false;
                    break;
                }
            }

            if (isMax) {
                System.out.print(digit + " ");
            } else if (i==array.length-1){
                System.out.print(digit);
            }

            isMax=false;

        }

    }
}
