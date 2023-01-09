package B_DataTypesAndVariables;

import java.util.Scanner;

public class T02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double poundsInput = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.3f", poundsInput*1.36);

    }
}
