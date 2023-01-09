package A_BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class T04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStart = Integer.parseInt(scanner.nextLine());
        int numEnd = Integer.parseInt(scanner.nextLine());

        int sum=0;

        for (int i = numStart; i <= numEnd ; i++) {
            System.out.print(i+" ");
            sum+=i;
        }

        System.out.printf("%nSum: %d",sum);


    }
}
