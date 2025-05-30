package Car;

public interface Audio {
    default String setAudio(int isOn) {
        if (isOn == 1) return "오디오 ON";
        else return "오디오 OFF";
    }
}