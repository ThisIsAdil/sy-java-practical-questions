// Program on dealing with Arrays 

public class ArrayDemo {
    public static void main(String[] args) {
        // Program on dealing with Arrays
        int[] arr = { 5, 12, 7, 3, 9, 20 };

        // printing original array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        ;

        // find the sum of all array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        ;

        System.out.println("Sum of all array elements: " + sum);

        // finding the maximum and minimum numbers from array
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);
    }
}
