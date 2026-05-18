import java.util.Scanner;

public class checknumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("Number is divisible by 2 or 3");
        } else {
            System.out.println("Number is not divisible by 2 or 3");
        }

        sc.close();
    }
}