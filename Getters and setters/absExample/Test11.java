
abstract class Student {
    abstract void study();
}

class SchoolStudent extends Student {
    void study() {
        System.out.println("School Student is studying");
    }
}

public class Test11{
    public static void main(String[] args) {
        Student s = new SchoolStudent();
        s.study();
    }
}












//
//// Abstract class
//abstract class Student {
//
//    // data members
//    String name;
//    int marks;
//
//    // constructor
//    Student(String name, int marks) {
//        this.name = name;
//        this.marks = marks;
//    }
//
//    // abstract method (must be implemented)
//    abstract void grade();
//
//    // common method
//    void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Marks: " + marks);
//    }
//}
//
//// Science student class
//class ScienceStudent extends Student {
//
//    ScienceStudent(String name, int marks) {
//        super(name, marks);
//    }
//
//    @Override
//    void grade() {
//        if (marks >= 90) {
//            System.out.println("Grade: A");
//        } else {
//            System.out.println("Grade: B");
//        }
//    }
//}
//
//// Commerce student class
//class CommerceStudent extends Student {
//
//    CommerceStudent(String name, int marks) {
//        super(name, marks);
//    }
//
//    @Override
//    void grade() {
//        if (marks >= 80) {
//            System.out.println("Grade: A");
//        } else {
//            System.out.println("Grade: B");
//        }
//    }
//}
//
//// Main class
//public class Test11{
//    public static void main(String[] args) {
//
//        // polymorphism
//        Student s;
//
//        s = new ScienceStudent("Sameer", 92);
//        s.display();
//        s.grade();
//
//        System.out.println("-----");
//
//        s = new CommerceStudent("Rahul", 75);
//        s.display();
//        s.grade();
//    }
//}