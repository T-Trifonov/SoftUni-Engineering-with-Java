package B_DataTypesAndVariables.LAB;

import java.util.Scanner;

public class T10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokeCounter = 0;

        int pokePower = Integer.parseInt(scanner.nextLine()); // N
        int distance = Integer.parseInt(scanner.nextLine()); //M
        int exhaustionFactor = Integer.parseInt(scanner.nextLine()); //Y

        int pokePowerRemain = pokePower;
        double reducedPowerPercentage = 0;

        while (pokePowerRemain >= distance) {

            pokePowerRemain = pokePowerRemain - distance;
            pokeCounter++;

            if (pokePowerRemain != 0 && pokePower!=0) {
                reducedPowerPercentage = pokePowerRemain*1.0 / pokePower;
            }

            if (reducedPowerPercentage == 0.5 && pokePowerRemain!=0 && exhaustionFactor!=0) {
                pokePowerRemain = pokePowerRemain / exhaustionFactor;
            }

        }

        System.out.println(pokePowerRemain);
        System.out.println(pokeCounter);

    }
}
