package A_StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> openBracketStack = new ArrayDeque<>();

        boolean isBalanced = false;

        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                openBracketStack.push(bracket);

            } else if (bracket == ')' || bracket == ']' || bracket == '}') {

                if (openBracketStack.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                char lastOpenBracket = openBracketStack.pop();

                if (lastOpenBracket == '(' && bracket == ')') {
                    isBalanced = true;
                } else if (lastOpenBracket == '[' && bracket == ']') {
                    isBalanced = true;

                } else if (lastOpenBracket == '{' && bracket == '}') {
                    isBalanced = true;
                } else {
                    isBalanced = false;
                    break;
                }

            }

        }

        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}

