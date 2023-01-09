package A_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int n = 1;

        while (n <= 10) {

            System.out.printf("%d X %d = %d%n", num, n, num*n );

            n++;
        }
    }
}
