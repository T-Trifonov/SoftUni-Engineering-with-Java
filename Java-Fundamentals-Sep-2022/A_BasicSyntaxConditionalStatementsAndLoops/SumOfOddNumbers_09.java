package A_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sumOddNumber = 0;
        int n = 1;

        for (int i = 1; i <= num; i++) {
            System.out.println(n);
            sumOddNumber += n;
            n = n + 2;
        }

        System.out.println("Sum: " + sumOddNumber);

    }
}
