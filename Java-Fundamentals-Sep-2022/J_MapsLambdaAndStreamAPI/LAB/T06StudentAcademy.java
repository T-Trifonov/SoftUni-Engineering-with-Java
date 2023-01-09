package J_MapsLambdaAndStreamAPI.LAB;

import java.util.*;

public class T06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInputs = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new LinkedHashMap<>();
        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (int i = 1; i <= numInputs; i++) {

            String student = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(student, new ArrayList<>());
            students.get(student).add(grade);

        }

        double sumGrade = 0;

        for (Map.Entry<String, List<Double>> averageGrade : students.entrySet()) {
            for (int i = 0; i < averageGrade.getValue().size(); i++) {
                sumGrade += averageGrade.getValue().get(i);
            }

            if ((sumGrade / averageGrade.getValue().size()) >= 4.5) {
                studentAverageGrade.put(averageGrade.getKey(), sumGrade / averageGrade.getValue().size());

            }

            sumGrade = 0;

        }

        for (Map.Entry<String, Double> outputStudent : studentAverageGrade.entrySet()) {
            System.out.printf("%s -> %.2f%n", outputStudent.getKey(), outputStudent.getValue());
        }

    }
}
