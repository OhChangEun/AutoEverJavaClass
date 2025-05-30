package Abstract;

public abstract class AbstractMain {
    public static void main(String[] args) {
        // 추상 객체 생성 시
        // 익명 내부 클래스 (Anonymous Inner Class) 자동 생성
//        Phone phone = new Phone("ds") {
//            @Override
//            void call() {
//
//            }
//        };

        // 부모 클래스의 참조 변수에 자식 객체를 대입
        Phone smartPhone = new SmartPhone("iPhone 16 Pro");
        smartPhone.setPower(true);
        smartPhone.call();

        // 자식에게만 있는 기능은 형변환 필요
        if (smartPhone instanceof SmartPhone) {
            ((SmartPhone)smartPhone).internet();  // 안전하게 형변환
        }
    }
}
