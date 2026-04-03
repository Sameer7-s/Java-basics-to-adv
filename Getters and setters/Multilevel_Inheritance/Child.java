package Multilevel_Inheritance;

//public class Child extends  parent {
//}



// p2

public  class Child extends parent{

    public Child(int age, String name){
        super(age,name);
        System.out.println("Child Constructor called ");
    }
    public void childMethod(){
        System.out.println("Child method called");
        super.parentMethod();
    }
}