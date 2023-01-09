package L_RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";

        List<String> register = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            register.add(matcher.group());
        }

        System.out.println(String.join(", ", register));

    }
}
