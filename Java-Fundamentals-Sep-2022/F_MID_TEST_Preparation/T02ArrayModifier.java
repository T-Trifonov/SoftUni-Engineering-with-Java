package F_MID_TEST_Preparation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class T02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.split("\\s+")[0].equals("end")) {


            switch (command.split("\\s+")[0]) {

                case ("swap"):

                    int indexOne = Integer.parseInt(command.split("\\s+")[1]);
                    int indexTwo = Integer.parseInt(command.split("\\s+")[2]);

                    int temp= array[indexOne];
                    array[indexOne] = array[indexTwo];
                    array[indexTwo] = temp;

                    break;

                case ("multiply"):

                    int indexOne1 = Integer.parseInt(command.split("\\s+")[1]);
                    int indexTwo2 = Integer.parseInt(command.split("\\s+")[2]);

                    array[indexOne1] = array[indexOne1] * array[indexTwo2];

                    break;

                case ("decrease"):

                    for (int i = 0; i < array.length; i++) {
                        array[i] = array[i] - 1;
                    }

                    break;

            }


            command = scanner.nextLine();

        }

        for (int i = 0; i < array.length; i++) {

            if (!(i == array.length - 1)) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[array.length - 1]);
            }

        }

    }

}

