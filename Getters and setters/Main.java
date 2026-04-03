//////class BankAccount {
//////    private long accountNumber;
//////    private double balance;
//////
//////    public void deposit(double amount) {
//////        if (amount > 0) {
//////            balance += amount;
//////            System.out.println("Deposited: " + amount);
//////        } else {
//////            System.out.println("Invalid Deposit Amount");
//////        }
//////    }
//////
//////    public void withdraw(double amount) {
//////        if (amount > 0 && amount <= balance) {
//////            balance -= amount;
//////            System.out.println("Withdraw: " + amount);
//////        } else {
//////            System.out.println("Invalid amount or insufficient balance");
//////        }
//////    }
//////
//////    public double getBalance() {
//////        return balance;
//////    }
//////
//////}
//////
//////public class Main {
//////    public static void main(String[] args) {
//////        BankAccount bankAccount = new BankAccount();
//////
//////        bankAccount.deposit(-10);
//////        bankAccount.withdraw(10);
//////        bankAccount.deposit(100);
//////        bankAccount.withdraw(10);
//////
//////        System.out.println("Final Balance: " + bankAccount.getBalance());
//////    }
//////}
////
////
////
////// second PROGRAMMS
////
////class Student{
////    // private variables (encapsulation)
////    private String name;
////    private int rollNumber;
////    private int age;
////    private String address;
////    private String bloodGroup;
////    private String course;
////
////    // Parameterized Constructor
////    public Student(String name, int rollNumber, int age, String address, String bloodGroup, String course) {
////        this.name = name;
////        this.rollNumber = rollNumber;
////        this.age = age;
////        this.address = address;
////        this.bloodGroup = bloodGroup;
////        this.course = course;
////    }
////
////    // Getter methods
////    public String getName() {
////        return name;
////    }
////
////    public int getRollNumber() {
////        return rollNumber;
////    }
////
////    public int getAge() {
////        return age;
////    }
////
////    public String getAddress() {
////        return address;
////    }
////
////    public String getBloodGroup() {
////        return bloodGroup;
////    }
////
////    public String getCourse() {
////        return course;
////    }
////}
////
////public class Main {
////    public static void main(String[] args) {
////
////        // passing values directly in constructor
////        Student s = new Student("Faiz", 101, 20, "Bangalore", "O+", "BCA");
////
////        // getting values
////        System.out.println("Name is :" + s.getName());
////        System.out.println("Roll no is : " + s.getRollNumber());
////        System.out.println("Age is :" + s.getAge());
////        System.out.println("Address is :" + s.getAddress());
////        System.out.println("blood group: " + s.getBloodGroup());
////        System.out.println("Course : " + s.getCourse());
////    }
////}
////
////
////
////
////class Bank_details {
////    private String bank_name;
////    private String ac_holder_name;
////    private int ac_no;
////    private String ifsc_code;
////    private double bank_balance;
////    private String bank_add;
////
////    // parameterized  Constructor (FIXED)
////    public Bank_details(String bank_name, String ac_holder_name, int ac_no, String ifsc_code, double bank_balance, String bank_add) {
////        this.bank_name = bank_name;
////        this.ac_holder_name = ac_holder_name;
////        this.ac_no = ac_no;
////        this.ifsc_code = ifsc_code;
////        this.bank_balance = bank_balance;
////        this.bank_add = bank_add;
////    }
////
////    // Getters
////    public String getBank_name() {
////        return bank_name;
////    }
////
////    public String getAc_holder_name() {
////        return ac_holder_name;
////    }
////
////    public int getAc_no() {
////        return ac_no;
////    }
////
////    public String getIfsc_code() {
////        return ifsc_code;
////    }
////
////    public double getBank_balance() {
////        return bank_balance;
////    }
////
////    public String getBank_add() {
////        return bank_add;
////    }
////
////public class Main {
////    public static void main(String[] args) {
////
////        Bank_details bank_info = new Bank_details(
////                "SBI",
////                "Faiz",
////                52587,
////                "SBIN000123",
////                50000000,
////                "Bangalore"
////        );
////
////        // Getting values
////        System.out.println("Bank Name: " + bank_info.getBank_name());
////        System.out.println("Account Holder: " + bank_info.getAc_holder_name());
////        System.out.println("Account Number: " + bank_info.getAc_no());
////        System.out.println("IFSC: " + bank_info.getIfsc_code());
////        System.out.println("Balance: " + bank_info.getBank_balance());
////        System.out.println("Address: " + bank_info.getBank_add());
////    }
////}
//
//
//
////class BankDetails {
////
////    private String bankName;
////    private String accHolderName;
////    private int accNo;
////    private String ifscNo;
////    private int balance;
////    private String bankAddress;
////
////    //  Single Setter
////    public void setDetails(String bankName, String accHolderName, int accNo,
////                           String ifscNo, int balance, String bankAddress) {
////        this.bankName = bankName;
////        this.accHolderName = accHolderName;
////        this.accNo = accNo;
////        this.ifscNo = ifscNo;
////        this.balance = balance;
////        this.bankAddress = bankAddress;
////    }
////
////    // Single Getter (returns all data)
////    public String getDetails() {
////        return "Bank Name: " + bankName +
////                "\nAccount Holder: " + accHolderName +
////                "\nAccount No: " + accNo +
////                "\nIFSC: " + ifscNo +
////                "\nBalance: " + balance +
////                "\nAddress: " + bankAddress;
////    }
////}
////
////public class Main {
////    public static void main(String[] args) {
////
////        BankDetails b = new BankDetails();
////
////        b.setDetails("SBI", "Sameer", 58420055, "SBIN0001234", 800000, "Delhi");
////
////        //  Single getter call
////        System.out.println(b.getDetails());
////    }
//
//
////}
//
////class Book_details {
////    private int Book_id;
////    private String Book_title;
////    private String Author;
////
////
////    public Book_details(int Book_id, String Book_title, String Author) {
////        this.Book_id = Book_id;
////        this.Book_title = Book_title;
////        this.Author = Author;
////    }
////
////    // Getters
////    public int getBook_id() {
////        return Book_id;
////    }
////
////    public String getBook_title() {
////        return Book_title;
////    }
////
////    public String getAuthor() {
////        return Author;
////    }
////}
////
////public class Main {
////    public static void main(String[] args) {
////
////        Book_details B = new Book_details(
////                1234,
////                "Title",
////                "Martin Luther King"
////        );
////
////        System.out.println("Book_id: " + B.getBook_id());
////        System.out.println("Book_title: " + B.getBook_title());
////        System.out.println("Book_author: " + B.getAuthor());
////    }
////}
//
//
//
//
//
//class Rectangle{
//    private int Length;
//    private int Breadth;
//
//
//}
//public void Calc_Area(int Length, int Breadth){
//    this.Length = Length;
//    this.Breadth = Breadth;
//
//}
//public int getLength() {
//    return Length;
//}
//public  int getBreadth(){
//    return Bredth();
//}
//
//
//public int getArea(){
//    return Length*Breadth;
//}
//
//public class Main{
//    static void main(String[] args) {
//        Calc_Area r = new Calc_Area(8,9);
//        System.out.println("Area  : "+r.getArea());
//
//
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
