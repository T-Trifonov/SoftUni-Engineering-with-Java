package B_DataTypesAndVariables;

import java.util.Scanner;

public class T06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstSymbol = scanner.nextLine();
        String secondSymbol = scanner.nextLine();
        String thirdSymbol = scanner.nextLine();

        System.out.println(firstSymbol+secondSymbol+thirdSymbol);

    }
}
