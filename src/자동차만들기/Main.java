package 자동차만들기;

import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
//        String [] arr = {"", "부산", "강릉", "대전", "광주"};
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
    }
}
