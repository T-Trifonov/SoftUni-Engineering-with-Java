package J_MapsLambdaAndStreamAPI.LAB;

import java.util.*;

public class T03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> totalPriceProduct = new ArrayList<>();
        Map<String, Double> itemPrice = new LinkedHashMap<>();
        Map<String, Integer> itemQty = new LinkedHashMap<>();

        String[] item = scanner.nextLine().split("\\s+");

        while (!item[0].equals("buy")) {

            String product = item[0];
            Double productPrice = Double.parseDouble(item[1]);
            int productQty = Integer.parseInt(item[2]);

            if (!(totalPriceProduct.contains(product))) {
                totalPriceProduct.add(product);
            }

            itemPrice.put(product, productPrice);

//            if (!(itemPrice.containsKey(product))) {
//                itemPrice.put(product, productPrice);
//            } else {
//                itemPrice.put(product, productPrice);
//            }

            if (!(itemQty.containsKey(product))) {
                itemQty.put(product, productQty);
            } else {
                int existingProductQty = itemQty.get(product);
                itemQty.put(product, existingProductQty + productQty);
            }

            item = scanner.nextLine().split("\\s+");
        }

        for (String output : totalPriceProduct) {
            System.out.printf("%s -> %.2f%n", output, (itemPrice.get(output) * itemQty.get(output)));
        }

    }
}
