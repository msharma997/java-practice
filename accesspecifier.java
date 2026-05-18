class Demo {

    // private variable
    private int a = 10;

    // default variable
    int b = 20;

    // protected variable
    protected int c = 30;

    // public variable
    public int d = 40;

    void display() {
        System.out.println("Private: " + a);
        System.out.println("Default: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Public: " + d);
    }
}

public class accesspecifier {
    public static void main(String[] args) {

        Demo obj = new Demo();

        
        obj.display();

        System.out.println("Default: " + obj.b);
        System.out.println("Protected: " + obj.c);
        System.out.println("Public: " + obj.d);

    }
}