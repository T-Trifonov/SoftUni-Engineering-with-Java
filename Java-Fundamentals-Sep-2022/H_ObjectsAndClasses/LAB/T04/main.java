package H_ObjectsAndClasses.LAB.T04;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentInfo = new ArrayList<>();

        int countStudent = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countStudent; i++) {
            String[] studentInput = scanner.nextLine().split(" ");

            Student student = new Student(studentInput[0], studentInput[1], Double.parseDouble(studentInput[2]));

            studentInfo.add(student);
        }

        studentInfo.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student studentP : studentInfo) {

            System.out.println(studentP.toString());

        }

    }

}

