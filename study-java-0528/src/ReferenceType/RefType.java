package ReferenceType;

public class RefType {
    public static void main(String[] args) {
        String name1 = "안유진";
        String name2 = "안유진";
        String name3 = new String("안유진");

        if (name1 == name2) {
            System.out.println("name1과 name2의 참조하는 주소가 같음");
        } else {
            System.out.println("name1과 name2의 참조하는 주소가 다름");
        }

        if (name1.equals(name3)) {
            System.out.println("name1과 name3의 값이 같음");
        } else {
            System.out.println("name1과 name3의 값이 다름");
        }
    }
}
