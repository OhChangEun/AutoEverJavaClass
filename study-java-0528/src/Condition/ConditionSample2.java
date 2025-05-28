package Condition;

import java.util.Scanner;

public class ConditionSample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        int num = sc.nextInt();

        int hundred = num / 100;         // 백의 자리
        int ten = (num / 10) % 10;       // 십의 자리
        int one = num % 10;              // 일의 자리

        int max = hundred;

        if (ten > max) {
            max = ten;
        }
        if (one > max) {
            max = one;
        }

        System.out.println("가장 큰 자리 수: " + max);

    }
}

