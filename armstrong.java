import java.util.Scanner;
public class armstrong {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        int digits = 0;
        int temp = number;
        while(temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = number;
        while (temp != 0 ) {
            int digits = temp % 10;
            sum += Math.pow(digit,digits);
            temp = temp / 10;
        }
        if ( sum == originalNumber) {
            System.out.println(originalNumber + "is an armstrong number.");
        } else{
            System.out.println(originalNumber + "is not an armstrong number.");
        }
        sc.close();
    }
}