package Polymorphism;

public class Vehicle {
    public void run() {
        System.out.println("차량이 달립니다.");
    }
}
class SportsCar extends Vehicle {
    @Override
    public void run() {
        System.out.println("스포츠카가 달립니다.");
    }
}
class Sedan extends Vehicle {
    @Override
    public void run() {
        System.out.println("세단이 달립니다.");
    }
}
class Suv extends Vehicle {
    @Override
    public void run() {
        System.out.println("SUV가 달립니다.");
    }
}
