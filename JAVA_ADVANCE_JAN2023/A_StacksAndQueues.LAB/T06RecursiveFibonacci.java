package A_StacksAndQueues.LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T06RecursiveFibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Long> stack = new ArrayDeque<>();

        stack.push(0L);
        stack.push(1L);
        if (num < 2) {
            System.out.println("1");
        }
        for (int i = 0; i < num; i++) {
            long number1 = stack.pop();
            long number2 = stack.pop();
            stack.push(number1);
            stack.push(number1 + number2);
        }
        System.out.println(stack.pop());


    }

}
