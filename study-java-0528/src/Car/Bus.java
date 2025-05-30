package Car;

public class Bus extends Car implements AirCon, AutoDrive {
    public Bus(String name){
        super(150, 5, 100, 20, name);
    }
    public void setMode(int isOn) {
        if(isOn == 1) {
            super.size += 30;
        } else {
            super.speed = 100;
        }
    }
}
