package A_BasicSyntaxConditionalStatementsAndLoops.LAB.ADDITIONAL;

import java.util.Scanner;

public class T01SortNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int numFirst = 0;
        int numSecond = 0;
        int numThird = 0;

        boolean isFirst = false;
        boolean isSecond = false;
        boolean isThird = false;

        //max Value Digit
        if (num1 > num2 && num1 > num3) {
            numFirst = num1;
            isFirst = true;
        } else if (num2 > num1 && num2 > num3) {
            numFirst = num2;
            isSecond = true;
        } else if (num3 > num1 && num3 > num2) {
            numFirst = num3;
            isThird = true;
        }


        if (isFirst) {
            if (num2 > num3) {
                numSecond = num2;
                numThird = num3;
            } else {
                numSecond = num3;
                numThird = num2;

            }
        } else if (isSecond) {
            if (num1 > num3) {
                numSecond = num1;
                numThird = num3;
            } else {
                numSecond = num3;
                numThird = num1;

            }
        } else if (isThird) {
            if (num1 > num2) {
                numSecond = num1;
                numThird = num2;
            } else {
                numSecond = num2;
                numThird = num1;

            }

        }

        System.out.println(numFirst);
        System.out.println(numSecond);
        System.out.println(numThird);

    }
}