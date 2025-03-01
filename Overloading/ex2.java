package Overloading;
class Demo {
    void show(int x) {
        System.out.println("int: " + x);
    }

}

public class ex2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show(10);  // Calls show(int) (widening beats autoboxing)
    }
}
//What happens if widening and autoboxing both apply?
//Java prefers widening over autoboxing.
