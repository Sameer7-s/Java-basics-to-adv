package Method_overriding;

// programm 2

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override // (Anotation )information batata h ek method ki or field ki
    void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat drinks milk");
    }
}

public class overriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        c.eat();
    }
}