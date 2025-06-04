package CompPractice;

public class CompStr {//implements Comparable<CompStr>{
    String str;
    int size;

    public CompStr(String input, int size) {
        this.str = input;
        this.size = size;
    }

//    @Override
//    public int compareTo(CompStr o) {
//        if (this.size != o.size) {
//            return Integer.compare(this.size, o.size);
//        } else {
//            return this.str.compareTo(o.str);
//        }
//    }
}
