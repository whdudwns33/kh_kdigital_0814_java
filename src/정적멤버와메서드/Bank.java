package 정적멤버와메서드;
// 정적변수(class변수), 정적메서드는 오버라이딩이 될까?
//
public class Bank {
    private static int cnt = 0; // 정적 필드(정적 변수), 객체로 생성되지 않음. 메모리:메서드영역 에 저장됨.
    private int accout; // 계좌를 위한 필드
    private String bank; // 은행이름

    Bank(String name, int accout) {
        cnt++;
        bank = name;
        this.accout = accout;
        System.out.println(bank + "은행에 계좌를 생성합니다. 잔액은 :" + this.accout + "입니다.");
    }
    public static int getCnt() {    // 정적 메서드. 객체로 만들어지지 않음.
        return cnt;
    }
    public void setDeposit(final int dep) { // final을 붙인 이유. 상수취급해서 dep이 변화할 수 있는 상황을 예방함
        this.accout += dep;
        System.out.println(dep + "을 예금 했습니다.");
    }
    public void setWithDraw(final int wit) {
        if (wit > accout) {
            System.out.println("잔액이 부족합니다.");
        } else {
            accout -= wit;
        }
    }
    public void view() {
        System.out.println("현재 잔액은 :" + accout);
    }
}
