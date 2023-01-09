package A_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        int totalTimeInMinutes = (hour*60)+minute+30;

        int hourNew = totalTimeInMinutes/60;
        int minuteNew= totalTimeInMinutes%60;

        if (hourNew>23) {
            hourNew=0;
        }

        System.out.printf("%d:%02d", hourNew,  minuteNew);

    }
}
