package FieldAndMethod;

// 필드 : 클래스 내부에 선언된 변수 (인스턴스 필드, 정적 필드, 지역 변수)
// 메서드 : 클래스 내부에 정의된 기능을 수행하는 함수 (순수 기능 부분, 게터와 세터)
// 학교명은 고정, 학번, 이름, 주소
public class OOP1 {
    public static void main(String[] args) {
        Member member1 = new Member();
        member1.setNum(100);
        member1.setName("장원영");
        member1.setAddr("인천시");

        Member member2 = new Member(200, "안유진", "대전시");

        System.out.println(member1.getName());
        System.out.println(member2.getName());
        System.out.println(Member.getSchool());

    }
}
