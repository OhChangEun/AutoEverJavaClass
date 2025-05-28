package Iterable;

import java.util.Scanner;

public class Sample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = sc.nextInt();

//        // 1) 조건을 제대로 안주면 틀린다. while(num)
//        while (num > 0) {
//
//        }
//
//        // 2) 다른 scope라도 이름이 같은 변수를 쓸 수 없다.
//        int x = 0;
//        {
//            int x = 0;
//        }
//
//        // 3) 한번 값을 집어넣을 수 있다.
//        final String name;
//        name = "곰돌이 헌터";

        int sum = 0;
        while (num > 0) {
            sum += num;
            num--;
        }

        for (int i=0; i<=num; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
