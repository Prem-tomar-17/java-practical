class Demo {

    Demo() {
        System.out.println("Object Created");
    }

    void display() {
        System.out.println("Object is being used");
    }
}

public class Practical7 {
    public static void main(String[] args) {

        Demo d = new Demo();

        d.display();

        // Removing reference
        d = null;

        System.out.println("Object reference removed");

        // Requesting garbage collection
        System.gc();

        System.out.println("Garbage Collection Requested");
    }
}