
//Run time polymorphism (method overriding)


class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    void saybye(){
        System.out.println("byee..");
    }
}


class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {

        // Direct object creation with parent reference(dog also assign to the Animal class and cat also) bcs of over riding
        Animal dog = new Dog();// upcasting means (lower hirarchy class assign to the upper hierarchy class)  // object created + assigned in one line
        Animal cat = new Cat();

        dog.sound();  // Dog barks  // Dynamic method dispatch (means which method it runs or decide)
        cat.sound();  // Cat meows
       // down casting
//        double d = 2.354864;
//        int e  = (int)d;
//        System.out.println(e);
//        Dog myDog = (Dog)dog;//down casting
    }
}