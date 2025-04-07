package controlFlow;
class A {
    static {
        System.out.println("Class A Static Block");
    }
}

class B {
    static {
        System.out.println("Class B Static Block");
    }
}

public class staticControlFlow3 {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        A objA = new A();  // Class A is loaded now
        B objB = new B();  // Class B is loaded now
    }
}
//If multiple classes are loaded, each class’s static block executes only when the class is used for the first time.