package Multilevel_Inheritance;

//public class Grandparent {
//}

//CONDITION 2

//public class Grandparent {
//    private String name;
//    private int age;
//    private boolean hasSuperPowers;
//
//    public  boolean isHasSuperPowers() {return hasSuperPowers;}
//
//    public Grandparent(){
//        hasSuperPowers = false;
//        System.out.println("Grandparent constructor is called ");
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setHasSuperPowers(boolean hasSuperPowers) {
//        this.hasSuperPowers = hasSuperPowers;
//    }
//}

// CONDITION 3

public class Grandparent {
    private String name;
    private int age;
    private boolean hasSuperPowers;

    public  boolean isHasSuperPowers() {return hasSuperPowers;}

    public Grandparent(int age , String name){
        this.age = age;
        this.name = name;
        hasSuperPowers = false;
        System.out.println("Grandparent constructor is called ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHasSuperPowers(boolean hasSuperPowers) {
        this.hasSuperPowers = hasSuperPowers;
    }
}

