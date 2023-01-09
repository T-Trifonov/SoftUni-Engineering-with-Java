package B_DataTypesAndVariables;

import java.util.Scanner;

public class T10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumDigit = 0;

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {

            int iTemp = i;

            while (iTemp > 0) {

                int lastDigit = iTemp % 10;

                sumDigit += lastDigit;

                iTemp = iTemp/10;
            }

            if (sumDigit == 5 || sumDigit == 7 || sumDigit == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

            sumDigit=0;

        }

    }
}
