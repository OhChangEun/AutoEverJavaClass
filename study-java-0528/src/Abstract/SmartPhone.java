package Abstract;

// 상속받을 때 주의사항
// 1) 부모 생성자 호출
// 2) 추상 메서드에 대한 오버라이드
public class SmartPhone extends Phone{
    public SmartPhone(String name) {
        super(name);
    }
    @Override
    public void call() {
        System.out.println("부모의 요청으로 Call 기능 구현");
    }
    public void internet() {
        System.out.println("인터넷 기능을 추가 함");
    }
}
