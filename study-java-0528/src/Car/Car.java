package Car;

public abstract class Car {
    final int FUEL_COST = 2000; // 기름값
    int speed; // 속도
    int efficiency; // 연비
    int size; // 연료 탱크 크기
    int seatCount; // 좌석 수
    String name; // 차량 이름

    int moveCount;
    int totalDistance;
    double weatheRate;

    public Car(int speed, int efficiency, int size, int seatCount, String name){
        this.speed = speed;
        this.efficiency = efficiency;
        this.size= size;
        this.seatCount = seatCount;
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public int calcTotalMove(int member) { // 총 이동 횟수
        moveCount = (int)(Math.ceil((double)member/seatCount));
        return moveCount;
    }
    private int calcTotalFuelCost(int distance) { // 총 연료 소모량
        totalDistance = (int)(moveCount * distance * weatheRate); // 총 이동 횟수 * 거리
        return totalDistance / efficiency;
    }
    public int calcTotalOilingCount(int distance) { // 총 주유 횟수
        int totalFuel = calcTotalFuelCost(distance);
        return (int)Math.ceil((double)totalFuel/size);
    }
    public int calcTotalCost(int distance) { // 총 비용
        return calcTotalFuelCost(distance) * FUEL_COST;
    }
    public String calcTotalTime(int distance, int member, double weatherRate) {// 총 이동시간
        this.weatheRate = weatherRate;
        double totalDoubleTime = ((double)distance / speed * calcTotalMove(member)) * this.weatheRate;
        return parseTime(totalDoubleTime);
        // (400km) / (250km/h) * (50/) * 1.
        // >> 40h
        // 40.32
        // >> 40 + 3.2*6
    }

    public String parseTime(double time) { // 총 이동시간
        String timeStr = "";
        int intTime = (int)time;
        int integerTime = intTime;
        double floatTime = time-intTime;
        floatTime = floatTime * 10 * 6;
        floatTime = (int)(Math.ceil(floatTime));
        timeStr += intTime + "시간 " + (int)floatTime + "분";
        return timeStr;
    }
    public abstract void setMode(int isOn);
}
