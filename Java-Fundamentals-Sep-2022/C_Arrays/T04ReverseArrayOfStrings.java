package C_Arrays;


import java.util.Scanner;

public class T04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0 ; i < (input.length)/2; i++) {
            String firstElement = input[i];
            String lastElement = input[(input.length-i)-1];

            input[(input.length-i)-1] = firstElement;
            input[i]=lastElement;

        }

        for (String arrays : input) {
            System.out.print(arrays+" ");
        }

    }
}
