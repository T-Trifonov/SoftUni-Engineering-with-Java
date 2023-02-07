package C_SetsAndMapsAdvanced;

import java.util.*;

public class T05AverageStudentsGrades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> base = new TreeMap<>();

        for (int i = 0; i < numStudents; i++) {
            String input = scanner.nextLine();
            String student = input.split("\\s+")[0];
            double grade = Double.parseDouble(input.split("\\s+")[1]);

            if (base.containsKey(student)) {

                base.get(student).add(grade);

            } else {

                base.put(student, new ArrayList<>());
                base.get(student).add(grade);

            }

        }

        double averageSum = 0;

        for (String name : base.keySet()) {
            System.out.print(name + " -> ");
            for (int i = 0; i < base.get(name).size(); i++) {
                System.out.printf("%.2f ", base.get(name).get(i));
                averageSum += base.get(name).get(i);
            }

            System.out.printf("(avg: %.2f)%n", averageSum / base.get(name).size());
            averageSum = 0;
        }



    }

}
