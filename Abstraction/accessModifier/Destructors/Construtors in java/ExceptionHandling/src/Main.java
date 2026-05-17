// Exception handling
// problem
// erorr and exception


// What is an Exception
// A recoverable / handleable abnormal condtion that occurs during the program execution

// jab bhi exception ata hai to java object return


/*

for example
int num = a/b;
 a = 3;
 b = 0;
 c = 3/0;

 divide by zero is exception
 error--- arthemetic exception error

 so  for handling this 0 we can use  the exception file handling

*/

/*
Errors
we can not recover this if there is an error in your code
// two types

1 ] ... Out of memory error
2 ] ... Stack overflow error


1 ] ... Out of memory error
if heap memory is full..so java give this error

we can not create the object on that time so java throw
out of memory error



2] stack overflow error
if Stack  memory is full..so java give this error


 */

// exception handling
// case 1

//class Demo{
//    public static void main(String[] args) {
//        int num = 5/0;
//        System.out.println(num);
//    }
//}
/*
out put will give error
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Demo.main(Main.java:54)
 */


 //case 2

//class Demo{
//    public static void main(String[] args) {
//        main(args); // recursive call so it will full the memory
//    }
//}

// why we need exception handling

//class Demo {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 0;
//
//        System.out.println("Step 1");
//
//        System.out.println(a / b); // exception
//        // here java desrupt the flow of control and than the program terminated here
//
//        System.out.println("Step 2");
//    }
//}

// how to handle the Exception ???
/*

first way of thinking how we can handle these exceptions

// exception handling means jo bhi problem aa rhi hai code me to tum exactly decide kr pao ki hona kya
chahiye file me

a/b

if(b==0) // this is preventive measure or also called graceful handling
sout("B can't be 0)

else      // exception handling agar hum nhi krege toh JVM khud se decide kr lega
          // means code ko terminate kr dega and flow of control desruppt kr dega
           // user experience better rhta h (koi bhi apni application me crash nhi chahta)
           // for example  you mad a website for a reastaurant so when you fetch the info from db to frontend
           // if there is some issue with that so its SQL exception
b !=0

a/b will work

 */


// understanding the error

// Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Demo.main(Main.java:83)

//class Demo {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 0;
//        System.out.println(a / b); // exception
//        // jvm says : new Arithmetic  Exception("/ by Zero"); and throw this
//        // ()--- inside braces the JVM internally pass the message for passing the zero
//
//    }
//}


//class Demo {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 0;
//
//        methodA(a,b);
//
//
//    }
//    private static void methodA(int a , int b){
//        methodB(a , b);
//    }
//    private static void  methodB(int a , int b){
//        System.out.println(a/b);
//    }
//}
/*
this throw this error

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Demo.methodB(Main.java:145)
	at Demo.methodA(Main.java:142)
	at Demo.main(Main.java:137)

Process finished with exit code 1
*/

// so here concept arise we don't want default method error throw by the compile
//  so we want we handel the exceptions




