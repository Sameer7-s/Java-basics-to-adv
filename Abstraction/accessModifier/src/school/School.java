package school;

public class School {

    private static School instance;

    private School() {
        System.out.println("School object created");
    }

    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }
}