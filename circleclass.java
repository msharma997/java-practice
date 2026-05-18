 import java.util.Scanner;

public class circleclass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area of Circle = " + area);
        System.out.println("Circumference of Circle = " + circumference);

        sc.close();
    }
 {
    
}
}
