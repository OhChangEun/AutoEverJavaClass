package Car;

public interface AutoDrive {
    default String setAutoDrive(int isOn) {
        if (isOn == 1) return "자율주행 ON";
        else return "자율주행 OFF";
    }
}
