package Interface;

import Interface.NetworkAdapter;

public class LTE implements NetworkAdapter {
    String company;
    public LTE(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " LTE에 연결되었습니다.");
    }
}
