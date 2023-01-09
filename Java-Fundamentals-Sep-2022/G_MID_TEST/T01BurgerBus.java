package G_MID_TEST;

import java.util.Scanner;

public class T01BurgerBus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double profit = 0;
        double totalProfit = 0;

        int numbersCity = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numbersCity; i++) {
            String city = scanner.nextLine();

            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            if (i % 5 == 0) {
                profit = income * 0.9 - expenses;
            } else if (i % 3 == 0) {
                if (i % 5 != 0) {
                    profit = income - (expenses * 1.5);
                }

            } else {
                profit = income - expenses;
        }

        System.out.printf("In %s Burger Bus earned %.2f leva.%n", city, profit);

        totalProfit += profit;
        profit = 0;

    }

        System.out.printf("Burger Bus total profit: %.2f leva.",totalProfit);


}
}
