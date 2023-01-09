package E_List.LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T01Train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Add")) {
                int newWagon = Integer.parseInt(command.split(" ")[1]);
                wagons.add(newWagon);
            } else {

                int pasangers = Integer.parseInt(command);
                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);
                    if (currentWagon<=maxCapacity && maxCapacity-currentWagon>=pasangers){
                        wagons.set(i, currentWagon+pasangers);
                        break;
                    }
                    
                }

            }

            command = scanner.nextLine();

        }

        for (int wagonsResult: wagons) {
            System.out.print(wagonsResult+" ");
        }

    }
}
