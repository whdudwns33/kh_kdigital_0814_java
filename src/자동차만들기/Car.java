package 자동차만들기;

import java.util.Scanner;

public interface Car {
//    private static int speed;
//    private static int fee;
//    private static int tankSize;
//    private static int seatNum;
//    private static String name;

    public void setCar(String CarName, int speed, int fee, int tankSize, int seatNum);

}


class SportCar implements Car {
    private static int speed;
    private static int fee;
    private static int tankSize;
    private static int seatNum;
    private static String name;
    private static boolean turnOn;
    private int move;
    private int disCnt;
    private static int liter;
    private static int km;
    private static int price = km*liter;
    private int moveCount;
    private int cost;
    private int time;
    private double minute;


    @Override
    public void setCar(String name,int speed, int fee, int tankSize, int seatNum) {
        this.speed = speed;
        this.name = name;
        this.fee = fee;
        this.tankSize = tankSize;
        this.seatNum = seatNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("보조기능 선택 :[1] yes [2] no");
        int sellect = sc.nextInt();

        if (sellect == 1) {
            turnOn = true;
        } else;
        if(turnOn == true) {
            System.out.println("속도가 20% 증가합니다.");
            speed *= 1.2;
            System.out.println(speed);
        } else {
            System.out.println("보조기능을 선택하지 않았습니다.");
        }


        System.out.print("승객 수 : ");
        int passengers = sc.nextInt();

        if (passengers % seatNum != 0) move = (passengers / seatNum) + 1;
        else move =passengers / seatNum;


        System.out.println("[1] 부산 [2] 강릉 [3] 대전 [4] 광주");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("부산");
            km = 400;
            price = km*liter;
        } else if (choice == 2){
            System.out.println("강릉");
            km = 200;
            price = km*liter;
        } else if (choice == 3){
            System.out.println("대전");
            km = 150;
            price = km*liter;
        } else if (choice == 4){
            System.out.println("광주");
            km = 300;
            price = km*liter;
        } else;

        //결과 도출 
        //이동횟수
        if (passengers % seatNum != 0) {
            moveCount = (passengers / seatNum) + 1;
        } else {
            moveCount = passengers / seatNum;
        }
        //연로
        int fuel = km*moveCount/fee%tankSize;
        if (fuel != 0) {
            fuel += 1;
        } else;
        //연료 횟수
        if (km * moveCount / fee % tankSize !=0) {
            disCnt = (km * moveCount) / (fee*tankSize) + 1;
        } else {
            disCnt = (km * moveCount) / (fee * tankSize);
        }
        //비용
        cost = km*moveCount/ fee * 2000;
        //총시간
        time = (km * moveCount / speed);
        minute = ((((double)km * (double)moveCount ) / (double)speed) - 14) * 60;
        //도출
        System.out.println("총비용 :" + cost);
        System.out.println("이동횟수 :" + moveCount);
        System.out.println("주유횟수 :" + disCnt);
        System.out.println("총시간 :" + time + " : " + minute);
    }
}

class Bus implements Car {
    private static int speed;
    private static int fee;
    private static int tankSize;
    private static int seatNum;
    private static String name;
    private static boolean turnOn;
    private int move;
    private int disCnt;
    private static int liter;
    private static int km;
    private static int price = km*liter;
    private int moveCount;
    private int cost;
    private double time;
    private double minute;

    @Override
    public void setCar(String name,int speed, int fee, int tankSize, int seatNum) {
        this.speed = speed;
        this.name = name;
        this.fee = fee;
        this.tankSize = tankSize;
        this.seatNum = seatNum;


        Scanner sc = new Scanner(System.in);
        System.out.println("보조기능 선택 :[1] yes [2] no");
        int sellect = sc.nextInt();
        if (sellect == 1) {
            turnOn = true;
        } else;
        if(turnOn == true) {
            System.out.println("연료탱크가 늘어납니다.");
            tankSize += 30;
        } else {
            System.out.println("보조기능을 선택하지 않았습니다.");
        }


        System.out.print("승객 수 : ");
        int passengers = sc.nextInt();

        if (passengers % seatNum != 0) move = (passengers / seatNum) + 1;
        else move =passengers / seatNum;


        System.out.println("[1] 부산 [2] 강릉 [3] 대전 [4] 광주");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("부산");
            km = 400;
            price = km*liter;
        } else if (choice == 2){
            System.out.println("강릉");
            km = 200;
            price = km*liter;
        } else if (choice == 3){
            System.out.println("대전");
            km = 150;
            price = km*liter;
        } else if (choice == 4){
            System.out.println("광주");
            km = 300;
            price = km*liter;
        } else;

        //이동횟수
        if (passengers % seatNum != 0) {
            moveCount = (passengers / seatNum) + 1;
        } else {
            moveCount = passengers / seatNum;
        }
        //연로
        int fuel = km*moveCount/fee%tankSize;
        if (fuel != 0) {
            fuel += 1;
        } else;
        //연료 횟수
        if (km * moveCount / fee % tankSize !=0) {
            disCnt = (km * moveCount) / (fee*tankSize) + 1;
        } else {
            disCnt = (km * moveCount) / (fee * tankSize);
        }
        //비용
        cost = km*moveCount/ fee * 2000;
        //총시간
        time = (km * moveCount / speed);
        minute = ((((double)km * (double)moveCount ) / (double)speed) - 14) * 60;
        //도출
        System.out.println("총비용 :" + cost);
        System.out.println("이동횟수 :" + moveCount);
        System.out.println("주유횟수 :" + disCnt);
        System.out.println("총시간 :" + time + " : " + minute);
    }
}

class Suv implements Car {
    private static int speed;
    private static int fee;
    private static int tankSize;
    private static int seatNum;
    private static String name;
    private static boolean turnOn;
    private int move;
    private int disCnt;
    private static int liter;
    private static int km;
    private static int price = km*liter;
    private int moveCount;
    private int cost;
    private double time;
    private double minute;

    @Override
    public void setCar(String name,int speed, int fee, int tankSize, int seatNum) {
        this.speed = speed;
        this.name = name;
        this.fee = fee;
        this.tankSize = tankSize;
        this.seatNum = seatNum;

        Scanner sc = new Scanner(System.in);
        System.out.println("보조기능 선택 :[1] yes [2] no");
        int sellect = sc.nextInt();
        if (sellect == 1) {
            turnOn = true;
        } else;

        if(turnOn == true) {
            System.out.println("트렁크가 좌석으로 변경됩니다.");
            seatNum += 1;
        } else {
            System.out.println("보조기능을 선택하지 않았습니다.");
        }


        System.out.print("승객 수 : ");
        int passengers = sc.nextInt();

        if (passengers % seatNum != 0) move = (passengers / seatNum) + 1;
        else move =passengers / seatNum;


        System.out.println("[1] 부산 [2] 강릉 [3] 대전 [4] 광주");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("부산");
            km = 400;
            price = km*liter;
        } else if (choice == 2){
            System.out.println("강릉");
            km = 200;
            price = km*liter;
        } else if (choice == 3){
            System.out.println("대전");
            km = 150;
            price = km*liter;
        } else if (choice == 4){
            System.out.println("광주");
            km = 300;
            price = km*liter;
        } else;

        //이동횟수
        if (passengers % seatNum != 0) {
            moveCount = (passengers / seatNum) + 1;
        } else {
            moveCount = passengers / seatNum;
        }
        //연로
        int fuel = km*moveCount/fee%tankSize;
        if (fuel != 0) {
            fuel += 1;
        } else;
        //연료 횟수
        if (km * moveCount / fee % tankSize !=0) {
            disCnt = (km * moveCount) / (fee*tankSize) + 1;
        } else {
            disCnt = (km * moveCount) / (fee * tankSize);
        }
        //비용
        cost = km*moveCount/ fee * 2000;
        //총시간
        time = (km * moveCount / speed);
        minute = ((((double)km * (double)moveCount ) / (double)speed) - 14) * 60;
        //도출
        System.out.println("총비용 :" + cost);
        System.out.println("이동횟수 :" + moveCount);
        System.out.println("주유횟수 :" + disCnt);
        System.out.println("총시간 :" + time + " : " + minute);
    }
}


class CarSample {

    private static int liter;
    private static int km;
    private static int price = km*liter;
    private int moveCount;


    //    private static int choice;
    Car car;



    String [] arr = {"", "부산", "강릉", "대전", "광주"};
    String [] str = {"", "스포츠카", "승용차", "버스"};


    public void setChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] 부산 [2] 강릉 [3] 대전 [4] 광주");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("부산");
            km = 400;
            price = km*liter;
        } else if (choice == 2){
            System.out.println("강릉");
            km = 200;
            price = km*liter;
        } else if (choice == 3){
            System.out.println("대전");
            km = 150;
            price = km*liter;
        } else if (choice == 4){
            System.out.println("광주");
            km = 300;
            price = km*liter;
        } else;
    }
}
