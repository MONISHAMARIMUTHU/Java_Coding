abstract class Animal{
    abstract void bark(); //Abstract method (no implementation)

    void sleep(){  // Concrete method (has implementation)
        System.out.println("Animal is sleeping");
    }
    // static void sleep(){  // Concrete method (has implementation)
    //     System.out.println("Animal is sleeping");
    // }
}

// Subclass inheriting abstract class
class Dog extends Animal{
    @Override
    void bark(){
        System.out.println("Dog is barking");
    }
    @Override
    void sleep(){  //overriding method
        System.out.println("Dog is sleeping");
    }
    // //Method hiding - checks reference
    // static void sleep(){  
    //     System.out.println("Dog is sleeping");
    // }
}


public class abstract_basic{
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Allowed (using subclass)
        myDog.bark();
        myDog.sleep();
        Dog m1=new Dog();
        m1.sleep();
    }
}

// ❌ Animal myAnimal = new Animal(); // ERROR! Cannot create an object of an abstract class