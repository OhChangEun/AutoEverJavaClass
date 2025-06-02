package Arrays;

// 배열을 다루기 위한 다양한 메소드 포함
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysMain {
    public static void main(String[] args) {
//        Integer[] arr = {5, 4, 3, 7, 9, 8, 2, 1};
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        for(int item : arr) {
//            System.out.println(item + " ");
//        }

        // 이름의 길이 순으로 정렬하고 길이가 같은 경우 사전 순으로 정렬하기
        String[] fruits = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                "Mango", "Watermelon", "Cherry", "Plum", "Peach"};

        // 익명의 함수
        Arrays.sort(fruits, new Comparator<String> () {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else if (o1.length() < o2.length()) return -1;
                else return o1.compareTo(o2); // 길이 같을 경우 사전순
            }
        });
        System.out.println(Arrays.toString(fruits));

    }
}
