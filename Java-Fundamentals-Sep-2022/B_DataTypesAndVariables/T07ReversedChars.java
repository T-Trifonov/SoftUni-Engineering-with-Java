package B_DataTypesAndVariables;

import java.util.Scanner;

public class T07ReversedChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = "";
        String reverseText = "";

        for (int i = 1; i <=3 ; i++) {
            String symbol = scanner.nextLine();
            text +=symbol;
        }

        for (int i = text.length()-1; i >= 0  ; i--) {
            char reverseSymbol = text.charAt(i);
            reverseText += reverseSymbol + " ";
        }

        System.out.println(reverseText);

    }
}
