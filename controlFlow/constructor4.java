package controlFlow;
class Parent5 {
    Parent5() {
        display(); // calls child's overridden method
    }

    void display() {
        System.out.println("Parent display");
    }
}

class Child5 extends Parent5{
    int x = 5;

    @Override
    void display() {
        System.out.println("Child display, x = " + x); // x is 0 here!
    }
}

public class constructor4 {
    public static void main(String[] args) {
        Child5 obj = new Child5();
    }
}
