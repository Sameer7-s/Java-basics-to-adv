//
////Run time polymorphism (method overriding)
//
//
//class Animal {
//    void sound() {
//        System.out.println("Animal makes sound");
//    }
//}
//class Dog extends Animal {
//    @Override
//    void sound() {
//        System.out.println("Dog barks");
//    }
//    void saybye(){
//        System.out.println("byee..");
//    }
//}
//'
//
//class Cat extends Animal {
//    @Override
//    void sound() {
//        System.out.println("Cat meows");
//    }
//}
//
//public class RunTimePolymorphism {
//    public static void main(String[] args) {
//
//        // Direct object creation with parent reference(dog also assign to the Animal class and cat also) bcs of over riding
//        Animal dog = new Dog();// upcasting means (lower hirarchy class assign to the upper hierarchy class)  // object created + assigned in one line
//        Animal cat = new Cat();
//
//        dog.sound();  // Dog barks  // Dynamic method dispatch (means which method it runs or decide)
//        cat.sound();  // Cat meows
//    }
//}


class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();   // Dog barks
        a = new Cat();
        a.sound();   // Cat meows
    }
}

