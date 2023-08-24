package 정적멤버와메서드;

public class Static {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank sinhan = new Bank("신한", 1200);
        Bank nh = new Bank("농협", 1050);
        kakao.setDeposit(2500);
        kakao.setWithDraw(1000);
        kakao.view();

        sinhan.setWithDraw(2000);
        sinhan.view();
        System.out.println(Bank.getCnt());  // 클래스에 대한 메서드로 접근
    }
}
