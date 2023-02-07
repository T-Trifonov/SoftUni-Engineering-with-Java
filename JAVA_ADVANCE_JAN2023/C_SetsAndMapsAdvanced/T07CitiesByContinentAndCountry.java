package C_SetsAndMapsAdvanced;

import java.util.*;

public class T07CitiesByContinentAndCountry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> base = new LinkedHashMap<>();

        int numInputs = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < numInputs; i++) {
            String input = scanner.nextLine();

            String continent = input.split("\\s+")[0];
            String country = input.split("\\s+")[1];
            String city = input.split("\\s+")[2];

            base.putIfAbsent(continent, new LinkedHashMap<>());

            base.get(continent).putIfAbsent(country, new ArrayList<>());

            base.get(continent).get(country).add(city);

        }

        for (String continentOutput : base.keySet()) {
            System.out.println(continentOutput + ":");

            for (String countryOutput : base.get(continentOutput).keySet()) {
                System.out.print("  " + countryOutput + " -> ");

                for (int i = 0; i < base.get(continentOutput).get(countryOutput).size(); i++) {
                    System.out.print(base.get(continentOutput).get(countryOutput).get(i));
                    if ((base.get(continentOutput).get(countryOutput).size()==i+1)){
                        System.out.print("");
                    }else {
                        System.out.print(", ");
                    }
                }

                System.out.println();

            }

        }


    }
}
