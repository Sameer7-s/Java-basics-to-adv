package Encapsulation;

// simple class and object we can directlly pass the value to the variables 

// public class Student{
//     // properties / fields / instance variable & behaviour 
//     String name;
//     int rollNumber;
//     int age;
//     public static void main(String[] args) {
//         Student s= new Student();
//         // in this step we can directly change the value of name rno and age so here no boundation so it's not secure 
//         // if i want to  the user can not change the value so we use private
//         s.name ="Ram";
//         s.rollNumber = 88;
//         s.age  = 19; 

//         System.out.println("Name : " + s.name);
//         System.out.println("Roll no : " + s.rollNumber);
//         System.out.println("Age : " + s.age);

//     }
// }


// public class Student{
//     // properties / fields / instance variable & behaviour 
//     private String name;
//     int rollNumber;
//     private int age; // isi class ke andr access hoo payega
     

// public class Test{
//         public static void main(String[] args) {
//         Student s= new Student();
        
//         s.name ="Ram";
//         s.rollNumber = 88;
//         s.age = 8; 

//         System.out.println("Name : " + s.name);
//         System.out.println("Roll no : " + s.rollNumber);
//         System.out.println("Age : " + s.age);

//     }

//   }

// }

// using getters and setters


// public class Student{

//     private  String name;
//     private  int rno;
//       public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public int getRno() {
//         return rno;
//     }
//     public void setRno(int rno) {
//         this.rno = rno;
//     }
    


//       private  int age;
//     public void setname(){
//         System.out.println("Rahul");
//     }
//     public void getname(){
        
//     }
    
//     public void  setAge(int age){// setter
//         if(age<0){
//             age = 0;
//         }
//         this.age = age;

//     }

//     public int getAge(){ // getter 
//         return age;
//     }
    

//     public static void main(String[] args){
//         Student s = new Student();
//         // s.name= "Ram";
//         s.setAge(15);
//         // s.rno(879);
        
//         System.out.println(s.getAge());

//     }
// }