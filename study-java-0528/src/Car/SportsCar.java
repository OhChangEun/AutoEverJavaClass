package Car;

public class SportsCar extends Car implements Audio, AutoDrive {
    public SportsCar(String name){
        super(250, 8, 30, 2, name);
    }
    public void setMode(int isOn) {
        if(isOn == 1) {
            super.speed = (int)(super.speed * 1.2);
        } else {
            super.speed = 250;
        }
    }
}
