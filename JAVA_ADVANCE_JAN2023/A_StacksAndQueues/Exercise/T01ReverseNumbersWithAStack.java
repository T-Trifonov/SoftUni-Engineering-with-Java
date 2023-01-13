package A_StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T01ReverseNumbersWithAStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> numbers =new ArrayDeque<>();

        String input = scanner.nextLine();

        String[] numbersInput = input.split("\\s+");

        for (int i = 0; i < numbersInput.length ; i++) {
            int tempNum = Integer.parseInt(numbersInput[i]);
            numbers.push(tempNum);
        }

        while (!numbers.isEmpty()){
            System.out.print(numbers.pop()+" ");
        }

    }
}
