class Example {
    // Private Static Variable (Cannot be accessed outside this class)
    private static int count = 0;

    // Private Static Method (Cannot be called outside this class)
    private static void increment() {
        count++;
        System.out.println("Count: " + count);
    }

    // Public Method to Access Private Static Members
    public static void accessIncrement() {
        increment(); // ✅ Allowed (Calling private static method inside the class)
    }
}

public class private_usage {
    public static void main(String[] args) {
        // ❌ Direct access to private static variable is not allowed
        // System.out.println(Example.count); // ERROR!

        // ❌ Direct access to private static method is not allowed
        // Example.increment(); // ERROR!

        // ✅ Accessing through a public method
        Example.accessIncrement(); 
    }
}
