package 추상클래스02;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("아이폰");
        smartPhone.setPower(true);
        smartPhone.InterNet();
        smartPhone.call();

        // 익명객체 예제
        Phone phone = new Phone("목업") { // Phone은 추상클래스이기 때문에 객체 생성이 안됨.
                                               // 따라서 익명 객체로 만들고 단 한번만 실행 후 종료
                                               // 메서드의 역할도 갖음.

            @Override
            void call() {
                System.out.println("목업폰입니다. 통화 안됨");
            }
        };
        phone.call();
    }
}
