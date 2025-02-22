// Program on Static Modifiers

class StaticDemo {
    static int count = 0;

    StaticDemo() {
        count++;
    }

    static void displayCount() {
        System.out.println("count: " + count);
    }
}

public class StaticModifiers {
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        StaticDemo.displayCount();
    }
}