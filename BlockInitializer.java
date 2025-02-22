public class BlockInitializer {
    static {
        System.out.println("Static block executed");
    }

    {
        System.out.println("Instance block executed");
    }

    BlockInitializer() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method starts");
        BlockInitializer obj1 = new BlockInitializer();
        BlockInitializer obj2 = new BlockInitializer();
    }
}
