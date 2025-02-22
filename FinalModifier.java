final class FinalClass {
    final int finalVariable = 100;

    final void display() {
        System.out.println("Final variable: " + finalVariable);
    }
}

// Uncommenting the line below will cause an error because FinalClass can't be
// extended
// class ChildClass extends FinalClass { }

public class FinalModifier {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();

        // Uncommenting the line below will cause an error because finalVariable can't
        // be reassigned
        // obj.finalVariable = 200;
    }
}
