package 인터페이스;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        NetWorkAdaptor adaptor; // 완전 추상화가 적용되어 있는 인터페이스
        Scanner sc = new Scanner(System.in);
        System.out.println("연결할 네크워크 [1] Lan [2] Wifi [3] 5G" );
        int sel = sc.nextInt();
        switch (sel) {
            case 1:
                adaptor = new Lan("kt MegaPass");
                adaptor.connect();
                break;
            case 2:
                adaptor = new WiFi("skt");
                adaptor.connect();
                break;
            case 3:
                adaptor = new FiveG("LG U plus");
                adaptor.connect();
                break;
            default:
                System.out.println("??????");
        }
        

    }
}
