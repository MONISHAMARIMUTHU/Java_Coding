package controlFlow;

class Parent1 {
    int a = initializeA();

    {
        System.out.println("Parent Instance Block 1: a = " + a);
    }

    Parent1() {
        System.out.println("Parent Constructor Start");
        show();
        System.out.println("Parent Constructor End");
    }

    int initializeA() {
        System.out.println("Parent.initializeA() called");
        return 10;
    }

    void show() {
        System.out.println("Parent show(): a = " + a);
    }
}


public class InstanceControlFlow2 extends Parent1 {
    
    int b = initializeB();

    {
        System.out.println("Child Instance Block 1: b = " + b);
    }

    InstanceControlFlow2() {
        System.out.println("Child Constructor Start");
        show();
        System.out.println("Child Constructor End");
    }

    int initializeB() {
        System.out.println("Child.initializeB() called");
        return 20;
    }

    @Override
    void show() {
        System.out.println("Child show(): a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        System.out.println("Main Starts");
        InstanceControlFlow2 obj = new InstanceControlFlow2();
        System.out.println("Main Ends");
    }
}
