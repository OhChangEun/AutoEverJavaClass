package Comparator;

import java.util.TreeSet;

public class CompMain {
    public static void main(String[] args) {
        TreeSet<CarComp> set = new TreeSet<>();
        set.add(new CarComp("코나", 2022, "흰색"));
        set.add(new CarComp("스포티지", 2022, "흰색"));
        set.add(new CarComp("쏘렌토", 2018, "은색"));
        set.add(new CarComp("그랜저", 2016, "블랙"));
        set.add(new CarComp("GV80", 2023, "회색"));
        set.add(new CarComp("GV80", 2023, "갈색"));
        // 연식과 이름만 비교하기 때문에
        // 연식과 이름이 같은 경우 더 추가되지 않음
        
        for (CarComp car : set) {
            System.out.println(car.name + ":" + car.color); // 연식 오름차순 출력
        }
    }
}
