package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptMain {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        try {
//            for (int i=0; i<=5; i++) {
//                arr[i] = i;
//                System.out.println(arr[i]);
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("없는 파일"));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
