package D_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class T10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d", (evenSum(number)*oddSum(number)));

    }

    public static int evenSum(int number){

        int tempDigit=0;
        int sumEvenDigit=0;

        while(Math.abs(number)>0) {

            tempDigit = number%10;

            if (tempDigit%2==0){
                sumEvenDigit+=tempDigit;
            }

            number = number/10;
        }

        return sumEvenDigit;
    }

    public static int oddSum(int number){

        int tempDigit=0;
        int sumOddDigit=0;

        while(Math.abs(number)>0) {

            tempDigit = number%10;

            if (tempDigit%2!=0){
                sumOddDigit+=tempDigit;
            }

            number = number/10;
        }

        return sumOddDigit;
    }


}
