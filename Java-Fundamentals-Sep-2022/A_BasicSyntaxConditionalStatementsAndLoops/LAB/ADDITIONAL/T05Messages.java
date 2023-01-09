package A_BasicSyntaxConditionalStatementsAndLoops.LAB.ADDITIONAL;

import java.util.Scanner;

public class T05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInputs = Integer.parseInt(scanner.nextLine());

        String text = "";


        for (int i = 1; i <= numInputs; i++) {
            String digit = scanner.nextLine();

            if (digit.equals("0")) {
                System.out.println(" ");
                text += " ";
                continue;
            }

            int numDigits = digit.length();
            int mainDigit = Integer.parseInt(digit) % 10;
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset += 1;
            }
            int letterIndex = (offset + numDigits - 1) + 97;
            char symbol = (char) letterIndex;
            text += symbol;

        }

        System.out.println(text);
    }

}
