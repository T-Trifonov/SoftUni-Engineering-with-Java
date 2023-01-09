package B_DataTypesAndVariables.LAB.ADDITIONAL;

import java.util.Scanner;

public class T06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSymbols = Integer.parseInt(scanner.nextLine());
        int countOpenBracket = 0;
        String openBracket = "(";
        int countCloseBracket = 0;
        String closeBracket = ")";


        for (int i = 1; i <= numSymbols; i++) {

            String symbol = scanner.nextLine();

            if (symbol.contains(openBracket)) {
                countOpenBracket++;
            } else if (symbol.contains(closeBracket)) {
                countCloseBracket++;

            }

        }

        if (countOpenBracket == countCloseBracket) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

    }
}
