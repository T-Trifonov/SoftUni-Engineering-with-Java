package C_Arrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class T08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= array.length; i++) {
            int digit1=array[i-1];

            for (int j = i; j < array.length ; j++) {
                int digit2=array[j];

                if (digit1+digit2 == num){
                    System.out.printf("%d %d%n", digit1, digit2);
                }

            }

        }

    }
}
