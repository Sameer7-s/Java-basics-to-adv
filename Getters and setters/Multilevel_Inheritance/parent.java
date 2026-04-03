package Multilevel_Inheritance;

//public class parent extends  Grandparent {
//    private String name;
//    private  int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}


///  program 2

//public class parent extends  Grandparent {
//  public parent( ){
//      super();
//      System.out.println("Parent constructor called");
//  }
//
//  public void parentMethod(){
//      System.out.println("Parent method called");
//  }
//}




/// condition 3

public class parent extends  Grandparent {
    public parent( int age,String name){
        super(age, name);
        // with help of super function we can call the parameterized constructors of parent class
        System.out.println("Parent constructor called");
    }

    public void parentMethod(){
        System.out.println("Parent method called");
    }
}
