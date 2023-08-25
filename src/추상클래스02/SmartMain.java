package 추상클래스02;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("아이폰");
        smartPhone.setPower(true);
        smartPhone.InterNet();
        smartPhone.call();
    }
}
