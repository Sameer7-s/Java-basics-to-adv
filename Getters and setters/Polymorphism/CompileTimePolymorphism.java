package Polymorphism;

//  COMPILE TIME POLYMORPHISM (method overloading )

//class Calculator{
//    // method to add two num
//    public int add(int a , int b ){
//        return a + b;
//    }
//
//    // method to add three num
//    public int add(int a , int b , int c ){
//        return a + b + c;
//    }
//
//    //method to add two double numbers
//    public double add(double a ,  double b){
//        return a + b ;
//    }
//
//}
//public class CompileTimePolymorphism {
//
//    static void main(String[] args) {
//        Calculator cal = new Calculator();
//        System.out.println( cal.add(5,6));  // 11
//        System.out.println(cal.add(5,6,8));  // 19
//        System.out.println(cal.add(5.1,5.8));  // 10.899999999999999
//    }
//}




// program 2

class Calculator {
    public int mul(int a, int b) {
        return a * b;
    }

    public int mul(int a, int b, int c) {
        return a * b * c;
    }
}
public class CompileTimePolymorphism{
      public static  void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.mul(5,8));
        System.out.println(cal.mul(5,8,8));
    }
}