package InterfaceAbs;
interface MathOperations {
    static int add(int a, int b) {  // Static method called without creating object
        return a + b;
    }
}

public class static_method {
    public static void main(String[] args) {
        System.out.println(MathOperations.add(5, 3));  // Output: 8
    }
}

