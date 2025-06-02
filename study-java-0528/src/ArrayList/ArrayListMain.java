package ArrayList;

import java.sql.Array;
import java.util.List;
import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
//        List<String> fruits = new ArrayList<>(); // List 인터페이스의 참조 변수에 ArrayList 객체 주소 대입
//
//        // 요소 추가
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Orange");
//        fruits.add(1, "Grape");
//        System.out.println(fruits);
//
//        // 요소 가져오기: get(인덱스)
//        System.out.println(fruits.get(1));
//
//        // 요소 제거 하기: remove(인덱스)
//        fruits.remove(2);
//        System.out.println(fruits);

        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu(" 아메리카노", 2000, "Cofffe", "그냥 커피입니다.", true));
        menuList.add(new Menu(" 라떼", 4500, "Cofffe", "우유가 들어갔습니다.", true));
        menuList.add(new Menu(" 모카", 5500, "Cofffe", "달달한 커피입니다.", true));

        for (Menu menu : menuList) {
            System.out.println(menu);
        }

    }
}
