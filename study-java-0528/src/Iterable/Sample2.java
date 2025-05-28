package Iterable;

import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();

        int[][] arr = new int[input][input];
        int num = 1;
        for (int i=0; i<input; i++) {
            for (int j=0; j<input; j++) {
                arr[i][j] = num;
                num++;
            }
        }

        for (int[] row: arr) {
            for (int value : row) {
                System.out.printf("%5d", value);
            }
            System.out.println();
        }
    }
}

