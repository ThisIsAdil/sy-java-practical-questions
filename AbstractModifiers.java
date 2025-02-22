// program on abstract modifiers

abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Barking!");
    }
}

public class AbstractModifiers {
    public static void main(String[] args) {
        Animal dog1 = new Dog();

        dog1.makeSound();
        dog1.sleep();
    }
}
