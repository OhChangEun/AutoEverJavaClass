package Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        HashMap<Integer, Integer> regionMap = new HashMap();
        regionMap.put(1, 400);
        regionMap.put(2, 150);
        regionMap.put(3, 200);
        regionMap.put(4, 300);

        HashMap<Integer, Double> weatherMap = new HashMap();
        weatherMap.put(1, 1.0);
        weatherMap.put(2, 1.2);
        weatherMap.put(3, 1.4);

        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 선택 [1] 부산 [2] 대전 [3] 강릉 [4] 광주 : ");
        int type = sc.nextInt();
        if (!regionMap.containsKey(type)){
            System.out.println("*** 잘못된 지역 선택 ***");
            return;
        }
        System.out.print("이동할 승객 수 입력: ");
        int memberCount = sc.nextInt();
        if (memberCount < 1 || memberCount > 100){
            System.out.println("*** 잘못된 승객 수 입력 ***");
            return;
        }

        System.out.print("이동할 차량 선택 [1] 스포츠카 [2] 승용차 [3] 버스 : ");
        int carType = sc.nextInt();
        if (carType < 1 || carType > 3){
            System.out.println("*** 잘못된 차량 선택 ***");
            return;
        }

        System.out.print("부가 기능 [1] ON [2] OFF : ");
        int subFunc = sc.nextInt();
        System.out.print("날씨 [1] 맑음 [2] 비 [3] 눈 : ");
        int weather = sc.nextInt();
        sc.nextLine(); // ← 이 줄 추가 (버퍼 비우기)

        System.out.print("차 이름 설정: ");
        String carName = sc.nextLine();

        Car car;
        String totalTime;
        int fuelCount;
        switch(carType) {
            case 1:
                car = new SportsCar(carName);
                car.setMode(subFunc);
                System.out.println();
                System.out.println(car.getName() + ": " + ((SportsCar)car).setAudio(subFunc));
                System.out.println(car.getName() + ": " + ((SportsCar)car).setAutoDrive(subFunc));
                System.out.println("=======" + car.getName() + "=======");
                totalTime = car.calcTotalTime(regionMap.get(type), memberCount, weatherMap.get(weather));
                fuelCount = car.calcTotalOilingCount(regionMap.get(type));
                System.out.println("총 비용: " + car.calcTotalCost(regionMap.get(type)));
                System.out.println("총 주유 횟수: " + fuelCount);
                System.out.println("총 이동 시간: " + totalTime);
                break;
            case 2:
                car = new Sedan(carName);
                car.setMode(subFunc);
                System.out.println();
                System.out.println(car.getName() + ": " + ((Sedan)car).setAudio(subFunc));
                System.out.println(car.getName() + ": " + ((Sedan)car).setAirCon(subFunc));
                System.out.println("=======" + car.getName() + "=======");
                totalTime = car.calcTotalTime(regionMap.get(type), memberCount, weatherMap.get(weather));
                fuelCount = car.calcTotalOilingCount(regionMap.get(type));
                System.out.println("총 비용: " + car.calcTotalCost(regionMap.get(type)));
                System.out.println("총 주유 횟수: " + fuelCount);
                System.out.println("총 이동 시간: " + totalTime);
                break;
            case 3:
                car = new Bus(carName);
                car.setMode(subFunc);
                System.out.println();
                System.out.println(car.getName() + ": " + ((Bus)car).setAutoDrive(subFunc));
                System.out.println(car.getName() + ": " + ((Bus)car).setAirCon(subFunc));
                System.out.println("=======" + car.getName() + "=======");
                totalTime = car.calcTotalTime(regionMap.get(type), memberCount, weatherMap.get(weather));
                fuelCount = car.calcTotalOilingCount(regionMap.get(type));
                System.out.println("총 비용: " + car.calcTotalCost(regionMap.get(type)));
                System.out.println("총 주유 횟수: " + fuelCount);
                System.out.println("총 이동 시간: " + totalTime);
                break;
            default:
                System.out.println("*** 잘못된 차량 선택 ***");
                break;
        }
    }
}
