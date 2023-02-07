package Z_JavaAdvancedExam_2;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class T01KAT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Queue<Integer> plates = new ArrayDeque<>();
        ArrayDeque<Integer> cars = new ArrayDeque<>();

        String[] inputPlates = scanner.nextLine().split(", ");
        String[] inputCars = scanner.nextLine().split(", ");

        for (String current : inputPlates) {
            plates.offer(Integer.parseInt(current));
        }

        for (String current : inputCars) {
            cars.push(Integer.parseInt(current));
        }

        int days = 0;
        int registeredCars = 0;
        while (plates.size() != 0 && cars.size() != 0) {

            int tempPlates = (plates.poll()) / 2;
            int tempCars = cars.pop();
            int tempValue = 0;

            if (tempPlates - tempCars > 0) {
                tempValue = (tempPlates - tempCars) * 2;
                plates.offer(tempValue);
                registeredCars += tempCars;
            } else if (tempCars - tempPlates > 0) {
                tempValue = tempCars - tempPlates;
                cars.addLast(tempValue);
                registeredCars += tempPlates;
            } else {
                registeredCars+=tempCars;
            }

            days++;

        }

        System.out.printf("%d cars were registered for %d days!%n", registeredCars, days);

        if (plates.size() != 0) {
            int sum = plates.stream().mapToInt(el -> el).sum();
            System.out.printf("%d license plates remain!%n", sum);
        } else if (cars.size() != 0) {
            int sum = cars.stream().mapToInt(el -> el).sum();
            System.out.printf("%d cars remain without license plates!%n", sum);
        } else if (plates.size() == 0 && cars.size() == 0) {
            System.out.println("Good job! There is no queue in front of the KAT!");
        }
    }

}
