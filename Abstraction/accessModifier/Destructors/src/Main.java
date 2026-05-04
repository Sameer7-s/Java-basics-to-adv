// Destructors  (method create hone se phle destroy hona)

//It is used to free memory and release resources used by the object.
//A destructor is a special method/function that is called when an object is destroyed

// that's why we use garbage collectors

/*

1 basic java garbage collector  --- Java deletes unused objects.
2 finalize()                     ------Old way to show object destroy.
3 Modern Resource cleanup Progrma   -----Used to close files or resources safely.


*/

// 1 program using garbage collector

// 1
//class Demo{
//    Demo(){
//        System.out.println("Object is created");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        Demo d = new Demo();
//        //Object ka reference remove ho gaya, now Garbage Collector can remove it.
//
//        d = null;
//        System.out.println("Object is ready for garbage collection");
//    }
//}

/* out put
Object is created
Object is ready for garbage collection
*/

// 2 finalize() similiar like destructor program

//class Demo{
//    // constructor is created
//    Demo(){//
//        System.out.println("Object created  because constructor is called here ");
//    }
//    protected void finalize(){
//        // protected is key word use when we want a member is accessable in the same package and it can also inherit the child class
//        // This method may be called before the object is removed from memory.
//
//        System.out.println("finalize called : object is destroyed here");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        // object created of Demo class
//        // here the constructor Demo is called
//        Demo d = new Demo();
//
//        d = null;// d = null means the reference variable is cleared, so the object becomes eligible for garbage collection.
//
//        System.gc();// This requests Garbage Collector to clean unused objects.
//
//        System.out.println("End of main method");
//    }
//}

/*
output
Object created  because constructor is called here
End of main method
finalize called : object is destroyed here
*/

//3. Modern Java Resource Cleanup Program
//
class FileResource  implements  AutoCloseable{
    //here implements means when a class wants to use an interface.
    // // Autoclosable is an interface in java

    // constructor created as FileResource and it runs when object is created
    FileResource(){
        System.out.println("File Opened");
    }
    void readFile(){
        System.out.println("Reading the files ");
    }
    public void close(){
        // This method is automatically called after try block ends
        // close() method comes from AutoCloseable interface.

        System.out.println("File is closed Automatically");

    }
}
public class Main{
    public static void main(String[] args) {
        try(FileResource file = new FileResource()){
            // FileResource object is created here.
            // try is block it is used to write code  when code have chances to give an erorr  / exception
            // / After this block ends, close() is called automatically.
            file.readFile();

        }
        System.out.println("program ended");
    }
}

/*
File Opened
Reading the files
File is closed Automatically
program ended
 */