package A_BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class T11RageExpenses_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int gamesQty = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int timesHeadsetBroken = 0;
        int timesMouseBroken = 0;
        int timesKeyboardBroken = 0;
        int timesDisplayBroken = 0;
        int displayCounter=0;

        for (int i = 1; i <= gamesQty; i++) {
                if (i%2==0) {
                    timesHeadsetBroken++;
                }
                if (i%3==0) {
                    timesMouseBroken++;
                }
                if (i%2==0 && i%3==0) {
                    timesKeyboardBroken++;
                    displayCounter++;
                }

                if (displayCounter==2){
                    timesDisplayBroken++;
                    displayCounter=0;
                }
        }

       double total = (timesHeadsetBroken*headsetPrice) + (timesMouseBroken*mousePrice)+(timesKeyboardBroken*keyboardPrice)+(timesDisplayBroken*displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", total);

    }
}
