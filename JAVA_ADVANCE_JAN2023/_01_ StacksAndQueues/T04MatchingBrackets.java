import java.util.ArrayDeque;
import java.util.Scanner;

public class T04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> positions = new ArrayDeque<>();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                positions.push(i);

            } else if (input.charAt(i) == ')') {
                int startPosition = positions.pop();

                String output = input.substring(startPosition, i+1);
                System.out.println(output);

            }
        }

    }
}
