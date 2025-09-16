package InterfaceAbs;

// Interface A
interface A1 {
    void methodA();
}

// Interface B extends A
interface B1 extends A1 {
    void methodB();
}

// Another interface C
interface C1 {
    void methodC();
}

// Class D implements both B and C
class D1 implements B1, C1 {
    @Override
    public void methodA() {
        System.out.println("Method A from interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from interface B");
    }

    @Override
    public void methodC() {
        System.out.println("Method C from interface C");
    }
}

public class hybrid_inheritance {
    public static void main(String[] args) {
        D1 obj = new D1();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}

