package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

// 객체 생성 메인 클래스
// 실제 동작을 구현하는 메인 클래스
public class AirConSample {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon = new AirCon();
        int elapsedTime = 0; // 경과시간을 계산하기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("에어컨을 켜시겠습니까? : yes/ no");
        String isON = sc.next();
        if (isON.equalsIgnoreCase("yes")) {
            lgAirCon.setPower(true);
            lgAirCon.setAirConState();
            while (true) {
                sleep(1000);    // 1000/1000 초

            }
        }



    }
}
