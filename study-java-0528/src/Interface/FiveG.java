package Interface;

import Interface.NetworkAdapter;

public class FiveG implements NetworkAdapter {
    String company;
    public FiveG(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " 5G에 연결되었습니다.");
    }
}
