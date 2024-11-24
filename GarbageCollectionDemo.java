// Programs on Garbage collection, 
// packaging, access Modifiers, as well as static and abstract modifiers. 

public class GarbageCollectionDemo {

    public GarbageCollectionDemo() {
        System.out.println("Constructor called");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destructor called");
    }

    public static void main(String[] args) {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}
