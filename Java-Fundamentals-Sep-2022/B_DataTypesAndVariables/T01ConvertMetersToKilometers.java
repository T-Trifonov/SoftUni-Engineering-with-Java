package B_DataTypesAndVariables;

import java.util.Scanner;

public class T01ConvertMetersToKilometers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short metersInput = Short.parseShort(scanner.nextLine());

        double kilometersOutput = metersInput / 1000.0;

        System.out.printf("%.2f", kilometersOutput);

    }
}
