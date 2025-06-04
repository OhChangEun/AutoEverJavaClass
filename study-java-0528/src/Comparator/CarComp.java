package Comparator;

public class CarComp implements Comparable<CarComp>{
    String name;  // 자동차 이름
    int year;     // 연식
    String color; // 색상

    public CarComp(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    @Override
    public int compareTo(CarComp o) {
        if (this.year != o.year) {
            return Integer.compare(this.year, o.year); // 연식 비교
        }
        int nameCompare = this.name.compareTo(o.name); // 이름 비교
        if (nameCompare != 0) {
            return nameCompare;
        }
        return this.color.compareTo(o.color); // 색상 비교
    }
}
