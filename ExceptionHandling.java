import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number to divide 100: ");
            int num = scanner.nextInt();
            int result = 100 / num;
            System.out.println("Result: " + result);

            int[] numbers = { 1, 2, 3 };
            System.out.print("Enter an array index (0-2): ");
            int index = scanner.nextInt();
            System.out.println("Array value: " + numbers[index]);

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age < 18) {
                throw new CustomException("Age must be 18 or older.");
            }
            System.out.println("You are eligible!");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index. " + e.getMessage());
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("Execution complete. Cleaning up resources...");
            scanner.close();
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
