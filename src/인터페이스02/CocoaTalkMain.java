package 인터페이스02;
// 만들어진 메서드와 객체 등을 구현하기 위한 클래스
import java.util.Scanner;

public class CocoaTalkMain {
    public static void main(String[] args) {
        CocoaTolk cocoaTolk = new CocoaTolk("궁수");
        cocoaTolk.writeMessage("안녕하세요");
        NetWorkAdaptor netWorkAdaptor;                  // 상속을 주기 위한 인터페이스. 객체생성이 안됨. 참조변수 선언만
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 [1]와이파이 [2]5G");
        int sel = sc.nextInt();
        if (sel == 1) netWorkAdaptor = new Wifi();     //상속을 준 인터페이스를 통해 자식객체에 접근
        else netWorkAdaptor = new FiveG();
        cocoaTolk.send(netWorkAdaptor);
    }
}
