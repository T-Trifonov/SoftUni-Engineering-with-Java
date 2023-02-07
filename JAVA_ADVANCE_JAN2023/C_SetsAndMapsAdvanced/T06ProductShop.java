package C_SetsAndMapsAdvanced;

import java.util.*;

public class T06ProductShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> base = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Revision")) {

            String shop = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);

            if (base.containsKey(shop)) {

                base.get(shop).put(product, price);

            } else {

                base.put(shop, new LinkedHashMap<>());
                base.get(shop).put(product, price);

            }


            input = scanner.nextLine();
        }

        for (String marketShop : base.keySet()) {
            System.out.println(marketShop + "->");
            for (String productInShop : base.get(marketShop).keySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", productInShop,
                        base.get(marketShop).get(productInShop));

            }

        }

    }

}
