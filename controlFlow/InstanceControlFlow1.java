package controlFlow;

public class InstanceControlFlow1 {
    int a = getA(); // 1️⃣ instance variable with method call

    {
        System.out.println("Instance Block 1: a = " + a); // 2️⃣ instance block
    }

    int b = getB(); // 3️⃣ second instance variable

    {
        System.out.println("Instance Block 2: b = " + b); // 4️⃣ another instance block
    }

    InstanceControlFlow1() {
        System.out.println("Constructor: a = " + a + ", b = " + b); // 5️⃣ constructor
    }

    int getA() {
        System.out.println("getA() called");
        return 10;
    }

    int getB() {
        System.out.println("getB() called");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("Creating InstanceFlow object...");
        InstanceControlFlow1 obj = new InstanceControlFlow1();
        System.out.println("Object created");
    }
}

