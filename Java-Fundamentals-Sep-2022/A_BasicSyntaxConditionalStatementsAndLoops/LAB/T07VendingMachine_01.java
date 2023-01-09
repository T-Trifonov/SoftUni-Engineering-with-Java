package A_BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class T07VendingMachine_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sumCoins = 0;
        double priceProduct = 0;

        boolean isProduct = true;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sumCoins += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            input = scanner.nextLine();
        }

        while (!input.equals("End")) {

            if (input.equals("Start")) {
                input = scanner.nextLine();
                continue;
            }

            if (input.equals("Nuts")) {
                priceProduct = 2;
            } else if (input.equals("Water")) {
                priceProduct = 0.7;
            } else if (input.equals("Crisps")) {
                priceProduct = 1.5;
            } else if (input.equals("Soda")) {
                priceProduct = 0.8;
            } else if (input.equals("Coke")) {
                priceProduct = 1.0;
            } else {
                isProduct = false;
                System.out.println("Invalid product");
            }

            if (sumCoins >= priceProduct && sumCoins != 0 && isProduct) {
                System.out.printf("Purchased %s%n", input);
                sumCoins -= priceProduct;
            } else {
                if (isProduct) {
                    priceProduct=0;
                    System.out.println("Sorry, not enough money");
                } else {
                    input = scanner.nextLine();
                    continue;
                }

            }

            input = scanner.nextLine();

        }

        System.out.printf("Change: %.2f", sumCoins);

    }

}




