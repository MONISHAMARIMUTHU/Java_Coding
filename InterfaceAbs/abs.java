package InterfaceAbs;
interface A {
    void show(); // Abstract method
}

interface B {
    void show(); // Same abstract method
}

class C implements A, B {
    // Only one implementation is needed
    public void show() {
        System.out.println("C's show method");
    }
}

public class abs {
    public static void main(String[] args) {
        C obj = new C();
        obj.show(); // Output: C's show method
    }
}

