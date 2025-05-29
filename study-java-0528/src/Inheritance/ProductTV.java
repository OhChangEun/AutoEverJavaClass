package Inheritance;

public class ProductTV extends ProtoType{
    String name; // 이름
    boolean isInternet; // 인터넷 기능

    public ProductTV(boolean isPower, int cnl, int vol, boolean isInternet) {
        // 부모 클래스의 매개변수가 없는 기본 생성자가 없으면 명시적으로 부모 생성자를 호출해야함.
        super(isPower, cnl, vol);

        // 오버로딩을 통해 자식 필드 초기화
        this.isInternet = isInternet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int vol) {
        if (this.channel >= 0 && channel <= 100) {
            this.volume = vol; //
            System.out.println("볼륨을 " + this.volume +"으로 변경하였습니다.");
        }
    }

    // 오버라이딩 관계 성립 여부를 문법적으로 체크해주는 어노테이션
    @Override
    public void setChannel(int cnl) {
        if (cnl > 0 && cnl < 2000) {
            this.channel = cnl;
            System.out.println("채널을 " + this.channel +"으로 변경하였습니다.");
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    
    // 메서드 오버로딩: 매개변수의 개수와 타입으로 구분하는 것.
    public void setChannel(int cnl, boolean isInternet) {
        if (isInternet) {
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        } else {
            if (cnl > 0 && cnl < 2000) {
                this.isInternet = false;
                this.channel = cnl;
                System.out.println("채널을 " + this.channel +"으로 변경하였습니다.");
            } else {
                System.out.println("채널 설정 범위가 아닙니다.");
            }
        }
    }

    void viewTV() {
        System.out.println("이름: " + name);
        System.out.println("전원: " + isPower);
        System.out.println("채널: " + channel);
        System.out.println("볼륨: " + volume);
        System.out.println("인터넷 연결: " + isInternet);
    }
}
