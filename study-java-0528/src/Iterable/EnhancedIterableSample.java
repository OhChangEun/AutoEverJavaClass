package Iterable;

import java.util.Scanner;

// iterable 객체 순회
public class EnhancedIterableSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 77, 88, 999, 23};
        for (int e: arr) {
            e += 100;
            System.out.print(e + " / ");
        }
        System.out.println();

        for (int e: arr) {
            System.out.print(e + " / ");
        }
        System.out.println();
    }
}
