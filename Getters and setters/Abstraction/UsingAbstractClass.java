package Abstraction;
abstract class Animal2 {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Dog1 extends Animal2 {
    void sound() {
        System.out.println("barking");
    }
}

public class UsingAbstractClass {
    public static void main(String[] args) {
        Animal2 a = new Dog1();
        a.sound();
        a.sleep();
    }
}
