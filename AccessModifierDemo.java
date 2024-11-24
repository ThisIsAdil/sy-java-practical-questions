public class AccessModifierDemo {
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

    public static void main(String[] args) {
        AccessModifierDemo obj = new AccessModifierDemo();
        obj.display();
    }
}
