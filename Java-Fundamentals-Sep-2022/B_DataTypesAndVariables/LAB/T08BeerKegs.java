package B_DataTypesAndVariables.LAB;

import java.util.Scanner;

public class T08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxVolume = Double.MIN_VALUE;
        String nameBiggestKeg = "";

        int kegs = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= kegs; i++) {

            String kegName = scanner.nextLine();
            double radiusKeg = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volumeKeg = Math.PI * Math.pow(radiusKeg, 2) * height;

            if (volumeKeg > maxVolume) {
                maxVolume = volumeKeg;
                nameBiggestKeg = kegName;
            }

        }

        System.out.println(nameBiggestKeg);

    }
}
