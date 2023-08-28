//package 자동차만들기실습문제;
//
//
////private int speed;  // 속도
////private int fee; // 연비
////private int tank; // 연료탱크 크기
////private int seat; // 좌석수
////private String name; // 차량이름
//
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] dist = {0, 400 , 150 , 200, 300};
//        Main car = null;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이동 지역 선택 [1]부산 [2] 대전 [3]강릉 [4]광주 : ");
//        int city = sc.nextInt();
//        System.out.print("승객 수 : ");
//        int passengers = sc.nextInt();
//        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
//        int transportation = sc.nextInt();
//        switch (transportation) {
//            case 1: car = new SportsCar("스포츠카"); break;
//            case 2: car = new Car ("승용차"); break;
//            case 3: car = new Bus ("버스"); break;
//            default: System.out.println("차량 선택을 잘못 하셨습니다.");
//
//        }
//
//        System.out.print("부가 기능 [1]ON [2]OFF : ");
//        int option = sc.nextInt();
//        if (option == 1) car.addOption(true);
//
//        System.out.print(" " + car.getCarName() + " ");
//        System.out.print("총 비용 : " + car.totalCost(dist[city]) + "원");
//        System.out.print("주유 횟수 : " + car.fuelCount(dist[city]) + "회");
//        System.out.print("총 시간 : %.2f\n");
//
//    }
//
//    private void addOption(boolean b) {
//    }
//
//    private Object totalTime(int i) {
//        return null;
//    }
//
//    private String fuelCount(int i) {
//        return null;
//    }
//
//    private String totalCost(int i) {
//        return null;
//    }
//
//    private String getCarName() {
//        return null;
//    }
//


//}package 자동차만들기실습문제;
//
//abstract class Car {
//
//    private int speed;  // 속도
//    private int fee; // 연비
//    private int tank; // 연료탱크 크기
//    private int seat; // 좌석수
//    private String name; // 차량이름
//    private int moveCount; // 이동 횟수
//
//    // 차 이름
//    public String getName(){
//        return carName;
//    }
//
//    // 이동 횟수
//    public int MoveCount(int passenger){
//        if (passenger % seat != 0) moveCount = (passenger / seat) + 1;
//        else moveCount =passenger / seat;
//        return moveCount;
//    }
//
//    public int fuelCount (int dist){
//        if (dist * moveCount / fee % tank !=0) return dist * moveCount / fee / tank + 1;
//        return dist * moveCount / fee / tank;
//
//    }
//
//    public int totalCost(int dist){
//        return dist * moveCount / fee * 2000;
//
//    }
//
//    public double tatalTime(int dist){
//        return (double) dist * moveCount / speed;
//
//    }
//
//    public abstract void addOption(boolean isOtion);
//
//
//}