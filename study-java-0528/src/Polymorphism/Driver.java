package Polymorphism;

public class Driver {
    String name;
    public Driver(String name) {
        this.name = name;
    }
    public void drive(Vehicle v) {
        System.out.print(name + "의 ");
        v.run();
    }
}
