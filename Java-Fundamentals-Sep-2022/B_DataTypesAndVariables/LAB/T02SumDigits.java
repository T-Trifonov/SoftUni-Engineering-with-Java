package B_DataTypesAndVariables.LAB;

import java.util.Scanner;

public class T02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempNumber = 0;
        int sumDigit = 0;

        int number = Integer.parseInt(scanner.nextLine());

        tempNumber = number;

        while (tempNumber > 0) {

            sumDigit += tempNumber % 10;
            tempNumber = tempNumber / 10;

        }

        System.out.println(sumDigit);

    }
}

