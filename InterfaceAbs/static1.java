package InterfaceAbs;
interface A {
    static void show() {
        System.out.println("A's static method");
    }
}

interface B {
    static void show() {
        System.out.println("B's static method");
    }
}

public class static1 {
    public static void main(String[] args) {
        A.show(); // Output: A's static method    accessed using interface 
        B.show(); // Output: B's static method
        // C obj = new C();
        // obj.show(); ❌ ERROR: Cannot access static methods via object
    }
}

