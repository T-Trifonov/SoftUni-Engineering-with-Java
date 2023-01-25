import java.util.ArrayDeque;
import java.util.Scanner;

public class T02SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        String command = "";
        int firstValue = 0;
        int secondValue = 0;
        int counter = 1;


        ArrayDeque<String> stack = new ArrayDeque<>();

        String inputString = scanner.nextLine();

        String[] input = inputString.split("\\s+");

        for (int i = input.length - 1; i >= 0; i--) {
            stack.push(input[i]);
        }

        while (!stack.isEmpty()) {

            String symbol = stack.peek();

            if (counter==1){
                firstValue = Integer.parseInt(symbol);
            }

            if (counter==2){
                if (symbol.equals("+")) {
                    command = "add";
                } else if (symbol.equals("-")) {
                    command = "subtraction";
                } else {
                    System.out.println("Unknown operation");
                }
            }

            if (counter==3){
                secondValue = Integer.parseInt(symbol);
                if (command.equals("add")){
                    sum = firstValue+secondValue;
                } else if (command.equals("subtraction")){
                    sum = firstValue-secondValue;
                }

                counter=1;
                firstValue = sum;

            }

            stack.pop();
            counter+=1;

        }

        System.out.println(sum);

    }

}
