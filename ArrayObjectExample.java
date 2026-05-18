class Student {
    int id;
    String name;

    // Constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Method to display data
    void display() {
        System.out.println(id + " " + name);
    }
}

public class ArrayObjectExample {
    public static void main(String[] args) {

        // Array of objects
        Student[] s = new Student[3];

        // Creating objects
        s[0] = new Student(101, "Rahul");
        s[1] = new Student(102, "Aman");
        s[2] = new Student(103, "Neha");

        // Accessing array objects
        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }
    }
}