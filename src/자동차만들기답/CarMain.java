package 자동차만들기답;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        final int[] dist = {0, 400, 150 , 200, 300};
        Car car = null; // 부모 클래스의 참조변수를 만드는데 초기값으로 널을 대입
        Scanner sc = new Scanner(System.in);
        System.out.println("1 부산 2 대전 3 강릉 4 광주");
        int city = sc.nextInt();
        System.out.println("승객수");
        int passCnt = sc.nextInt();
        System.out.println("1 스포츠카 2 승용차 3 버스");
        int carSel = sc.nextInt();
        System.out.println("부가기능 1 2");
        int option = sc.nextInt();
        boolean isMode = (option == 1) ? true : false;
        switch (carSel) {
            case 1 : car = new SportCar("스포츠카"); break;
            case 2 : car = new Sedan("세단"); break;
            case 3 : car = new Bus("버스"); break;
            default:System.out.println("다시 입력"); break;
        }
        car.setMode(isMode); // 모드에 대한 동작
        int moveCnt = car.getMovingCnt(passCnt);    // 승객의 수로 이동 횟수 구하는 메서드
        System.out.println("=".repeat(7) + car.getName() + "=".repeat(7));
        System.out.println("총비용 :" + car.getTotalCost(dist[city], moveCnt));
        System.out.println("총주유횟수 :" + car.getRefuelCnt(dist[city], moveCnt));
        System.out.println("총이동시간 :" + car.getMovingTime(dist[city], moveCnt));
    }
}
