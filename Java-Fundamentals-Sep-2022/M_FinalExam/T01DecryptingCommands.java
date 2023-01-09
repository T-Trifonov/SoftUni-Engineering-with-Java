package M_FinalExam;

import java.util.Locale;
import java.util.Scanner;

public class T01DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] command = scanner.nextLine().split("\\s+");


        while (!(command[0].equals("Finish"))) {

            if (command[0].equals("Replace")) {

                String currentChar = command[1];
                String newChar = command[2];

                input = input.replace(currentChar, newChar);
                System.out.println(input);

            } else if (command[0].equals("Cut")) {
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);

                if (startIndex >= 0 && endIndex >= 0 && endIndex <= input.length()) {
                    String substring = input.substring(startIndex, (endIndex + 1));

                    if (input.contains(substring)) {
                        input = input.replaceAll(substring, "");
                        System.out.println(input);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                } else {

                    System.out.println("Invalid indices!");
                }

            } else if (command[0].equals("Make")) {

                String makeCommand = command[1];

                if (makeCommand.equals("Upper")) {
                    input = input.toUpperCase();
                } else if (makeCommand.equals("Lower")) {
                    input = input.toLowerCase();
                }

                System.out.println(input);


            } else if (command[0].equals("Check")) {

                String substringCheck = command[1];

                if (input.contains(substringCheck)) {
                    System.out.printf("Message contains %s%n", substringCheck);
                } else {
                    System.out.printf("Message doesn't contain %s%n", substringCheck);
                }

            } else if (command[0].equals("Sum")) {

                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);

                if (startIndex >= 0 && endIndex >= 0 && endIndex <= input.length()) {

                    String substring = input.substring(startIndex, (endIndex + 1));
                    int sum = 0;
                    for (int i = 0; i < substring.length(); i++) {
                        sum += (int) substring.charAt(i);
                    }

                    System.out.println(sum);

                } else {
                    System.out.println("Invalid indices!");
                }


            }

            command = scanner.nextLine().split("\\s+");
        }

    }
}
