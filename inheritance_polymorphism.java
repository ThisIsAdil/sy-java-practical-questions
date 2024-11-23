class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }
}

public class inheritance_polymorphism {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.sound();

        Dog dog1 = new Dog();
        dog1.eat();
        dog1.sound();
    }
}
