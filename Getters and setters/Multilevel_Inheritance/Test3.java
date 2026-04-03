package Multilevel_Inheritance;

//public class Test3 {
//    static void main(String[] args) {
//        Child child  = new Child();
//        child.setName("Thomas");
//        child.setAge(52);
//
//        parent parent = new parent();
//        parent.setAge(20);
//        parent.setName("Rakesh");
//    }
//}


/////// super funtion used here
//
//public child(){
//    super();
//    System.out.println("Child constructor called ");
//}
//
//// child ka super parent class hogi
//
//static void childMethod() {
//    System.out.println("Child method called");
//    super.parentMethod();
//
//}

public  class Test3 {
    public static  void main(String[] args) {
        Child child = new Child(10 , "Ram");
        System.out.println(child.getAge());
        child.childMethod();
    }
}