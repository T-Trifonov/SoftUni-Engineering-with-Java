package A_BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class T05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        String password = "";
        int counter = 0;

        for (int i = userName.length() - 1; i >= 0; i--) {
            char currentSymbol = userName.charAt(i);
            password += currentSymbol;
        }

        String enteredPassword = scanner.nextLine();


        while (!enteredPassword.equals(password)) {
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }

            System.out.println("Incorrect password. Try again.");

            enteredPassword = scanner.nextLine();

        }

        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", userName);
        }

    }
}
