package M_FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumbers = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= inputNumbers; i++) {

            String inputCommand = scanner.nextLine();

            //String regex = "(!)(?<command>[A-Z][a-z]{2,})(!)(:)(\\[)(?<text>[A-Za-z]{8,})(\\\\])";
            String regexCommand = "(!)(?<command>[A-Z][a-z]{2,})(!)";
            String regexText = "(?<text>[A-Za-z]{8,})";

            Pattern patternCommand = Pattern.compile(regexCommand);
            Matcher matcherCommand = patternCommand.matcher(inputCommand);

            Pattern patternText = Pattern.compile(regexText);
            Matcher matcherText = patternText.matcher(inputCommand);

            if (matcherCommand.find() && matcherText.find()) {

                String command = matcherCommand.group("command");
                String text = matcherText.group("text");

                String code = "";

                for (int j = 0; j < text.length(); j++) {
                    code += (" " + ((int) text.charAt(j)));

                }

                System.out.println(command + ":" + code);

            } else {

                System.out.println("The message is invalid");

            }


        }

    }
}
