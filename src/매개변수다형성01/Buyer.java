package 매개변수다형성01;
//
public class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy (Product p) { //부모 클래스의 참조변수를 매개변수로 설정하면 자식 객체에도 접근할 수 있음
        money -= p.price;
        bonusPoint += p.bonusPoint;
    }
    void viewInfo() {
        System.out.println("잔액 :" + money);
        System.out.println("보너스 :" + bonusPoint);
        }
    }

