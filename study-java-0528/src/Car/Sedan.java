package Car;

public class Sedan extends Car implements Audio, AirCon {
    public Sedan(String name){
        super(200, 12, 45, 4, name);
    }
    public void setMode(int  isOn) {
        if(isOn == 1) {
            super.seatCount = 5;
        } else {
            super.seatCount = 4;
        }
    }
}
