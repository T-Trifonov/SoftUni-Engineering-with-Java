package J_MapsLambdaAndStreamAPI.LAB;

import java.util.*;

public class T05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> course = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("\\s+:\\s+");

        while (!input[0].equals("end")) {

            String courseName = input[0];
            String student = input[1];

            course.putIfAbsent(courseName, new ArrayList<>());
            course.get(courseName).add(student);

            input = scanner.nextLine().split("\\s+:\\s+");
        }

        for (Map.Entry<String, List<String>> coursesList : course.entrySet()) {
            System.out.println(coursesList.getKey() + ": " + coursesList.getValue().size());
            coursesList.getValue().forEach(StudentName -> System.out.println("-- "+StudentName));
        }

    }
}
