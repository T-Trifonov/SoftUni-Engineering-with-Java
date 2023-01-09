package B_DataTypesAndVariables.LAB;

import java.util.Scanner;

public class T07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEntry = Integer.parseInt(scanner.nextLine());

        int tempVolume = 0;

        for (int i = 1; i <= numberOfEntry; i++) {

            int entryVolume = Integer.parseInt(scanner.nextLine());
            tempVolume += entryVolume;
            if (tempVolume <= 255) {
                continue;
            } else {
                tempVolume -= entryVolume;
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.println(tempVolume);

    }

}


