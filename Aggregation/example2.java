class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Department Name: " + name);
    }
}

class University {
    String universityName;
    Department department; // Aggregation

    University(String universityName, Department department) {
        this.universityName = universityName;
        this.department = department;
    }

    void display() {
        System.out.println("University Name: " + universityName);
        department.display(); // Delegates call to the Department class
    }
}

public class example2 {
    public static void main(String[] args) {
        Department dept = new Department("Computer Science");
        University uni = new University("Stanford", dept);

        uni.display();
    }
}

