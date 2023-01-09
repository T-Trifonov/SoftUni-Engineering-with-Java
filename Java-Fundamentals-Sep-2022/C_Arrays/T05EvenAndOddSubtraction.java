package C_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class T05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenNumbersSum = 0;
        int oddNumbersSum = 0;

        int[] arrayDigits = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int digit : arrayDigits) {
            if (digit % 2 == 0) {
                evenNumbersSum += digit;
            } else {
                oddNumbersSum += digit;
            }
        }

        System.out.printf("%d", evenNumbersSum - oddNumbersSum);

    }
}
