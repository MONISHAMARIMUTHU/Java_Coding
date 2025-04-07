package controlFlow;

public class constructor1 {
    constructor1() {
        this(10);
        System.out.println("No-arg constructor");
    }

    constructor1(int x) {
        System.out.println("Param constructor: " + x);
    }
    public static void main(String[] args) {
        System.out.println("Main Starts");
        constructor1 obj = new constructor1();
        System.out.println("Main Ends");
    }
}
