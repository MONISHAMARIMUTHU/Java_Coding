package controlFlow;

class A {
    A() {
        System.out.println("A Constructor");
    }
}

class B extends A {
    B() {
        super(); // calls A's constructor
        System.out.println("B Constructor");
    }
}

public class constructor2 {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        B obj = new B();
        System.out.println("Main Ends");
    }
}