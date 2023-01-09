package D_Methods;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class T08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double powerNumber = Double.parseDouble(scanner.nextLine());

        double result = mathPower(number, powerNumber);

        DecimalFormat output = new DecimalFormat("0.####");
        System.out.println(output.format(result));

    }

    public static double mathPower(double number, double power) {

        double result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        return result;

    }

}
