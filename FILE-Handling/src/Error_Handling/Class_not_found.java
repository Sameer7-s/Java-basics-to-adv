//package Error_Handling;
//
//public class Class_not_found{
//    public static void main(String[] args) {
//
//        try {
////            Class.forName("Error_Handling.Class_not_found");
//            Class.forName("Student");
//            System.out.println("Class found successfully.");
//        }
//        catch (ClassNotFoundException e) {
//            System.out.println("Error: Class not found.");
//        }
//    }
//}


package Error_Handling;

class Student {
}

public class Class_not_found{
    public static void main(String[] args) {

        try {
            Class.forName("Error_Handling.Class_not");
            System.out.println("Class found successfully.");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Error: Class not found.");
        }
    }
}