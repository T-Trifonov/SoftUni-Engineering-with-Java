package K_ExamPreparation.LAB;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCalories = 0;

        StringBuilder output = new StringBuilder();

        String input = scanner.nextLine();

        String regex = "(#|\\|)(?<food>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {


            String foodName = matcher.group("food");
            String expDate = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            totalCalories += calories;

            output.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", foodName, expDate, calories));


        }

        System.out.printf("You have food to last you for: %d days!%n", totalCalories/2000);
        System.out.println(output);

    }

}
