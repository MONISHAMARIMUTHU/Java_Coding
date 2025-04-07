package controlFlow;

class CopyConstructor {
    int x;

    CopyConstructor(int x) {
        this.x = x;
    }

    // copy constructor
    CopyConstructor(CopyConstructor obj) {
        // this.x = obj.x;
        this(obj.x);
    }
}

class MyClass implements Cloneable {
    String name;
    int age;

    MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


public class constructorCopy {
    int a;
    constructorCopy() {
        System.out.println("no-args conctructor");
        this.a=5;
        // this(this.a); 
    }

    constructorCopy(int num) {
        System.out.println("1-arg conctructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        new constructorCopy();

        // METHOD-1 -> copy constructor with constructor
        CopyConstructor obj1 = new CopyConstructor(10);
        CopyConstructor obj2 = new CopyConstructor(obj1);
        System.out.println("obj1-x -> " + obj1.x + "==" + obj2.x + "<- obj2-x");
        
        // METHOD-2 -> copy constructor with clone() method
        try{

            MyClass obj3 = new MyClass("manju", 20);
            MyClass obj4 = (MyClass)obj3.clone(); // We need to type cast, O/W: CE, because before typecasting it is child reference parent object

            System.out.println(obj3.name + "==" + obj4.name);
        }
        catch(CloneNotSupportedException c){
            System.out.println("Exception");
        }
    }
}