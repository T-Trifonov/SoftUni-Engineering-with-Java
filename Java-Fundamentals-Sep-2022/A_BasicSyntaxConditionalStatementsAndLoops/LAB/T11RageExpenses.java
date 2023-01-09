package A_BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class T11RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int gamesQty = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int timesHeadsetBroken = gamesQty / 2;
        int timesMouseBroken = gamesQty / 3;
        int timesKeyboardBroken = gamesQty/6;
        int timesDisplayBroken = gamesQty/12;

        double total = (timesHeadsetBroken*headsetPrice) + (timesMouseBroken*mousePrice)+(timesKeyboardBroken*keyboardPrice)+(timesDisplayBroken*displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", total);


    }
}
