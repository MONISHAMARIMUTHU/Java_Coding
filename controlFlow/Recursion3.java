package controlFlow;
class MethodRecursion {
    MethodRecursion() {
        call();
    }

    void call() {
        call(); // ⚠️ Recursive method, not constructor
    }
}

public class Recursion3 {
    public static void main(String[] args) {
        // Uncomment below to see StackOverflowError
        //MethodRecursion obj = new MethodRecursion();
    }
}

