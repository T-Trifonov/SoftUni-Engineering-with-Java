package E_List.LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.contains("End")) {

            if (command.contains("Add")) {
                int number = Integer.parseInt((command.split("\\s+"))[1]);
                numbers.add(number);
            } else if (command.contains("Insert")) {
                int number = Integer.parseInt((command.split("\\s+"))[1]);
                int index = Integer.parseInt((command.split("\\s+"))[2]);

                if (isValid(index, numbers)) {
                    numbers.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int index = Integer.parseInt((command.split("\\s+"))[1]);

                if (isValid(index, numbers)) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                int count = Integer.parseInt((command.split("\\s+"))[2]);

                for (int i = 1; i <= count; i++) {
                    int valueZero = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(valueZero);
                }

            } else if (command.contains("Shift right")) {
                int count = Integer.parseInt((command.split("\\s+"))[2]);
                for (int i = 1; i <= count; i++) {
                    int lastValue = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastValue);
                }

            }


            command = scanner.nextLine();

        }

        for (int output: numbers) {
            System.out.print(output+" ");
        }

    }

    public static boolean isValid (int index, List<Integer> numbers){
        return index>=0 && index<=numbers.size()-1;
    }

}
