// Program on dealing with Arrays 

public class ArrayDemo {
    public static void main(String[] args) {
        // Program on dealing with Arrays
        int[] arr = { 5, 2, 8, 1, 7 };

        // printing original array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        ;

        // find the sum of all array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        ;

        System.out.println("Sum of all array elements: " + sum);
    }
}
