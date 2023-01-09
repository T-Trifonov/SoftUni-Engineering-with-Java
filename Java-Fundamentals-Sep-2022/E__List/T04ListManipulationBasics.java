package E__List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")){

            if (command[0].contains("Add")){

                int valueToAdd = Integer.parseInt(command[1]);
                listNumbers.add(valueToAdd);

            }

            if (command[0].equals("Remove")){

                int number = Integer.parseInt(command[1]);
                int index = listNumbers.indexOf(number);
                if (!(index==-1)){
                    listNumbers.remove(index);
                }


            }

            if (command[0].contains("RemoveAt")){

                int index = Integer.parseInt(command[1]);
                listNumbers.remove(index);

            }

            if (command[0].contains("Insert")){

                int number = Integer.parseInt(command[1]);
                int index = Integer.parseInt(command[2]);
                listNumbers.add(index, number);

            }

            command = scanner.nextLine().split(" ");

        }

        System.out.println(listNumbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
