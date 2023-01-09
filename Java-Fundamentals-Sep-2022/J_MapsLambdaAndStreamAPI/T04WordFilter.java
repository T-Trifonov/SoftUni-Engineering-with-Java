package J_MapsLambdaAndStreamAPI;

import java.util.*;

public class T04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split(" ")).filter(e -> e.length() % 2 == 0).toArray(String[]::new);

        for (int i = 0; i < words.length ; i++) {

            System.out.println(words[i]);

        }
    }

}


