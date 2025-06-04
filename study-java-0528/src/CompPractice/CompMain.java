package CompPractice;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class CompMain {
    public static void main(String[] args) {

        Comparator<CompStr> comp = new Comparator<>() {
            @Override
            public int compare(CompStr o1, CompStr o2) {
                if (o1.size != o2.size)
                    return Integer.compare(o1.size, o2.size);
                return o1.str.compareTo(o2.str);
            }
        };

        TreeSet<CompStr> set = new TreeSet<>(comp);

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<N; i++) {
            String input;
            input = sc.nextLine();

            set.add(new CompStr(input, input.length()));
        }

        for (CompStr str : set) {
            System.out.println(str.str);
        }

        sc.close();
    }
}
