package B_DataTypesAndVariables.LAB;

import java.util.Scanner;

public class T11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double snowballValue = 0;
        double maxSnowballValue = Double.MIN_VALUE;
        int maxSnowballSnow = 0;
        int maxSnowBallTime = 0;
        int maxSnowballQuality = 0;

        int snowballs = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= snowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double a = snowballSnow * 1.0 / snowballTime;
            double b = snowballQuality;

            snowballValue = Math.pow(a, b);

            if (snowballValue > maxSnowballValue) {
                maxSnowballValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowBallTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }

        }

        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowBallTime, maxSnowballValue, maxSnowballQuality);

    }

}
