package A_BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class T03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double pricePerPerson = 0;

        double totalPrice = 0;


        if (typeGroup.equals("Students")) {

            if (day.equals("Friday")) {
                pricePerPerson = 8.45;
            } else if (day.equals("Saturday")) {
                pricePerPerson = 9.80;
            } else if (day.equals("Sunday")) {
                pricePerPerson = 10.46;
            }

        } else if (typeGroup.equals("Business")) {

            if (day.equals("Friday")) {
                pricePerPerson = 10.90;
            } else if (day.equals("Saturday")) {
                pricePerPerson = 15.60;
            } else if (day.equals("Sunday")) {
                pricePerPerson = 16;
            }

        } else if (typeGroup.equals("Regular")) {

            if (day.equals("Friday")) {
                pricePerPerson = 15;
            } else if (day.equals("Saturday")) {
                pricePerPerson = 20;
            } else if (day.equals("Sunday")) {
                pricePerPerson = 22.50;
            }

        }


        if (typeGroup.equals("Students") && people >= 30) {
            totalPrice = people * pricePerPerson * 0.85;
        } else if (typeGroup.equals("Business") && people >= 100) {
            totalPrice = (people * pricePerPerson) - (10 * pricePerPerson);
        } else if (typeGroup.equals("Regular") && people >= 10 && people <= 20) {
            totalPrice = people * pricePerPerson * 0.95;
        } else {
            totalPrice = people * pricePerPerson;
        }

        System.out.printf("Total price: %.2f", totalPrice);

    }
}
