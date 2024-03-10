class Student {
    private String name;
    private int age;
    private int password;

    // setter method
    public void setData(String nm, int ag, int pwd) {
        name = nm;
        age = ag;
        password = pwd;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPassword() {
        return password;
    }
}

public class Encapsul {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData("Samreen", 21, 123);

        // Example of using getter methods
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Password: " + s.getPassword());
    }
}
