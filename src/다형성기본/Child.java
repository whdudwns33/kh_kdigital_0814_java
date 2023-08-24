package 다형성기본;

// 자식 클래스
public class Child extends Parent {
    private int x = 100;
    public Child() {
    }

    public void out() {
        System.out.println("부모의 protected num 필드 : " + money);
        System.out.println("자식클래스의 메서드");
    }

    @Override
    public void display() {
        System.out.println("상속받아 제외한 메서드");
    }
}
