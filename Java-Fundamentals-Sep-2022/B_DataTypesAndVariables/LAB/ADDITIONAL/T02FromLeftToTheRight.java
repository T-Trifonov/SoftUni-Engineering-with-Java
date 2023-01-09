package B_DataTypesAndVariables.LAB.ADDITIONAL;

import java.util.Scanner;

public class T02FromLeftToTheRight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rowNumbers = Integer.parseInt(scanner.nextLine());

        String left = "";
        String right = "";
        float leftDigit = 0;
        float rightDigit = 0;
        float leftSum = 0;
        float rightSum = 0;

        for (int i = 1; i <= rowNumbers; i++) {
            String stringInput = scanner.nextLine();
            for (int j = 0; j <= stringInput.length() - 1; j++) {
                char symbol = stringInput.charAt(j);
                if ((int) symbol != 32) {
                    right += symbol;
                    if ((int) symbol == 45) {
                        continue;
                    } else {
                        rightSum += Integer.parseInt(String.valueOf(symbol));
                    }
                } else {
                    left = right;
                    right = "";
                    leftSum = rightSum;
                    rightSum = 0;
                }

            }

            leftDigit = Float.parseFloat(left);
            rightDigit = Float.parseFloat(right);

            if (leftDigit > rightDigit) {
                System.out.printf("%.0f%n", leftSum);
            } else {
                System.out.printf("%.0f%n", rightSum);
            }

            right = "";
            left = "";
            rightSum = 0;
            leftSum = 0;
            leftDigit = 0;
            rightDigit = 0;
        }

    }

}

