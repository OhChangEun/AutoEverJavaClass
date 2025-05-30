package Car;

public interface AirCon {
    default String setAirCon(int isOn) {
        if (isOn == 1) return "에어컨 ON";
        else return "에어컨 OFF";
    }
}
