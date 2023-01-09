package H_ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class T01RandomizeWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] wordArr = scanner.nextLine().split("\\s+");

        Random rndGenerator = new Random();

        for (int i = 0; i < wordArr.length; i++) {
            int randomX = rndGenerator.nextInt(wordArr.length);
            int randomY = rndGenerator.nextInt(wordArr.length);

            String temp = wordArr[randomX];
            wordArr[randomX] = wordArr[randomY];
            wordArr[randomY] = temp;

        }

        System.out.println(String.join(System.lineSeparator(),wordArr));

    }
}
