package B_DataTypesAndVariables.LAB;

import java.util.Scanner;

public class T09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterDays = 0;
        int extractedAmount = 0;

        int extractedAmountDayOne = Integer.parseInt(scanner.nextLine());

        while (extractedAmountDayOne >= 100) {

            counterDays++;
            extractedAmount += extractedAmountDayOne;

            if (extractedAmount > 26){
                extractedAmount-=26;
            }

            extractedAmountDayOne -= 10;
        }

        if (extractedAmount > 26){
            extractedAmount-=26;
        }

        System.out.println(counterDays);
        System.out.println(extractedAmount);

    }
}
