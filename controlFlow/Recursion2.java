package controlFlow;
class RecursiveIndirect {
    RecursiveIndirect() {
        this(5); // calls second constructor
    }

    RecursiveIndirect(int x) {
        this(); // calls first constructor again — ❌ infinite loop
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        // Uncomment below to see StackOverflowError
        RecursiveIndirect obj = new RecursiveIndirect();
    }
}


