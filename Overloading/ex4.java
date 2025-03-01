package Overloading;

class Parent {
    void m6(int num){
        System.out.println("parent-int");
    }

    void m7(int... a){
        System.out.println("m7 -> parent");
    }
}

class Child extends Parent {
    void m6(float num){
        System.out.println("child-float");
    }

    void m7(int a){
        System.out.println("m7 -> child");
    }
}
public class ex4 {
    static void m2(int num){
        System.out.println("m2 -> int-arg");
    }
    
    static void m2(Double f){
        System.out.println("m2 -> Double(wrapper)-arg // Autoboxing");
    }
    
    static void m2(float num){
        System.out.println("m2 -> float-arg");
    }
    
    static void m2(int num1, int num2){
        System.out.println("m2 -> int-int");
    }
    
    // 
    static void m3(int num1, float num2){
        System.out.println("m3 -> int-float");
    }

    static void m3(float num1, int num2){
        System.out.println("m3 -> float-int");
    }
    
    // 
    public static void m4(String s){
        System.out.println("m4 -> String");
    }
    
    private static void m4(Object o){
        System.out.println("m4 -> Object");
    }
    
    // 
    public static void m5(String s){
        System.out.println("m5 -> String");
    }
    
    static void m5(Thread t){
        System.out.println("m5 -> Thread");
    }
    
    // Object - diff type - 
    static void m1(Parent p){
        System.out.println("m1 -> Parent");
    }
    
    static void m1(Child c){
        System.out.println("m1 -> Child");
    }

    static void m6(int num){
        System.out.println("m6 -> fixed argument");
    }

    static void m6(int... nums){
        System.out.println("m6 -> var-args");
    }

    public static void main(String[] args) {

        m2(5);
        m2(5f);
        m2(5.0); // no match for double -> so autoboxing worked here -> double is automatically coverted into Double(wrapper class)
        m2((byte)5); // no excat match look for high level - int
        m2(5, 5);
    
        m3(5,5f);
        m3(5f, 5);
        // m3(5,5); // CE: ambiguous

        m4(new String());
        m4(new Object());
        m4(null); // more than 1 exact match -> parent-child relationship -> child priority -> O/P: String

        m5(new Thread());
        // m5(null); // more than 1 exact match -> No relationship -> CE: ambiguous

        Parent p = new Parent();
        Child c = new Child();
        Parent p2 = new Child();

        m1(p);
        m1(c);
        m1(p2); // method resolutin - by JC - based on "reference type" -> O/P: Parent

        // overloadin across parent & child class
        c.m6(0);
        c.m6(0f);
        c.m6((byte)0);

        // Overloading with var-args
        m6(5); // it can match both fixed & var-args argument, but fixed argument takes precedence
        m6(5,6,7);

        p.m7(5,4); // parent
        p.m7(5); // parent
        c.m7(5,4); // parent
        c.m7(5); // child
        p2.m7(5); // parent
        p2.m7(5,6); // parent
    }
}
