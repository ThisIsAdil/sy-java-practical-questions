// Program on Inheritance and Polymorphism.

class Animal {
    void eat() {
        System.out.println("Eating...");
    }

    void makeSound() {
        System.out.println("Making sound...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meowing...");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.makeSound();

        Dog dog = new Dog();
        dog.eat();
        dog.makeSound();

        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
    }
}