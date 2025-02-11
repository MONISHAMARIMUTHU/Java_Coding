abstract class Animal{
    abstract void bark(); //Abstract method (no implementation)

    public void sleep(){  // Concrete method (has implementation)
        System.out.println("Animal is sleeping");
    }
}

// Abstract subclass (Does NOT implement bark())
abstract class Mammal extends Animal { //Subclass Can Also Be Abstract
    void walk() {
        System.out.println("Mammals walk on land.");
    }
}
//If a subclass does not implement the abstract method, it must itself be declared abstract, 
//so that the responsibility is passed to another subclass.


// Subclass inheriting abstract class
class Dog extends Mammal{
    @Override
    void bark(){
        System.out.println("Dog is barking");
    }

    void makesound(){
         System.out.println("Wowww");
    }
}


public class abs_subclassAbs{
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Allowed (using subclass)
        myDog.bark();
        myDog.sleep();
        Mammal m1=new Dog();
        m1.walk();
        m1.bark();
        m1.sleep();
        //m1.makesound() - not possible
        Dog m2= new Dog();
        m2.makesound();
        m2.sleep();
        m2.bark();
        m2.walk();
    }
}
