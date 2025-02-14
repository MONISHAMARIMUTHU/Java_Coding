import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

class School {
    String schoolName;
    List<Student> students; // Aggregation: School "has-a" Student

    School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void displayDetails() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (Student student : students) {
            student.display();
        }
    }
}

public class example1 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 15);
        Student s2 = new Student("Bob", 16);

        School school = new School("Greenwood High");
        school.addStudent(s1);
        school.addStudent(s2);

        school.displayDetails();
    }
}
//A school contains multiple students, but a student can exist independently of the school.

