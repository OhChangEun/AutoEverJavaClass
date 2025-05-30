package Interface;

import Interface.NetworkAdapter;

public class WiFi implements NetworkAdapter {
    String company;
    public WiFi(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " WiFi에 연결되었습니다.");
    }
}

