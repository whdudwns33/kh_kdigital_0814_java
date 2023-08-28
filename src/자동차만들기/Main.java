package 자동차만들기;

import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        boolean turnOn;
        int price = 0;
        int fee;
        int km;
        int move;
        int seatNum = 0;
        String [] arr = {"", "부산", "강릉", "대전", "광주"};


        Car sportCar = new SportCar();
        Car bus = new Bus();
        Car Suv = new Suv();


        Scanner sc = new Scanner(System.in);
        System.out.println("[1] 스포츠카 [2] 승용차 [3] 버스");
        int number = sc.nextInt();
        if (number == 1) {
            sportCar.setCar("스포츠카",250, 8, 30, 2);

        } else if (number == 2) {
            Suv.setCar("승용차",200,12,45,4);

        } else if (number == 3) {
            bus.setCar("버스",150,5, 100, 20);
        } else {
            System.out.println("다시 입력하세요.");
        }

//
//        System.out.println("[1] 부산 [2] 강릉 [3] 대전 [4] 광주");
//        int choice = sc.nextInt();
//        if (choice == 1) {
//            System.out.println("부산");
//            km = 400;
//            System.out.print(km + "km");
//        } else if (choice == 2){
//            System.out.println("강릉");
//            km = 200;
//            System.out.print(km + "km");
//        } else if (choice == 3){
//            System.out.println("대전");
//            km = 150;
//            System.out.print(km + "km");
//        } else if (choice == 4){
//            System.out.println("광주");
//            km = 300;
//            System.out.print(km + "km");
//        }
//

//        System.out.println("이동 횟수 :" + );
//        System.out.println("총비용 :" + (km/));










//        CarSample carSample = new CarSample();
//        carSample.setChoice();
//



//        System.out.println("[1] 부산 [2] 강릉 [3] 대전 [4] 광주");




    }

}
