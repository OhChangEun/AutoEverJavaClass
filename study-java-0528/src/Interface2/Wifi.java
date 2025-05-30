package Interface2;

import Interface2.NetworkAdapter;

public class Wifi implements NetworkAdapter {
    @Override
    public void connect() {
        System.out.println("Wifi에 연결되었습니다.");
    }
    @Override
    public void send(String msg) {
        System.out.println("Wifi >> " + msg);
    }
}
