class Animal{
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Mammal walks on land");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Dog barks");
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sleep();  // Inherited from Animal
        myDog.walk(); // Inherited from Mammal
        myDog.bark(); // Defined in Dog

    }
}
//Multilevel Inheritance (Grandparent → Parent → Child)