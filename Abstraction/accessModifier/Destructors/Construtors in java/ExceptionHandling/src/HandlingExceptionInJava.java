// so what our goal is when an Exception occurs

// Don't crash and handle its & continue    with our flow of control

//************************************************************************************
// try and catch

// try --- block of code where we put the (risky code)

// syntax for this
// try {
//       code ........ }

///  Catch(preventive code)

// if exception occurs then use catch -- it handles the exceptions (maintain the flow of code )
/*
syntax for catch

catch(Exception e  )

*/

//public  class HandlingExceptionInJava {
//    public static void main(String[] args) {
//        // Exception Handling
//
//        System.out.println("Step 1 ");
//        try{ // risky co de
//            int a = 5;
//            int b = 0;
//
//            System.out.println(a/b);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Division by zero is not allowed ");
//            // illegal --> new ArithmeticException("/by zero")
//        }
//        System.out.println("Step 2 ");
//
//        // here flow of control not broken by the jvm
//
//    }
//}
//


//public class HandlingExceptionInJava {
//    public static void main(String[] args) {
//        methodA(5,0);
//    }
//    private static void methodA(int a , int b){
//        methodA(a,b);
//    }
//    private static void methodB(int a , int b){
//        try{
//            System.out.println(a/b);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Division by zero is not allowed");
//        }
//    }
//}




//public class HandlingExceptionInJava {
//    public static void main(String[] args) {
//// exception handling in chain
//        System.out.println("Step 1");
//        try{
//            methodA(5,0);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Division by zero is not allowed");
//        }
//    }
//    private static void methodA(int a , int b){
//        methodB(a,b);
//    }
//    private static void methodB(int a , int b){
//        System.out.println(a/b);// illeagle
//
//        System.out.println("step 2");
//    }
//}


// flow of control line by line
/*
main() ---> methodA()--->methodB() --->
internally stack pop the methodB() [ because methodB() does not handle the error] and move to methodA() ..
main() ---> methodA()
main() -- it also pop   from stack
so it not print the step 2 becouse jvm does not able to handle the a / b so it will not find the exception in the code
step 1


*/

//
//public class HandlingExceptionInJava {
//    public static void main(String[] args) {
//// exception handling in chain
//        System.out.println("Step 1");
//        methodA(5,0);
//
//    }
//    private static void methodA(int a , int b){
//        methodB(a,b);
//    }
//    private static void methodB(int a , int b){
//        try{
//            System.out.println(a/b);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Division by zero is not allowed");
//            System.out.println(e.getMessage());
//            // getMessage() is used to find the error type
//            /// by zero
//
////            e.printStackTrace();
//            //printStackTrace is used to find in the code where the error occured
////            [Ljava.lang.StackTraceElement;@6ce253f1
//
//        }
//        System.out.println("step 2");
//
//        // main() --- methodA() --- methodB()
//    }
//}


// Finally key word ---  its always runs
//
//public class HandlingExceptionInJava {
//    public static void main(String[] args) {
//// exception handling in chain
//        System.out.println("Step 1");
//        methodA(5,0); // jvm points to the try and catch block
//        methodA(5,2);// 2  print in output
//    }
//    private static void methodA(int a , int b){
//        methodB(a,b);
//    }
//    private static void methodB(int a , int b){
//
//        try{ // risky code
//            System.out.println(a/b);
//        }
//        catch(ArithmeticException e){
//            // preventive and handling code
//            System.out.println("Division by zero is not allowed");
//        }
//        finally {
//            // this always runs
//            System.out.println("Hey");
//
//            // cleanup code (optional)
//            // resources close , database close, logs closing
//        }
//        System.out.println("step 2");
//
//        // main() --- methodA() --- methodB()
//    }
//}


public class HandlingExceptionInJava {
    public static void main(String[] args) {
// exception handling in chain
        System.out.println("Step 1");
        methodA(5,0); // jvm points to the try and catch block
        methodA(5,2);// 2  print in output
    }
    private static void methodA(int a , int b){
        methodB(a,b);
    }
    private static void methodB(int a , int b){

        try{ // risky code
            System.out.println(a/b);
        }
        catch(NullPointerException e){
            // preventive and handling code
            System.out.println("No nulls allowed ");
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }
        finally {
            // this always runs
            System.out.println("Hey");

            // cleanup code (optional)
            // resources close , database close, logs closing
        }
        System.out.println("step 2");

        // main() --- methodA() --- methodB()
    }
}









































