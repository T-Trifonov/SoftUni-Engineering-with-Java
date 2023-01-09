package F_MID_TEST_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> journalList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {


            if (command.contains("Collect")) {

                String item = command.split(" - ")[1];

                if (!(journalList.contains(item))) {
                    journalList.add(item);
                }

            }

            if (command.contains("Drop")) {

                String item = command.split(" - ")[1];

                journalList.remove(item);

            }


            if (command.contains("Combine Items")){

                String item = command.split(" - ")[1];

                String oldItem = item.split(":")[0];
                String newItem = item.split(":")[1];

                if (journalList.contains(oldItem)) {

                    int indexOldItem = journalList.indexOf(oldItem);
                    journalList.add(indexOldItem + 1, newItem);

                }

            }

            if (command.contains("Renew")){

                String item = command.split(" - ")[1];

                if (journalList.contains(item)) {

                    journalList.remove(item);
                    journalList.add(item);

                }
            }



            command = scanner.nextLine();

        }

        System.out.println(String.join(", ", journalList));

    }
}
