package controlFlow;

class Parent2 {
    static int pa = initializeParentStaticVar();

    static {
        System.out.println("Parent Static Block 1: pa = " + pa);
    }

    static int initializeParentStaticVar() {
        System.out.println("Parent Static Variable Initialized");
        return 100;
    }

    static void parentStaticMethod() {
        System.out.println("Parent Static Method Called");
    }

    {
        System.out.println("Parent Instance Block");
    }

    Parent2() {
        System.out.println("Parent Constructor");
    }
}


public class ControlFlow1 extends Parent2 {

    static int ca = initializeChildStaticVar();

    static {
        System.out.println("Child Static Block 1: ca = " + ca);
        parentStaticMethod(); // Indirect static method call from parent
    }

    static int cb = initializeAnotherStatic();

    static {
        System.out.println("Child Static Block 2: cb = " + cb);
    }

    static int initializeChildStaticVar() {
        System.out.println("Child Static Variable ca Initialized");
        return 200;
    }

    static int initializeAnotherStatic() {
        System.out.println("Child Static Variable cb Initialized");
        return 300;
    }

    {
        System.out.println("Child Instance Block");
    }

    ControlFlow1() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Starts");
        ControlFlow1 c = new ControlFlow1();
        System.out.println("Main Ends");
    }
}
