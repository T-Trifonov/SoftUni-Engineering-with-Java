package A_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        do {

            System.out.printf("%d X %d = %d%n", num, multiplier, num*multiplier);

            multiplier++;
        } while (multiplier<=10);


    }
}
