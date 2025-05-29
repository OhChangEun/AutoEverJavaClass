package Inheritance;

// 상속 : 부모 클래스의 필드, 메서드를 자식 클래스가 물려 받는 것
public class ProtoType {
    boolean isPower; // 전원 on/off
    int channel; // 채널 
    int volume; // 볼륨

    public ProtoType() {
    }

    public ProtoType(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    // setter 역할 : 내부의 인스턴스 값이 정해진 범위에서 설정되로고 해야 함
    public void setChannel(int channel) {
        if (channel > 0 && channel < 1000) {
            this.channel = channel;
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    public void setPower(boolean isPower) {
        this.isPower = isPower;
    }
}
