// Write a program to demonstrate following function concept
// Function overloading
// Constructor of all types
// Default parameters, returning by reference.

public class FunctionDemo {
    int number;
    String text;

    // function without parameters returning by reference
    void sayHello() {
        System.out.println("Hello, my name is " + this.text);
    }

    // function overloading
    void sayHello(String text) {
        System.out.println("Hello, my name is " + text);
    }

    // Default Constructor
    public FunctionDemo() {
        this.number = 0;
        this.text = "Default Constructor";
        System.out.println(this.text);
    }

    // Parameterized Constructor
    public FunctionDemo(int number, String text) {
        this.number = number;
        this.text = text;
        System.out.println(this.text);
    }

    // Copy Constructor
    public FunctionDemo(FunctionDemo obj) {
        this.number = obj.number;
        this.text = obj.text;
        System.out.println(this.text);
    }

    public static void main(String[] args) {
        FunctionDemo obj = new FunctionDemo();
        FunctionDemo obj2 = new FunctionDemo(5, "Parameterized Constructor");
        FunctionDemo obj3 = new FunctionDemo(obj);

        obj.sayHello();
        obj.sayHello("Function Overloading");
    }
}
