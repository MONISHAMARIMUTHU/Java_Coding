package Overloading;
class Demo {
    void show(int x) {
        System.out.println("int: " + x);
    }
    
    void show(double x) {
        System.out.println("double: " + x);
    }
}

public class ex1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show(5);  // ✅ Calls show(int) since it's an exact match.
        d.show(5.5); // ✅ Calls show(double) since it's an exact match.
        d.show('A'); // ✅ 'A' is promoted to int → Calls show(int)
    }
}

//Java applies widening (char → int)