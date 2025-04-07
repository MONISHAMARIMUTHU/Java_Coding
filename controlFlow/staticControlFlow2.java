package controlFlow;
class Parent {
    static {
        System.out.println("Parent Static Block");
    }
}

public class staticControlFlow2 extends Parent{
    static {
        System.out.println("Child Static Block");
    }
    
    public static void main(String[] args) {
        System.out.println("Inside main()");
    }
}

//Static blocks of the parent class execute first before those of the child class.