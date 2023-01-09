package D_Methods.LAB;

import java.util.Scanner;

public class T10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            if (isDivisible(i) && isOddDigit(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean isDivisible(int number) {

        boolean isDivisible = false;

        int sum = 0;
        int temp = 0;


        while (number > 0) {

            temp = number % 10;
            sum += temp;
            number = number / 10;

        }

        if (sum % 8 == 0) {
            isDivisible = true;
        }

        return isDivisible;

    }

    public static boolean isOddDigit(int number) {

        boolean isOddDigit = false;

        int sum = 0;
        int temp = 0;

        while (number > 0) {

            temp = number % 10;

            if (!(temp % 2 == 0)) {
                isOddDigit = true;
                break;
            }


            number = number / 10;

        }

        return isOddDigit;

    }

}
