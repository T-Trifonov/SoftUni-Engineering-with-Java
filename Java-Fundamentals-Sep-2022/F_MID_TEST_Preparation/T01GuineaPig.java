package F_MID_TEST_Preparation;

import java.util.Scanner;

public class T01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthFoodKG = Double.parseDouble(scanner.nextLine());
        double hayFoodKG = Double.parseDouble(scanner.nextLine());
        double coverFoodKG = Double.parseDouble(scanner.nextLine());
        double petWeight = Double.parseDouble(scanner.nextLine());

        double monthFoodG = monthFoodKG * 1000;
        double hayFoodG = hayFoodKG * 1000;
        double coverFoodG = coverFoodKG * 1000;
        double petWeightG = petWeight * 1000;

        for (int i = 1; i <= 30; i++) {
            monthFoodG = monthFoodG - 300;
            if (i % 2 == 0) {
                hayFoodG = hayFoodG - (monthFoodG * 0.05);
            }

            if (i % 3 == 0) {
                coverFoodG = coverFoodG - (petWeightG / 3);
            }

        }

        if (monthFoodG > 0 && hayFoodG > 0 && coverFoodG > 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", monthFoodG / 1000, hayFoodG / 1000, coverFoodG / 1000);
        } else {
            System.out.printf("Merry must go to the pet store!");
        }

    }
}
