package B_DataTypesAndVariables;

import java.util.Scanner;

public class T05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameFirst = scanner.nextLine();
        String nameSecond = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(nameFirst+delimiter+nameSecond);

    }
}
