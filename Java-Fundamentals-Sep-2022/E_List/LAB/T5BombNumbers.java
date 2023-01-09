package E_List.LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T5BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        int bombNumber = Integer.parseInt(command.split(" ")[0]);
        int power = Integer.parseInt(command.split(" ")[1]);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == bombNumber) {
                numbers.remove(i);
                int position = i - power;
                if (i > power) {
                    for (int j = 1; j <= power; j++) {
                        numbers.remove(position);
                    }
                } else {
                    numbers.remove(0);
                    position=0;
                }

                if (power<=numbers.size()-1){
                    for (int j = 1; j <=power ; j++) {
                        numbers.remove(position);
                    }
                } else {
                    numbers.remove(numbers.size()-1);
                }

            }

        }

        int sum=0;
        for (int output: numbers) {
            sum+=output;
        }

        System.out.println(sum);

    }
}