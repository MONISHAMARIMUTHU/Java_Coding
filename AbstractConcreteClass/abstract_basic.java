abstract class Animal{
    abstract void bark(); //Abstract method (no implementation)

    public void sleep(){  // Concrete method (has implementation)
        System.out.println("Animal is sleeping");
    }
}

// Subclass inheriting abstract class
class Dog extends Animal{
    @Override
    void bark(){
        System.out.println("Dog is barking");
    }
}


public class abstract_basic{
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Allowed (using subclass)
        myDog.bark();
        myDog.sleep();
    }
}

// ❌ Animal myAnimal = new Animal(); // ERROR! Cannot create an object of an abstract class