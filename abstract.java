// Abstract class
abstract class Animal {

    // Abstract method
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class
class Dog extends Animal {

    // Implementing abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.sleep();
    }
}