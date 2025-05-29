package AirConditional;

public class SmartAirConditioner extends AirConditioner {
    boolean autoMode = false;

    public void autoSetting(boolean onOff) {
        this.autoMode = onOff;
        if (autoMode) {
            this.setTargetTemp(20);
            this.setFanSpeed(2);
            System.out.println("스마트 에어컨: 자동 설정 모드 ON (20도 / 2단계)");
        } else {
            System.out.println("스마트 에어컨: 자동 설정 모드 OFF (수동 설정 가능)");
        }
    }
    public boolean isAutoMode() {
        return autoMode;
    }

    @Override
    public void setTargetTemp(int temp) {
        if (!autoMode) this.targetTemp = temp;
        else System.out.println("자동 모드에서는 온도 설정이 불가능합니다.");
    }

    @Override
    public void setFanSpeed(int step) {
        if (!autoMode && step >= 1 && step <= 3) this.fanSpeed = step;
        else if (autoMode) System.out.println("자동 모드에서는 바람 세기 설정이 불가능합니다.");
    }
}
