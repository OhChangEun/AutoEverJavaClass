package Condition;

import java.util.Scanner;

public class ConditionSample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        int H = sc.nextInt(); // 줄바꿈 문자 기준으로 문자열 입력
        int M = sc.nextInt();

        if (M>=45) {
            System.out.println(H);
            System.out.println(M-45);
        } else {
            if (H==0) {
                System.out.println(23);
                System.out.println(M+60-45);
            } else {
                System.out.println(H-1);
                System.out.println(M+60-45);
            }
        }
    }
}

