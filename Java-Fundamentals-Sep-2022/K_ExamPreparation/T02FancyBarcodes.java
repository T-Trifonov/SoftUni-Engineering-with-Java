package K_ExamPreparation;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInputs = Integer.parseInt(scanner.nextLine());
        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = null;

        for (int i = 0; i < numInputs; i++) {

            String input = scanner.nextLine();

            matcher = pattern.matcher(input);

            if (matcher.find()) {
                StringBuilder string = new StringBuilder();

                for (int j = 0; j < input.length(); j++) {
                    char symbol = input.charAt(j);

                    if (Character.isDigit(symbol)) {
                        string.append(symbol);

                    }

                }

                if (string.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", string.toString());
                }

            } else {
                System.out.println("Invalid barcode");
            }


        }

    }

}
