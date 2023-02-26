package T04TrafficLights;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputPattern = scanner.nextLine().split("\\s+");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < inputPattern.length; j++) {
                System.out.print(SystemTrafficLight.next(inputPattern[j]) + " ");
                inputPattern[j] = SystemTrafficLight.next(inputPattern[j]);

            }

            System.out.println();

        }

    }

}
