package B_DataTypesAndVariables;

import java.util.Scanner;

public class T09CenturiesToMinutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short centuries = Short.parseShort(scanner.nextLine());

        int years = centuries * 100;
        double days = years * 365.2422;
        double hour = days * 24;
        double minutes = hour * 60;

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hour, minutes);

    }
}
