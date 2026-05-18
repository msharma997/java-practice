public class ArrayBoundExample {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        try {
            // Accessing invalid index
            System.out.println(arr[10]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out of Bounds!");
        }

        System.out.println("Program continues...");
    }
 
    
}
