package A_StacksAndQueues.LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder currentText = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {

            String[] command = scanner.nextLine().split("\\s+");

            switch (command[0]) {
                case ("1"):
                    stack.push(currentText.toString());
                    String textToAppend = command[1];
                    currentText.append(textToAppend);

                    break;

                case ("2"):

                    if (currentText.length()>0) {
                        stack.push(currentText.toString());
                    }

                    int count = Integer.parseInt(command[1]);
                    int startIndexDelete = currentText.length() - count;
                    currentText.delete(startIndexDelete, currentText.length());

                    break;

                case ("3"):

                    int index = Integer.parseInt(command[1]);
                    System.out.println(currentText.charAt(index - 1));

                    break;

                case ("4"):
                    if (!stack.isEmpty()) {

                        String last = stack.pop();
                        currentText = new StringBuilder(last);
                    }

                    break;

            }

        }

    }
}
