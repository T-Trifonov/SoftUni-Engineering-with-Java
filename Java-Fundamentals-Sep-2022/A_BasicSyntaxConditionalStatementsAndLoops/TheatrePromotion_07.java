package A_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int priceTicket=0;
        boolean isError=false;

        if (age>=0 && age<=18){
            if (typeDay.equals("Weekday")){
                priceTicket=12;
            } else if (typeDay.equals("Weekend")){
                priceTicket=15;
            } else if ( typeDay.equals("Holiday")){
                priceTicket=5;
            } else {
                isError = true;
            }
        } else if (age>18 && age<=64){
            if (typeDay.equals("Weekday")){
                priceTicket=18;
            } else if (typeDay.equals("Weekend")){
                priceTicket=20;
            } else if ( typeDay.equals("Holiday")){
                priceTicket=12;
            } else {
                isError = true;
            }
        }else if (age>64 && age<=122){
            if (typeDay.equals("Weekday")){
                priceTicket=12;
            } else if (typeDay.equals("Weekend")){
                priceTicket=15;
            } else if ( typeDay.equals("Holiday")){
                priceTicket=10;
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (!isError) {
            System.out.println(priceTicket+"$");
        } else {
            System.out.println("Error!");
        }

    }
}
