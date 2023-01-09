package A_BasicSyntaxConditionalStatementsAndLoops.LAB.ADDITIONAL;

import java.util.Scanner;

public class T03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();

        double balance = money;
        double totalForGames = 0;

        while (!game.equals("Game Time")) {


            if (game.equals("OutFall 4")) {
                if (balance >= 39.99) {
                    balance -= 39.99;
                    totalForGames += 39.99;
                    System.out.printf("Bought %s%n", game);
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("CS: OG")) {
                if (balance >= 15.99) {
                    balance -= 15.99;
                    totalForGames += 15.99;
                    System.out.printf("Bought %s%n", game);
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("OutFall 4")) {
                if (balance >= 39.99) {
                    balance -= 39.99;
                    totalForGames += 39.99;
                    System.out.printf("Bought %s%n", game);
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("Zplinter Zell")) {
                if (balance >= 19.99) {
                    balance -= 19.99;
                    totalForGames += 19.99;
                    System.out.printf("Bought %s%n", game);
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("Honored 2")) {
                if (balance >= 59.99) {
                    balance -= 59.99;
                    totalForGames += 59.99;
                    System.out.printf("Bought %s%n", game);
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("RoverWatch")) {
                if (balance >= 29.99) {
                    balance -= 29.99;
                    totalForGames += 29.99;
                    System.out.printf("Bought %s%n", game);
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("RoverWatch Origins Edition")) {
                if (balance >= 39.99) {
                    balance -= 39.99;
                    totalForGames += 39.99;
                    System.out.printf("Bought %s%n", game);
                } else {
                    System.out.println("Too Expensive");
                }
            } else {
                System.out.println("Not Found");
            }

            if (balance == 0) {
                System.out.println("Out of money!");
                break;
            }


            game = scanner.nextLine();
        }

        if (balance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalForGames, balance);
        }

    }
}
