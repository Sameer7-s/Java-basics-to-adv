package inheritance2;

// Parent class
class Number {
    int a = 15;
    int b = 25;
}

// Child class (inherits Number)
class Addition extends Number {
    void add() {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}

// Main class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add();
    }
}
