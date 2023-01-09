package E_List.LAB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberCommand = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();

        for (int i = 1; i <= numberCommand; i++) {
            String command = scanner.nextLine();
            List<String> input = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String name = input.get(0);

            if (input.size() == 3) {

                if (names.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    names.add(name);
                }


            } else if (input.size() == 4) {
                if (names.contains(name)) {
                    names.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }


        }

        for (String output: names) {
            System.out.println(output);
        }

    }
}
