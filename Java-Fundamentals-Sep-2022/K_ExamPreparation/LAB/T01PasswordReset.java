package K_ExamPreparation.LAB;

import java.util.Scanner;

public class T01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passWord = scanner.nextLine();

        StringBuilder test = new StringBuilder();

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("Done")) {

            if (command[0].equals("TakeOdd")) {

                String temp = "";

                for (int i = 1; i < passWord.length(); i += 2) {
                    temp += passWord.charAt(i);
                }

                passWord = temp;

                System.out.println(passWord);

            } else if (command[0].equals("Cut")) {

                int index = Integer.parseInt(command[1]);
                int length = Integer.parseInt(command[2]);

                String substring = passWord.substring(index, (index + length));

                passWord = passWord.replaceFirst(substring, "");

                System.out.println(passWord);

            } else if (command[0].equals("Substitute")) {

                String substring = command[1];
                String substitute = command[2];


                if (passWord.contains(substring)) {

                    passWord = passWord.replaceAll(substring, substitute);
                    System.out.println(passWord);

                } else {
                    System.out.println("Nothing to replace!");
                }

            }

            command = scanner.nextLine().split("\\s+");
        }

        System.out.println("Your password is: " + passWord);

    }
}
