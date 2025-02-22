// program on access Modifiers

class AccessDemo {
    public int publicVariable = 10;
    private int privateVariable = 20;
    protected int protectedVariable = 30;
    int defaultVariable = 40;

    public void display() {
        System.out.println("Public Variable: " + publicVariable);
        System.out.println("Private Variable: " + privateVariable);
        System.out.println("Protected Variable: " + protectedVariable);
        System.out.println("Default Variable: " + defaultVariable);
    }

}

public class AccessModifierDemo {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.display();

        System.out.println("Public Variable: " + obj.publicVariable);
        System.out.println("Protected Variable: " + obj.protectedVariable);
        System.out.println("Default Variable: " + obj.defaultVariable);
        // System.out.println("Private Variable: " + obj.privateVariable);
        // error: privateVariable has private access in AccessDemo
    }

}