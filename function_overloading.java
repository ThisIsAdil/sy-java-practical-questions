// program demonstrating function overloading

public class function_overloading {

    public static String print(String a, String b) {
        return a + b;
    };
    
    public static void main(String[] args) {
        System.out.println(print("Hello", "World"));
        System.out.println(print("Adil", "Shaikh"));
    }

}