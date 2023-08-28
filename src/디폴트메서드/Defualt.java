package 디폴트메서드;

import java.util.Scanner;

public class Defualt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품 선택 [1]TV, [2]Audio : ");
        int sel = sc.nextInt();
        RemoteCont rc;
        if(sel == 1) {
            rc = new Audio();
            rc.turnON();
            rc.setVolume(20);
            rc.setMute(true);
            RemoteCont.changeBattery(); // 정적메서드로 선언되어서 클래스 이름으로도 접근이 가능하다.
        }
        else {
            rc = new TV();
            rc.turnON();
            rc.setVolume(30);
        }
    }
}
