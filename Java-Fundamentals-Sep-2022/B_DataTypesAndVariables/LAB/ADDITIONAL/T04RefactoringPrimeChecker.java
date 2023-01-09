package B_DataTypesAndVariables.LAB.ADDITIONAL;

import java.util.Scanner;

public class T04RefactoringPrimeChecker {
    public static void main(String[] args) {

        Scanner scenner = new Scanner(System.in);

        int toDigit = Integer.parseInt(scenner.nextLine());

        for (int digit = 2; digit <= toDigit; digit++) {
            boolean checkDigit = true;
            for (int i = 2; i < digit; i++) {
                if (digit % i == 0) {
                    checkDigit = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", digit, checkDigit);
        }

    }
}
