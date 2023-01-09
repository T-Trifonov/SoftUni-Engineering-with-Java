package D_Methods;

import java.util.Scanner;

public class T06CalculateRectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", area(width,length));

    }

    public static double area(double a, double b){

        double area = a*b;

        return area;

    }

}
