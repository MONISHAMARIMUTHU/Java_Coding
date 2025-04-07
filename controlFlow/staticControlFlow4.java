package controlFlow;

public class staticControlFlow4 {

    // 1. Static variable a (declared and initialized first)
    static int a = 10;

    // 2. Static block 1
    static {
        System.out.println("Static Block 1: a = " + a);

        // ❌ Illegal forward reference - uncommenting this will cause a compilation error
        // System.out.println("Static Block 1: b = " + b); 

        // ✅ Assignment is okay
        b = 20;

        // ✅ Indirect access - allowed
        printB(); // prints b 
    }

    // 3. Static variable b (declared after usage in static block)
    static int b = 30;

    // 4. Static block 2
    static {
        System.out.println("Static Block 2: b = " + b); // prints 30
    }

    static void printB() {
        System.out.println("Indirect Access in printB(): b = " + b);
    }

    // 5. Main method
    public static void main(String[] args) {
        System.out.println("Inside main()");
        System.out.println("Final values -> a = " + a + ", b = " + b);
    }

}
