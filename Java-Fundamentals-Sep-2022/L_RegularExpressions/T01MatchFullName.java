package L_RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T01MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "\\b(?<firstName>[A-Z][a-z]+)( )(?<familyName>[A-Z][a-z]+)\\b";
        Pattern pattern =  Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }

    }
}
