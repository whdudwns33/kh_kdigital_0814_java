package 추상클래스02;

public class SmartPhone extends Phone{
    public SmartPhone(String name) { //
        super(name);        // 부모의 생성자 호출
    }

    @Override
    void call() {   // 추상메서드를 오버라이드 함.
        System.out.println("부모클래스(추상클래스)의 Call 메서드를 구체화함, 통화기능 구현");
    }
    public void InterNet() {
        System.out.println("인터넷 연결");
    }
}
