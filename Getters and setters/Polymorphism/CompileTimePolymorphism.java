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

//class Calculator {
//    public int mul(int a, int b) {
//        return a * b;
//    }
//
//    public int mul(int a, int b, int c) {
//        return a * b * c;
//    }
//}
//public class CompileTimePolymorphism{
//      public static  void main(String[] args) {
//        Calculator cal = new Calculator();
//        System.out.println(cal.mul(5,8));
//        System.out.println(cal.mul(5,8,8));
//    }
//}


//program three greeting

//class Greeting{
//    void greet() {
//        System.out.println("Hello!");
//    }
//    void greet(String name) {
//        System.out.println("Hello " + name);
//    }
//    public static void main(String[] args) {
//        Greeting g = new Greeting();
//        g.greet();
//        g.greet("Sam");
//    }
//}

// program 3 /p

//class Greatest {
//    void greatest(int a, int b) {
//        if (a > b) {
//            System.out.println("a is greatest = " + a);
//        } else {
//            System.out.println(" b is greatest = " + b);
//        }
//    }
//    void greatest(int a, int b, int c) {
//        if (b > c && b > a) {
//            System.out.println("b is greatest " + b);
//        } else if (a > b && a > c) {
//            System.out.println("a is greatest : " + a);
//        } else {
//            System.out.println("c is greatest  : " + c);
//        }
//    }
//}
//public class CompileTimePolymorphism {
//    static void main(String[] args) {
//        Greatest g = new Greatest();
//        g.greatest(5,6);
//        g.greatest(8,5,98);
//    }
//}

