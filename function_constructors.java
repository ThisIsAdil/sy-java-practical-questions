// program demonstrating all types of constructors

public class function_constructors {

    function_constructors() {
        System.out.println("default contructor");
    }

    ;

    function_constructors(String a) {
        System.out.println(a);
    }

    ;

    public static void main(String[] args) {
        function_constructors obj = new function_constructors();
        function_constructors obj1 = new function_constructors("parameterized constructor");

    }

}
