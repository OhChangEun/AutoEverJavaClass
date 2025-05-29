package AirConditional;

// 1. 기본 에어컨 만들기
// -- 전원 ON/OFF
// -- 현재 온도 표시 기능
// -- 설정 온도 표시 기능
// -- 바람세기 (1단/2단/3단)
// -- 현재 상태 출력 기능
// -- 전원, 현재 온도, 설정 온도, 바람 세기

// 2. 스마트 에어컨
// - 자동 설정 기능: 20도 설정, 2단계

// 3. 휴대용 에어컨
// - 배터리 표시 기능 추가

import java.util.Scanner;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("에어컨 종류 선택 (1: 기본 / 2: 스마트 / 3: 휴대용): ");
        int type = sc.nextInt();

        AirConditioner ac;

        if (type == 2) {
            SmartAirConditioner smart = new SmartAirConditioner();
            smart.powerOn();
            System.out.print("스마트 에어컨 자동 모드 설정 (true/false): ");
            boolean auto = sc.nextBoolean();
            smart.autoSetting(auto);
            if (!auto) {
                System.out.print("설정 온도 입력: ");
                smart.setTargetTemp(sc.nextInt());
                System.out.print("바람 세기 입력 (1~3): ");
                smart.setFanSpeed(sc.nextInt());
            }
            ac = smart;

        } else if (type == 3) {
            PortableAirConditioner portable = new PortableAirConditioner();
            portable.powerOn();
            System.out.print("설정 온도 입력: ");
            portable.setTargetTemp(sc.nextInt());
            System.out.print("바람 세기 입력 (1~3): ");
            portable.setFanSpeed(sc.nextInt());
            ac = portable;
        } else {
            ac = new AirConditioner();
            ac.powerOn();
            System.out.print("설정 온도 입력: ");
            ac.setTargetTemp(sc.nextInt());
            System.out.print("바람 세기 입력 (1~3): ");
            ac.setFanSpeed(sc.nextInt());
        }

        int elapsed = 0; // elapsed: 경과 시간(초)을 저장하는 변수.
        boolean changed = false; // changed: 온도 변화가 발생했는지 여부를 저장하는 플래그.

        while (ac.getPowerStatus()) {
            Thread.sleep(1000);
            elapsed++;

            int threshold = 6; // 온도 변화 주기

            switch (ac.getFanSpeed()) {
                case 1:
                    threshold = 6;
                    break;
                case 2:
                    threshold = 3;
                    break;
                case 3:
                    threshold = 2;
                    break;
                default:
                    System.out.println("잘못된 바람 세기 설정. 기본값 6초 적용");
            }

            if (elapsed >= threshold) {
                changed = true;
                elapsed = 0;
            }

            if (changed) {
                ac.simulateTemperatureChange();
                ac.showAllSetting();
                if (ac instanceof PortableAirConditioner) {
                    ((PortableAirConditioner) ac).showBattery();
                }
                changed = false;
            }

            if (ac.getCurrTemp() == ac.getTargetTemp()) {
                System.out.println("✅ 설정 온도 도달. 에어컨 종료.");
                ac.powerOff();
            }
        }

    }
}
