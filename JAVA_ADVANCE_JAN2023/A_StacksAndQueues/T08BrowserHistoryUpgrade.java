package A_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class T08BrowserHistoryUpgrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        String currentInput = scanner.nextLine();

        while (!currentInput.equals("Home")) {

            if (currentInput.equals("back")) {
                if (history.isEmpty() || history.size() == 1) {
                    System.out.println("no previous URLs");
                    currentInput = scanner.nextLine();
                    continue;

                }

                String currentURL = history.pop();
                forward.push(currentURL);
                System.out.println(history.peek());

            } else if (currentInput.equals("forward")) {
                if (forward.isEmpty()) {
                    System.out.println("no next URLs");
                    currentInput = scanner.nextLine();
                    continue;

                }

                String currentForward = forward.pop();
                System.out.println(currentForward);
                history.push(currentForward);

            } else {

                history.push(currentInput);
                System.out.println(currentInput);
                forward.clear();

            }


            currentInput = scanner.nextLine();
        }


    }

}
