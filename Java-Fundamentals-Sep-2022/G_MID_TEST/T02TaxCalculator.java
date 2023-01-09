package G_MID_TEST;

import java.sql.Array;
import java.util.Scanner;

public class T02TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tax = 0;
        double totalTax = 0;

        boolean isAvailableCar=true;

        String[] array = (scanner.nextLine().split(">>"));

        for (int i = 0; i < array.length; i++) {
            String carType = array[i].split(" ")[0];
            double yearsTax = Double.parseDouble(array[i].split(" ")[1]);
            double kilometers = Double.parseDouble(array[i].split(" ")[2]);


            if (carType.equals("family")) {
                tax = mileageTax(kilometers,3000) * 12 + (50 - yearsTax * 5);
            } else if (carType.equals("heavyDuty")) {
                tax = mileageTax(kilometers,9000) * 14 + (80 - yearsTax * 8);
            } else if (carType.equals("sports")) {
                tax = mileageTax(kilometers,2000) * 18 + (100 - yearsTax * 9);
            } else {
                System.out.println("Invalid car type.");
                isAvailableCar=false;
            }

            if (isAvailableCar) {
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, tax);
            } else {
                isAvailableCar = true;
            }

            totalTax+=tax;
            tax=0;

        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.",totalTax);

    }

    public static double mileageTax(double mileage, double mileagePerYear){
        double coefficient=1;
        if ((mileage/mileagePerYear)>0){
            coefficient=Math.floor(mileage/mileagePerYear);
        }

        return coefficient;
    }
}
