package controlFlow;
public class staticControlFlow {
    // 1. Static variable declaration (default value assigned)
    static int a = 10;
    int c = 90;
    // 2. Static block execution
    static {
        System.out.println("Static Block 1: a = " + a);
        //System.out.println("Static Block 1: b = " + b);   ❌ Illegal forward reference
        b = 20;  // Allowed, but cannot access it before declaration + assigns b = 20 (but this is overridden later).
        // System.out.println("Instance variable c: " + c); // ❌ Error!Instance variable c cannot be accessed 
                                                                //directly inside a static method.
    }
    
    // 3. Static variable declaration
    static int b = 30;

    static {
        System.out.println("Static Block 2: b = " + b);
    }

    // 4. main() executes after all static blocks are executed
    public static void main(String[] args) {
        System.out.println("Inside main()");
    }
}
