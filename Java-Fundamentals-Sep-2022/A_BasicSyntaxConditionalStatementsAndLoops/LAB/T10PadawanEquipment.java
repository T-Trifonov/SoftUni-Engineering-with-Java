package A_BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class T10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budjet = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfLightSabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double totalPriceOfLightSabers = (Math.ceil(students * 1.1)) * priceOfLightSabers;
        double totalPriceOfRobes = students * priceOfRobes;
        double freeBelts = Math.floor(students / 6.00);
        double totalPriceOfBelts = ((students-freeBelts) * priceOfBelts);

        double total = totalPriceOfLightSabers+totalPriceOfRobes+totalPriceOfBelts;

        if (total <= budjet){
            System.out.printf("The money is enough - it would cost %.2flv.",total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",total-budjet);
        }

    }
}
