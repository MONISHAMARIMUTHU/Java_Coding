package InterfaceAbs;
interface A {
    default void show() {
        System.out.println("A's show method");
    }
}

interface B {
    default void show() {
        System.out.println("B's show method");
    }
}

class C implements A, B {
    // Must override to resolve conflict
    @Override
    public void show() {
        System.out.println("C's own show method");
        A.super.show(); // Optionally call A's method
        B.super.show();
    }
}

public class default1 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show(); // Output: C's own show method
    }
}

