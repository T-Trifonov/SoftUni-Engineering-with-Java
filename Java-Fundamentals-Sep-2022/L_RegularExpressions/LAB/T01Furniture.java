package L_RegularExpressions.LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice=0;
        List<String> furnitureList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!(input.equals("Purchase"))){

            String regex="(>>)(?<furniture>[A-Za-z]+)(<<)(?<price>[0-9]+[.]?[0-9]*)(!)(?<quantity>\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher= pattern.matcher(input);

            while (matcher.find()){

                String furniture = matcher.group("furniture");
                double priceFurniture = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitureList.add(furniture);
                totalPrice+=priceFurniture*quantity;

            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furnitureList.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);

    }
}
