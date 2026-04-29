//package Abstraction;
//
//
//// Abstract class
//abstract class Animal {
//
//    // abstract method (no body)
//    abstract void sayHello();
//
//    // concrete method (with body)
//    void sleep() {
//        System.out.println("zzz....");
//    }
//}
//
//// Dog class
//class Dog extends Animal {
//
//    @Override
//    void sayHello() {
//        System.out.println("Woof");
//    }
//}
//
//// Cat class
//class Cat extends Animal {
//
//    @Override
//    void sayHello() {
//        System.out.println("Meoww");
//    }
//}
//
//// Main class
//public class Test6 {
//    public static void main(String[] args) {
//
////         Animal animal = new Animal();  //'Animal' is abstract; cannot be instantiated
//
//        // Array of Animal references
//        Animal[] animals = {
//                new Dog(),
//                new Cat()
//        };
//
//        // Loop through all objects
//        for (Animal a : animals) {
//            a.sayHello();  // runtime polymorphism
//            a.sleep();     // common method
//
//
//
//            // =============================== second
////            Animal a;
////            a = new Dog();
////            a.sayHello(); // Woof
////
////            a = new Cat();
////            a.sayHello(); // Meoww
////
////            System.out.println("-----");
//
//        }
//    }
//}
//

package Abstraction;


abstract class Animal{
    abstract void sound();  //
    void sleep(){
        System.out.println("Sleeping");
    }
}
class Dog extends Animal{
void sound(){
    System.out.println("barking");
}
}
public class Test6{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.sleep();
    }
}



















