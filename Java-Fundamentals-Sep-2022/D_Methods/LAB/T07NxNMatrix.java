package D_Methods.LAB;

import java.util.Scanner;

public class T07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printMatrix(num);

    }

    public static void printMatrix(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(n+" ");

            }

            System.out.println();

        }

    }

}
