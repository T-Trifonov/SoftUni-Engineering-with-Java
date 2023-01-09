package D_Methods;

import java.util.Scanner;

public class T04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (command.equals("add")) {
            add(num1, num2);
        } else if (command.equals("multiply")) {
            multiply(num1, num2);
        } else if (command.equals("subtract")) {
            subtract(num1, num2);
        } else if (command.equals("divide")) {
            divide(num1, num2);
        }

    }

    public static void add(int n1, int n2) {

        System.out.printf("%d", n1 + n2);

    }

    public static void multiply(int n1, int n2) {

        System.out.printf("%d", n1 * n2);

    }

    public static void subtract(int n1, int n2) {

        System.out.printf("%d", n1 - n2);

    }

    public static void divide(int n1, int n2) {

        System.out.printf("%d", n1 / n2);

    }


}
