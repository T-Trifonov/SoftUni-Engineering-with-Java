package L_RegularExpressions.LAB;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class T02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> racers = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Map<String, Integer> registerRacers = new LinkedHashMap<>();
        List<String> registerRacersTop = new ArrayList<>();

        for (String output : racers) {
            registerRacers.putIfAbsent(output, 0);
        }

        String name = "";
        int tempSum = 0;


        String input = scanner.nextLine();

        while (!(input.equals("end of race"))) {

            String regexLetter = "[A-Za-z]";
            Pattern patternLetter = Pattern.compile(regexLetter);
            Matcher matcherLetter = patternLetter.matcher(input);

            String regexDigit = "[0-9]";
            Pattern patternDigit = Pattern.compile(regexDigit);
            Matcher matcherDigit = patternDigit.matcher(input);

            while (matcherLetter.find()) {
                name += matcherLetter.group();
            }

            while (matcherDigit.find()) {
                tempSum += Integer.parseInt(matcherDigit.group());
            }

            if (registerRacers.containsKey(name)) {
                int currentValue = registerRacers.get(name);
                registerRacers.put(name, (currentValue + tempSum));
            }

            name = "";
            tempSum = 0;


            input = scanner.nextLine();
        }

        int tempValue = 0;
        String tempName = "";
        int counter = 0;

        while (!(counter == 3)) {

            for (Map.Entry<String, Integer> winners : registerRacers.entrySet()) {
                int currentValuesRacer = winners.getValue();

                if (currentValuesRacer > tempValue) {
                    tempValue = currentValuesRacer;
                    tempName = winners.getKey();
                }

            }

            registerRacersTop.add(tempName);
            registerRacers.remove(tempName);

            counter++;
            tempValue = 0;
            tempName = "";

        }

        System.out.println("1st place: " + registerRacersTop.get(0));
        System.out.println("2nd place: " + registerRacersTop.get(1));
        System.out.println("3rd place: " + registerRacersTop.get(2));


    }
}
