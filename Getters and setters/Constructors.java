//class Student2 {
//    public String name;
//    int rollNumber;
//    private int age;
//
//    // Default constructor
//    public Student2() {
//        this.age = 10; // default value
//    }
//
//    // Parameterized constructor
//    public Student2(String n, int rollNumber, int age) {
//        name = n;  // we can also do this
//        this.rollNumber = rollNumber;
//        this.age = age;
//    }
//
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
//
//    public int getRollNumber() { return rollNumber; }
//    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }
//
//    public int getAge() { return age; }
//    public void setAge(int age) { this.age = age; }
//}
//
//public class Constructors {
//    public static void main(String[] args) {
//
//        // Using parameterized constructor
//        Student2 s = new Student2("sameer", 548, 18);
//        System.out.println(s.getAge()); // 18
//
//        // Using default constructor
//        Student2 s2 = new Student2();
//        System.out.println(s2.getAge()); // 10
//    }
//}

// method oveloading with constructors

//class Add { // adds 2 numbers
//    int sum(int a, int b) {
//        return a + b;
//    }
//    // overloaded → adds 3 numbers
//    int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//}
//public class Constructors {
//    public static void main(String[] args) {
//        Add obj = new Add();
//        // Only one output
//        int result = obj.sum(10, 20,50);
//
//        System.out.println("Final Sum: " + result);
//    }
//}

//class Area {
//    double area(double r) { return Math.PI * r * r; }           // Circle
//    double area(double l, double w) { return l * w; }           // Rectangle
//    double area(double b, double h, int t) { return 0.5*b*h; }  // Triangle
//}
//
//public class Constructors {
//    public static void main(String[] args) {
//        Area a = new Area();
//        System.out.println(a.area(5));
//        System.out.println(a.area(4, 6));
//        System.out.println(a.area(3, 8, 1));
//    }
//}