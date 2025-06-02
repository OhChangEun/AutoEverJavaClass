package Generic;

public class Powder extends Material{
    @Override
    public void display() {
        System.out.println("Power 재료로 출력합니다.");
    }
    @Override
    public String toString() {
        return "재료는 Powder 입니다.";
    }
}

class Plastic extends Material {
    @Override
    public void display() {
        System.out.println("Plastic 재료로 출력합니다.");
    }
    @Override
    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}

class Water {
    public String toString() {
        return "재료는 Water 입니다.";
    }
}
