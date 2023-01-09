package G_MID_TEST;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03SchoolLibrary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> books = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());

        String[] array = (scanner.nextLine().split(" [|] "));


        while (!array[0].equals("Done")) {

            if (array[0].equals("Add Book")) {
                if (!books.contains(array[1])) {
                    books.add(0, array[1]);
                }
            }

            if (array[0].equals("Take Book")) {
                books.remove((array[1]));


            }

            if (array[0].equals("Swap Books")) {

                if (books.contains((array[1])) && books.contains((array[2]))) {

                    int indexFirstBook = books.indexOf((array[1]));
                    int indexSecondBook = books.indexOf((array[2]));


                    String firstBook = books.get(indexFirstBook);
                    String secondBook = books.get(indexSecondBook);

                    books.remove(indexFirstBook);
                    books.add(indexFirstBook, secondBook);
                    books.remove(indexSecondBook);
                    books.add(indexSecondBook, firstBook);


                }
            }

            if (array[0].equals("Insert Book")) {
                if (!books.contains((array[1]))) {
                    books.add((array[1]));
                }
            }

            if (array[0].equals("Check Book")) {

                int indexBook = Integer.parseInt(array[1]);

                if (indexBook >= 0 && indexBook<=books.size()-1) {
                    System.out.println(books.get(indexBook));
                }

            }

            array = (scanner.nextLine().split(" [|] "));
        }

        System.out.println(String.join(", ", books));


    }
}
