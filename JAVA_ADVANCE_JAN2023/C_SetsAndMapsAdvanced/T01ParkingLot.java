package C_SetsAndMapsAdvanced;

import java.util.*;

public class T01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> base = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("END")){

            String[] inputDetail = input.split(", ");

            String action = inputDetail[0];
            String carIDNumber = inputDetail[1];

            if (action.equals("IN")){

                base.add(carIDNumber);

            } else if (action.equals("OUT")){

                base.remove(carIDNumber);

            }

            input = scanner.nextLine();
        }

        if (base.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            base.forEach(System.out::println);
        }

    }
}
