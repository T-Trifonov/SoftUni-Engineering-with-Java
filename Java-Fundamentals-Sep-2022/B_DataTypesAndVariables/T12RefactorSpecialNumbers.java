package B_DataTypesAndVariables;

import java.util.Scanner;

public class T12RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());
        int numSum=0;

        for (int ch = 1; ch <= inputNumber; ch++) {

            int tempNumber = ch;

            while (tempNumber > 0) {

                numSum += tempNumber%10;
                tempNumber = tempNumber / 10;

            }

            if (numSum == 5 || numSum == 7 || numSum == 11) {
                System.out.printf("%d -> True%n", ch);

            } else {

                System.out.printf("%d -> False%n", ch);
            }

            numSum = 0;
        }
    }
}