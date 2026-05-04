package school.Zoo;

class Animal {

    private String name;

    protected String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + "make a sound: " + sound);

    }

    protected void changeSound(String newSound) {
        this.sound = newSound;
    }


}


class Dog  extends  Animal{

    public Dog(String name){
        super(name,"bark");

    }
    public void wagTail(){
        System.out.println(getName() + "is wagging its tail.");
    }
    private String getName(){
        return getClass().getSimpleName();
    }

    public void changeSound(String newSound){
        this.sound = newSound;
    }
}


public class Test90 {
    public static void main(String[] args) {
        Dog dog = new Dog("bob");
        dog.makeSound();
        dog.changeSound("Woof"); // changeSound method is in a protected method so we can not access directly
        dog.makeSound();
        dog.wagTail();
    }
}
