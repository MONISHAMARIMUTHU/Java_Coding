package controlFlow;

class Parent12 {
    static int a = 10;

    static {
        System.out.println("Parent Static Block 1: a = " + a);

        // ❌ Illegal forward reference
        // System.out.println("Parent: b = " + b); // ❌ Compile error

        // ✅ Assignment is okay
        b = 20;

        // ✅ Indirect access via method (allowed)
        printB(); // b is 0 at this point (default value)
    }

    static int b = 30;

    static {
        System.out.println("Parent Static Block 2: b = " + b);
    }

    static void printB() {
        System.out.println("Parent.printB(): b = " + b);
    }
}


public class staticControlFlow5 extends Parent12 {
        static int c = 100;
    
        static {
            System.out.println("Child Static Block 1: c = " + c);
    
            // ✅ Assignment before declaration is fine
            d = 200;
    
            // ✅ Indirect access allowed (though value = 0 here)
            showD();
        }
    
        static int d = 300;
    
        static {
            System.out.println("Child Static Block 2: d = " + d);
        }
    
        static void showD() {
            System.out.println("Child.showD(): d = " + d);
        }
    
        public static void main(String[] args) {
            System.out.println("Inside main()");
            System.out.println("Final values: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        }
    }
    
