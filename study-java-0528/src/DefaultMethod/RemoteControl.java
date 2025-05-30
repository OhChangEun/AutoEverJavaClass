package DefaultMethod;

// 필드 : 모든 필드는 자동으로 final static으로 변환
public interface RemoteControl {
    final static int MAX_VOLUME = 100; // 인터페이스 생성 시 한번 생성되고 변경 불가
    int MIN_VOLUME = 0;
    public abstract void turnOn(); // public abstract가 자동 추가
    void turnOff();
    void setVolume(int vol);
    // 디폴트 메서드 : JDK 8에서 추가
    default void setMute(boolean mute) {
        if (mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
    static void changeBattery() {
        System.out.println("건전지를 교환 합니다.");
    }
//    인터페이스 이름으로 호출 가능: RemoteControl.changeBattery();
//    클래스처럼 **도구성 메서드(유틸리티)**를 정의할 때 사용함
}
