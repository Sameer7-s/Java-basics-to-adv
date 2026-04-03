package Encapsulation;

class Employee {
    private String Name;
    private int id;
    private String address;
}
public class Main{
    public static void main(String[] args) {
     Employee e = new Employee();
     e.Name = "Sameer";
     e.id = 554;
     e.address = "xyz";
     System.out.println("Name is : "+e.Name);
     System.out.println("Id is : "+e.id);
     System.out.println("Address is : "+e.address);
    
    }
    
}
