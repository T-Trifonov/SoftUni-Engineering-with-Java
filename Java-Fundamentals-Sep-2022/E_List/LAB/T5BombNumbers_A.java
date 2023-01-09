package E_List.LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T5BombNumbers_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positionLeft = 0;
        int positionRight = 0;

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        int bombNumber = Integer.parseInt(command.split("\\s+")[0]);
        int power = Integer.parseInt(command.split("\\s+")[1]);

        while (numbers.contains(bombNumber)) {

            int i = numbers.indexOf(bombNumber);

            if ((i - power) >= 0) {
                positionLeft = i - power;
            } else {
                positionLeft = 0;
            }

            if ((i + power) <= (numbers.size() - 1)) {
                positionRight = i + power;
            } else {
                positionRight = numbers.size() - 1;
            }


            for (int j = positionRight; j >= positionLeft; j--) {
                numbers.remove(positionLeft);

            }


        }

        int sum = 0;
        for (int output : numbers) {
            sum += output;
        }

        System.out.println(sum);

    }
}