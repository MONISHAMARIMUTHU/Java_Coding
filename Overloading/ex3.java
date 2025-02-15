package Overloading;
class Test {
    void show(int a) {
        System.out.println("int: " + a);
    }

    void show(int... a) {
        System.out.println("varargs: " + a.length);
    }
}

public class ex3 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show(5);  // Calls show(int), NOT varargs
    }
}
// What happens if varargs and other overloaded methods exist?
//Method with exact parameters is always preferred over varargs.

