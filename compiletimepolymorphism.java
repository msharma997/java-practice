

class Calculator {

    // Method with 2 integer parameters
    void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }

    // Method with 3 integer parameters
    void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }

    // Method with double parameters
    void add(double a, double b) {
        System.out.println("Sum of double numbers: " + (a + b));
    }
}

public class compiletimepolymorphism {
    public static void main(String[] args) {

        Calculator obj = new Calculator();

        obj.add(10, 20);
        obj.add(5, 10, 15);
        obj.add(2.5, 3.5);
    }
}