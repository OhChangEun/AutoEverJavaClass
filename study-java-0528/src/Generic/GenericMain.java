package Generic;

public class GenericMain {
    public static void main(String[] args) {
//        Person<String> p1 = new Person<>("장원영");
//        Person<Integer> p2 = new Person<> (1000);
//        System.out.println(p1.info);
//        System.out.println(p2.info);
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);
        powderPrinter.getMaterial().display();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);
        plasticPrinter.getMaterial().display();

        // Water 클래스는 Material 상속을 받지 않아서 사용할 수 없다.
//        GenericPrinter<Water> watercPrinter = new GenericPrinter<>();
    }
}

class Person<T> {
    T info;
    Person(T info) {
        this.info = info;
    }
}
