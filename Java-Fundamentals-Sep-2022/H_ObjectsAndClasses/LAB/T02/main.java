package H_ObjectsAndClasses.LAB.T02;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] article = scanner.nextLine().split(", ");

        Article articleOutput = new Article(article[0], article[1], article[2]);

        int nCommand = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= nCommand; i++) {
            String[] command = scanner.nextLine().split(": ");

            if (command[0].contains("Edit")) {

                articleOutput.Edit(command[1]);


            } else if (command[0].contains("ChangeAuthor")) {

                articleOutput.ChangeAuthor(command[1]);

            } else if (command[0].contains("Rename")) {

                articleOutput.Rename(command[1]);

            }


        }

        System.out.println(articleOutput.toString());

    }
}
