package Interface;

import Interface.NetworkAdapter;

import java.util.Scanner;

public class NetworkMain {
    public static void main(String[] args) {
        NetworkAdapter adapter = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택하세요 \n[1]Wifi ,[2]5G ,[3]LTE: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                adapter = new WiFi("KT megapass");
                adapter.connect();
                break;
            case 2:
                adapter = new FiveG("SK Telecom");
                adapter.connect();
                break;
            case 3:
                adapter = new LTE("LG U+");
                adapter.connect();
                break;
        }
    }
}
