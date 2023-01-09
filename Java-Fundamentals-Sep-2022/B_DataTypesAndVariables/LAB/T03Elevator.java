package B_DataTypesAndVariables.LAB;

import java.util.Scanner;

public class T03Elevator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        int capacityElevator = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", Math.ceil(persons*1.0/capacityElevator));

    }

}
