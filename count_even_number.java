

public class count_even_number {
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30, 35, 40};

        int count = 0;

        // Loop to check even numbers
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Total Even Numbers = " + count);
    }
}

