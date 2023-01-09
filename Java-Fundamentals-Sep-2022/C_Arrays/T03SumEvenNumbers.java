package C_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class T03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenDigitSum = 0;

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenDigitSum += numbers[i];
            }
        }

        System.out.println(evenDigitSum);

    }
}
