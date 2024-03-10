// example for class and object in java
class Dog{
    String name;
    String color;
    double cost;

    // methods
    void bark(){
        System.out.println("Dog is barking");
    }
    void eat(){
        System.out.println("Dog is eating");
    }
    void sleep(){
        System.out.println("Dog is sleeping");
    }
}
public class obj {
    public static void main(String[] args) {
        // creating objects
        // d is the reference variable
        Dog d=new Dog();
        // calling methods
        d.bark();
        d.eat();
        d.sleep();
    }
}
