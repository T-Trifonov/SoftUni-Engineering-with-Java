package H_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T06Students_02 {

    static class Student {

        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;

        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Student> studentList = new ArrayList<>();

        while (!input[0].equals("end")) {

            String firstName=input[0];
            String lastName=input[1];
            int age=Integer.parseInt(input[2]);
            String homeTown=input[3];

            if (isStudentExist(studentList, input[0], input[1])) {

                Student studentInfo = getStudent(studentList, firstName, lastName);

                studentInfo.setFirstName(firstName);
                studentInfo.setLastName(lastName);
                studentInfo.setAge(age);
                studentInfo.setHomeTown(homeTown);


            } else {
                Student studentInfo = new Student(firstName, lastName, age, homeTown);
                studentList.add(studentInfo);


            }

            input = scanner.nextLine().split(" ");
        }

        String command = scanner.nextLine();

        for (Student output : studentList) {
            if (output.getHomeTown().equals(command)) {
                System.out.printf("%s %s is %d years old%n", output.getFirstName(), output.getLastName(), output.getAge());
            }
        }

    }

    private static boolean isStudentExist(List<Student> studentList, String firstName, String lastName) {
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }

        return false;
    }

    private static Student getStudent(List<Student> studentList, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }

        }

        return existingStudent;
    }
}
