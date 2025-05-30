package Interface2;

public interface NetworkAdapter {
    void connect(); // 자동으로 public abstract 추가
    void send(String msg);
}
