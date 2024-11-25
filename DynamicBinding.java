class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        // Static Binding Example
        DynamicBinding.staticMethod();

        // Dynamic Binding Example
        Animal a = new Dog(); // Upcasting
        a.sound(); // Calls Dog's sound() method (Dynamic Binding)
    }

    static void staticMethod() {
        System.out.println("Static Binding: This is a static method");
    }
}
