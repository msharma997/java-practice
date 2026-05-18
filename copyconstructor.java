
class Student {

    int id;
    String name;

    // Parameterized Constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Copy Constructor
    Student(Student s) {
        id = s.id;
        name = s.name;
    }

    // Method to display data
    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

public class copyconstructor {
    public static void main(String[] args) {

        // Original object
        Student s1 = new Student(101, "Rahul");

        // Copying object
        Student s2 = new Student(s1);

        s1.display();
        s2.display();
    }
}
