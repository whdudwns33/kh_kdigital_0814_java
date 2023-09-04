package 예외처리03;

import 추상클래스02.Phone;

// NullPointException (NPE) : 자바에서 발생할 수 있는 대표적인 런타입 에러. 참조하려는 객체가 없는 경우 발생.
public class ExceptionEx {
    public static void main(String[] args) {
        Test test = null;               // 객체화가 되지 않음.
//        String teststr = test.name;     // 인스턴스화(객체화)가 되지 않은 name 출력
//        System.out.println(teststr);    // NullPointException 발생. 객체가 없는 것.

        // 01.
//        try {
//            String teststr = test.name;
//            System.out.println(teststr);
//        } catch (NullPointerException e) {
//            System.out.println("NPE가 발생했습니다.");
        // 02. 방어 코드
        if (test != null) {
            String teststr = test.name;
            System.out.println(teststr);
        } else {
            System.out.println("test가 null입니다.");
        }
    }
}

class Test {
    String name = "마법사";

}
