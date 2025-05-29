package AirConditional;
import java.util.Calendar;

public class AirConditioner {
    boolean isPowerOn;
    int currTemp;
    int targetTemp;
    int fanSpeed;

    public AirConditioner() {
        int[] monthTemp = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 4};
        int month = Calendar.getInstance().get(Calendar.MONTH);
        this.currTemp = monthTemp[month];
        this.isPowerOn = false;
        this.currTemp = 25;
        this.targetTemp = 24;
        this.fanSpeed = 1;
    }
    public void powerOn() {
        isPowerOn = true;
        System.out.println("전원이 켜졌습니다.");
    }
    public void powerOff() {
        isPowerOn = false;
        System.out.println("전원이 꺼졌습니다.");
    }
    public void setTargetTemp(int temp) {
        targetTemp = temp;
    }
    public void setFanSpeed(int speed) {
        if(speed == 1 || speed == 2 || speed == 3) {
            fanSpeed = speed;
        } else {
            System.out.println("1,2,3단만 설정할 수 있습니다");
        }
    }
    public void showAllSetting() {
        System.out.println("전원 상태: " + (isPowerOn ? "ON" : "OFF"));
        System.out.println("현재 온도: " + currTemp + "℃");
        System.out.println("설정 온도: " + targetTemp + "℃");
        System.out.println("바람 세기: " + fanSpeed + "단");
    }
    public Boolean getPowerStatus() {
        return isPowerOn;
    }
    public int getCurrTemp() {
        return currTemp;
    }
    public int getTargetTemp() {
        return targetTemp;
    }
    public int getFanSpeed() {
        return fanSpeed;
    }
    public void simulateTemperatureChange() {
        if (targetTemp < currTemp) currTemp--;
        else if (targetTemp > currTemp) currTemp++;
    }
}
