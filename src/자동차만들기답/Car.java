package 자동차만들기답;
// 상속을 주기 위한 클래스

public abstract class Car {
    // protected 접근제한자는 같은 패키지와 상속관계에서 접근 가능
    protected int maxSpeed; // 최고 속도
    protected int fuelEff;  // 연비: 리터당 주행 거리
    protected int fuelTank; // 연료탱크 크기
    protected int seatCnt;
    protected String name;

    // 추상메서드
    abstract int setMode(boolean isMode);  // 상속받은 각각의 자동차 특수 기능


    public String getName() {
        return name;
    }

    //총이동 횟수
    int getMovingCnt (int passCnt) {// 승객 수가 필요. 입력값으로 입력
        if (passCnt/seatCnt != 0) return (passCnt / seatCnt) + 1;
        return passCnt / seatCnt;
    }
    // 총 주유 횟수
    int getRefuelCnt(int dist, int moveCnt) {// 거리와 이동 횟수를 매개 변수로 전달 받음
        if ((dist * moveCnt) / fuelEff % fuelEff != 0) return (((dist * moveCnt) / fuelEff / fuelTank) +1);
        return ((dist * moveCnt) / fuelEff / fuelTank);
    }
    // 총 이동 비용
    int getTotalCost(int dist, int moveCnt) {
        return (dist/ fuelEff) * 2000 * moveCnt;
    }
    // 총 소요 시간
    String getMovingTime(int dist, int moveCnt) {
        double getTime = (double) dist * moveCnt / maxSpeed;
        int totalMunute = (int) (getTime * 60);
        int hour = totalMunute/ 60;
        int minute = totalMunute % 60;
        return String.format("%d시간 %d분", hour, minute);
    }

}
