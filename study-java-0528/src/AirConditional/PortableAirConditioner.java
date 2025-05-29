package AirConditional;

public class PortableAirConditioner extends AirConditioner {
    int battery = 100;

    @Override
    public void simulateTemperatureChange() {
        if (battery > 0) {
            super.simulateTemperatureChange();
            battery--;
        } else {
            System.out.println("배터리가 방전되었습니다. 동작 불가.");
        }
    }
    public void showBattery() {
        System.out.println("배터리 잔량: " + battery + "%");
    }
    public int getBattery() {
        return battery;
    }
}
