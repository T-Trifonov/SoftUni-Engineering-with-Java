package Z_JavaAdvancedExam_1;

import java.util.*;

public class T01EnergyDrinks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] milligramsOfCaffeine = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();
        int[] sequenceOfEnergyDrinks = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> caffeine = new ArrayDeque<Integer>();
        ArrayDeque<Integer> energyDrinks = new ArrayDeque<Integer>();

        int stamatCaffeineLevel = 0;
        int maxStamatCaffeineLevel = 300;

        for (int i = milligramsOfCaffeine.length - 1; i >= 0; i--) {
            caffeine.offer(milligramsOfCaffeine[i]);
        }

        for (int i = sequenceOfEnergyDrinks.length - 1; i >= 0; i--) {
            energyDrinks.push(sequenceOfEnergyDrinks[i]);
        }

        while (!caffeine.isEmpty()) {

            if (energyDrinks.isEmpty()){

                break;

            }

            int tempCaffeine = (caffeine.poll()) * (energyDrinks.peek());
            stamatCaffeineLevel += tempCaffeine;


            if (stamatCaffeineLevel <= maxStamatCaffeineLevel) {

                energyDrinks.pop();


            } else {

                stamatCaffeineLevel -= 30 + tempCaffeine;

                if (stamatCaffeineLevel<0){

                    stamatCaffeineLevel=0;

                }

                int moveElement = energyDrinks.pop();
                energyDrinks.addLast(moveElement);


            }


        }

        if (!energyDrinks.isEmpty()) {

            System.out.print("Drinks left: ");

            while (energyDrinks.size() > 1) {

                System.out.print(energyDrinks.poll() + ", ");
            }

            System.out.println(energyDrinks.poll());

        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.", stamatCaffeineLevel);

    }

}


