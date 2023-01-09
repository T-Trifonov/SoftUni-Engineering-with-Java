package H_ObjectsAndClasses;

import java.util.*;

public class T05Students {

    static class Student{

        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown){
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
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Student> studentList = new ArrayList<>();

        while (!input[0].equals("end")){

            Student studentInfo = new Student(input[0], input[1], Integer.parseInt(input[2]), input[3]);

            studentList.add(studentInfo);

            input = scanner.nextLine().split(" ");

        }

        String command = scanner.nextLine();

        for (Student output: studentList) {
            if (output.getHomeTown().equals(command)){
                System.out.printf("%s %s is %d years old%n", output.getFirstName(), output.getLastName(), output.getAge());
            }
        }

    }
}
