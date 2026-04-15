// basic syntax of java
//public class Main{
//    public static  void main(String[] args){
//        System.out.println("Hello sam");
//    }
//}
//operators in java

//public class Main{
//        public static void main(String[] args){
//            int a = 9;
//            int  b = 3;
//            int sum = a + b;
//            int diff  = a - b;
//            int div = a / b;
//            int mul = a * b;
//            System.out.println("Sum is : "+sum);
//            System.out.println("Sum is : "+diff);
//            System.out.println("Sum is : "+div);
//            System.out.println("Sum is : "+mul);
//    }
//}

// taking input from the user

//import  java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //scanner function
//        int num = sc.nextInt();
//        System.out.println("You Entered : "+num);
//        }
//    }
// data types
// primitive data types [ int , double , float , char , boolean ]

//    public class Main {
//        static void main(String[] args) {
//            int age = 9;
//            float price = 2442.94f;
//            double pi = 3.14159;
//            char grade = 'A';
//            Boolean isJava = true;
//            System.out.println("Age is :"+age );
//            System.out.println(price);
//            System.out.println(pi);
//            System.out.println(grade);
//            System.out.println(isJava);
//            }
//}


//  NON PRIMITIVE DATA TYPE [ STRING , ARRAY []]

// concept
/*

Step 1
import java.util.Scanner;
Step2

Scanner sc = new Scanner(System.in);

Step 3

String name = sc.nextLine();
double percentage = sc.nextDouble();
double percentage = sc.nextDouble();
boolean isStudent = sc.nextBoolean();

| Method          | Use                |
| --------------- | ------------------ |
| `nextLine()`    | String (full line) |
| `next()`        | Single word        |
| `nextInt()`     | Integer            |
| `nextDouble()`  | Decimal            |
| `nextBoolean()` | true/false         |




*/




//public class Main{
//    static void main(String[] args) {
//        String name = "Sameer";
//        int [] numbers = {1,2,5,2,2,5,3};
//        System.out.print(name +" \n");
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//    }
//}

// input and OUTPUT FUNCTION IN JAVA
//import java.util.Scanner;
//public class Main { // Sum of 2 number by taking input from the user
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter 1st number : ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter 2nd number : ");
//        int num2 = sc.nextInt();
//
//        int sum = num1+num2;
//        System.out.println("Sum is : "+sum);
//
//    }
//}

//import java.util.Scanner;
//public class Main {
//    static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name : ");
//         String name = sc.nextLine();
//         System.out.println("Entered name is : "+name);
//
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//
//        System.out.print("Enter your percentage: ");
//        double percentage = sc.nextDouble();
//
//        System.out.print("Are you a student (true/false): ");
//        boolean isStudent = sc.nextBoolean();
//
//        System.out.println("\n--- Your Details ---");
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Percentage: " + percentage);
//        System.out.println("Student: " + isStudent);
//    }
//}


// TYPES OF OPERATORS IN JAVA
/*
 1st) => Arithmetic  operators
 2nd => Relational and comparison operator
 3rd =>Logical operators
 4th => Assignment operators
*/

//1st) => Arithmetic  operators [ + , - , * , / , % ]
// used for performing basic maths tasks
//public class Main {
//    static void main(String[] args) {
//        int a = 2;
//        int b = 10;
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a % b);
//        System.out.println(a / b);// integer division
//
//    }
//}
// 2nd => Relational and comparison operator
// Used to compare values → result is true/false

//public  class Main {
//    static void main(String[] args) {
//        int a =  10 , b = 5;
//        System.out.println(a == b);
//        System.out.println(a != b);
//        System.out.println(a >= b);
//        System.out.println(a <= b);
//        System.out.println(a > b);
//        System.out.println(a < b);
//
//
//    }
//}


// 3rd =>Logical operators And /or/ Not
    //public class Main{
    //    static void main(String[] args) {
    //        int age = 20;
    //
    //        System.out.println(age>18 && age<25);
    //        System.out.println(age>18 || age<25);
    //        System.out.println(!(age>18));
    //    }
    //}
    //
    //


// controll statements[ if , if-else, switch ,for , while , do while , break , continue ]
//import java.util.Scanner;
//public class Main{
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age : ");
//        int age = sc.nextByte();
//        if(age>18){
//            System.out.println("You can vote ");
//        }
//    }
//}

// IF ELSE
//import java.util.Scanner;
//public class Main{
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age : ");
//        int age = sc.nextByte();
//        if(age>18){
//            System.out.println("You can vote ");
//        }else{
//            System.out.println("You can't vote");
//        }
//    }
//}

// Else if

//import java.util.Scanner;
//public class Main{
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks : ");
//        int marks = sc.nextByte();
//        if(marks>=90){
//            System.out.println(" Grade A ");
//        }else if (marks>= 70){
//            System.out.println("Grade B");
//        }else if(marks>=50){
//            System.out.println("Grade C");
//        }else{
//            System.out.println("Failed in Exam");
//        }
//    }
//}

// SWITCH STATEMENT
//import java.util.Scanner;
//public class Main{
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your day : ");
//        int day = sc.nextByte();
//         switch (day){
//             case 1: System.out.println("Monday");break;
//             case 2: System.out.println("Tuesday");break;
//             case 3: System.out.println("Wednesday");break;
//             case 4: System.out.println("Thursday");break;
//             case 5: System.out.println("Friday");break;
//             case 6: System.out.println("Saturday");break;
//             case 7: System.out.println("Sunday");break;
//             default:
//                    System.out.println("Invalid day ");
//              //   break stops execution
//                // default runs if no match
//         }
//
//    }
//}

// For loop
/// Best when you know how many times to run

//public class Main {// print number 1 to 10
//    static void main(String[] args) {
//        int n = 10;
//        for(int i = 0; i<n;i++){
//            System.out.print(i);
//        }
//    }
//}
//
//
//public class Main { ///  printing table
//    static void main(String[] args) {
//        int n = 10;
//        for(int i = 1; i<=n;i++){
//            System.out.println(i*n);
//        }
//    }
//}



// while loop
//Runs until condition becomes false
//public class Main {
//    static void main(String[] args) {
//        int i = 1;
//        while (i <= 5) {
//            System.out.println(i);
//            i++;
//        }
//    }
//}


// DO while loop
//Runs at least once (important point!)

//public class Main {
//    static void main(String[] args) {
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        }while(i<=5);
//
//    }
//}

//3. Jump Statements
//Used to control loop flow

// break

// Stops loop immediately

// continue
// skips current iterations
//public class Main {
//    static void main(String[] args){
//        for (int i = 0; i <= 8;i++){
//            if(i == 4){
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
//}

// ARRAY
// declaration int arr[];  or int [] arr;
// initialization of an array
//int[] arr = {10,20,30,2};
/*

3. Accessing Elements
int[] arr = {10, 20, 30};

System.out.println(arr[0]); // 10
System.out.println(arr[1]); // 20

Index starts from 0
*/


//public class Main { //PRINTING ARRAY ELEMENTS
//    static void main(String[] args) {
//        int[] arr = {1,2,8,3};
//        for(int i = 0; i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//
//    }
//}

//public class Main {// SUM OF ARRAY ELEMENTS
//    static void main(String[] args) {
//        int[] arr = {1,2,8,3};
//        int sum = 0;
//        for(int i = 0; i<arr.length;i++){
//            sum = sum + arr[i];
//        }
//        System.out.println("Sum of array is : "+sum);
//    }
//}

//public class Main {//  find max of array
//    static void main(String[] args) {
//        int[] arr = {1,2,8,3};
//        int max = arr[0];
//        for(int i = 0; i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println("Max of array is : "+max);
//    }
//}


//public class Main {//  reverse an array
//
//    static void main(String[] args) {
//        int[] arr = {1, 2, 8, 3};
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length -i  - 1];
//            arr[arr.length-i - 1] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//
//}
//


//METHODS IN JAVA[BLOCK of code ]
/*
SYNTAX
returnType methodName(parameters) {
    // code
}
TYPES OF METHODS

| Type                    | Description              |
| ----------------------- | ------------------------ |
| No parameter, no return | `void greet()`           |
| Parameter, no return    | `void add(int a, int b)` |
| Parameter + return      | `int add(int a, int b)`  |
| No parameter + return   | `int getValue()`         |


 */

// simple program

//class Demo {// simple method
//    void greet() {
//        System.out.println("Hello!");
//    }
//
//    public static void main(String[] args) {
//        Demo obj = new Demo();
//        obj.greet();
//    }
//}


// METHOD WITH PARAMETER
//class Demo{
//    void add(int a , int b ){
//        System.out.println(a+b);
//    }
//
//    public static void main(String[] args) {
//        Demo obj = new Demo();
//        obj.add(9,3);
//    }
//}
//


// Method with Return Type
//class Demo {
//    int add(int a , int b ) {
//        return a + b;
//    }
//    public static void main(String[] args) {
//        Demo obj = new Demo();
//        int result = obj.add(5,6);
//        System.out.println(result);
//
//    }
//}

// METHOD Overloading

// Method Overloading is a feature in Java where multiple methods have the
// same name but different parameters (different number,
// type, or order of parameters) within the same class
//class Demo {
//    int add(int a , int b ) {
//        return a + b;
//    }
//    int add (int a , int b , int c ){
//        return  a + b + c ;
//    }
//    public static void main(String[] args) {
//        Demo obj = new Demo();
//        System.out.println(obj.add(5,5));
//        System.out.println(obj.add(5,6,8));
//
//    }
//}


//Classes and object in java
//class Student {
//    String name;
//    int id;
//
//    void display() {
//        System.out.println("Name is :"+ name + " \n" + "Id is : "+id);
//    }
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.name = "Sameer";
//        s1.id = 798;
//
//        s1.display();
//    }
//}
//
//

// CONSTRUCTORS IN JAVA
//A constructor is a special method used to initialize objects.
// It is called automatically when an object is created


/*
Types of constructors
1 Default constructors
2 Parametrized Constructors
3 Constructor Overloading
 */


//class Student { // Constructor with no parameters
//    int id;
//    String name;
//
//    Student() {
//        id = 100;
//        name = "Default";
//    }
//
//    void display() {
//        System.out.println(id + " " + name);
//    }
//
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.display();// default constructors
//    }
//}



//2 Parametrized Constructors
//Constructor with parameters
//class Student {
//    int id;
//    String name;
//
//    Student(int i, String n) {
//        id = i;
//        name = n;
//    }
//
//    void display() {
//        System.out.println(id + " " + name);
//    }
//    public static void main(String[] args) {
//        Student s1 = new Student(101, "Sameer");
//        s1.display();
//    }
//}

//3. Constructor Overloading
//Multiple constructors with different parameters

//class MathOperation {
//
//    // Method 1
//    int add(int a, int b) {
//        return a + b;
//    }
//
//    // Method 2 (3 parameters)
//    int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    // Method 3 (double type)
//    double add(double a, double b) {
//        return a + b;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        MathOperation obj = new MathOperation();
//
//        System.out.println(obj.add(4, 5));        // 2 int
//        System.out.println(obj.add(4, 5, 9));     // 3 int
//        System.out.println(obj.add(7.5, 8.5));    // double
//    }
//}

class Animal{
    void sound(){
        System.out.println("Animal makes sound  ");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog barks ");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println(",meoww... ");
    }
}
class Main{
    static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();

    }
}