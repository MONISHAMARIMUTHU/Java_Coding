package controlFlow;

class RecursiveDirect {
    RecursiveDirect() {
        this(); // ❌ Infinite recursion
    }
}

public class Recursion1 {
    public static void main(String[] args) {
        // Uncomment below to see StackOverflowError
        RecursiveDirect obj = new RecursiveDirect();
    }
}

