//package inheritance;
class Animal {
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

public class hierarchial_inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sleep(); // Inherited from Animal
        myDog.bark();  // Defined in Dog

        Cat myCat = new Cat();
        myCat.sleep(); // Inherited from Animal
        myCat.meow();  // Defined in Cat
    }
}
//Hierarchical Inheritance (One Parent → Many Children)