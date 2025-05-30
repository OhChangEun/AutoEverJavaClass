package Interface2;

import Interface2.FiveG;
import Interface2.Wifi;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NetworkAdapter adapter;
        System.out.println("===네트워크 선택===");
        System.out.print("[1]Wifi ,[2]5G : ");

        int choice = sc.nextInt();
        adapter = (choice == 1) ? new Wifi() : new FiveG();

        CocoaTalk cocoaTalk = new CocoaTalk("IVE", adapter);
        cocoaTalk.writeMsg("오늘은 덥네요. 건강 조심하세요~~~");
        cocoaTalk.send();
    }
}
