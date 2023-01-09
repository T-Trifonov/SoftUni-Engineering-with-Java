package A_BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class T09Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());

        double pricePerCapsule = 0;
        double days = 0;
        double capsuleCount = 0;

        double total = 0;

        for (int i = 1; i <= orders; i++) {
            for (int j = 1; j <= 3; j++) {
                double digit = Double.parseDouble(scanner.nextLine());
                if (j == 1) {
                    pricePerCapsule = digit;
                } else if (j == 2) {
                    days = digit;
                } else if (j == 3) {
                    capsuleCount = digit;
                }

            }

            double priceOrder = ((days * capsuleCount) * pricePerCapsule);
            total += priceOrder;
            System.out.printf("The price for the coffee is: $%.2f%n", priceOrder);

        }

        System.out.printf("Total: $%.2f", total);

    }
}
