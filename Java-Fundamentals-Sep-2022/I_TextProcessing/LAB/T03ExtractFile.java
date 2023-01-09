package I_TextProcessing.LAB;

import java.util.*;

public class T03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");

        String[] file = input[input.length - 1].split("[.]");

        System.out.printf("File name: %s%n", file[0]);
        System.out.printf("File extension: %s", file[1]);
    }

}
