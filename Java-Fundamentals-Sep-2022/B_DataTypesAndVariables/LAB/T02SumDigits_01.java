package B_DataTypesAndVariables.LAB;

import java.util.Scanner;

public class T02SumDigits_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumDigit = 0;
        int digitValue = 0;

        String digit = scanner.nextLine();

        for (int i = 0; i <= digit.length() - 1; i++) {
            digitValue = digit.charAt(i);
            sumDigit += Character.getNumericValue(digitValue);

        }

        System.out.println(sumDigit);

    }
}

