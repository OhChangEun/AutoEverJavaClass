package ObjectClass;

// java.lang.Object: 모든 클래스의 최상위 부모 클래스
public class ObjectMain {
    public static void main(String[] args) {
        Student student = new Student();

        // 클래스명@16진수해시코드
        System.out.println(student);
        System.out.println(student.toString());
    }
}

class Student extends Object {

}
