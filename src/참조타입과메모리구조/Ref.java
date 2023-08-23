package 참조타입과메모리구조;
// 자바의 타입(데이터)은 기본타입과 참조타입으로 나누어 진다.
// 기본탑입은 정수, 실수, 문자, 논리값 등을 저장하는 타입이다. (실제값이 변수에 저장된다.)
// 침조타입 객체의 주소를 변수에 저장한다. (배열, 열거형, 인터페이스, 클래스, 문자열)

public class Ref {
    public static void main(String[] args) {
        /*
        int age = 25; // 정수형(4바이트) age라는 변수에 25라는 값을 저장.
        double prince = 100.1; // 실수형(8바이트) price라는 변수에 100.1을 저장함.
        // 참조타입
        String name = "임릉";
        // 8바이트(운영체계는 6bit로 8Byte 데이터는 어떤 저장공간에도 사용가능)
        // name에는 Stirng(문자열)으로 만들어진 실제 "임릉"이라는 문자열이 없고 주소가 있음.

        int box1 = 0;      // int형의 기본타입이므로 값을 대입해야함.
        Integer boxedValue = null; // 0도 가능함
        // 객체타입
        // int형의 참조 타입 주소를  입력하기만 하면 됨.
        int intValue = boxedValue;
        System.out.println(intValue);
        // nullpointException : 값이 지정되지 않았음. -> 노션에 잘 정리되어있음


         */

        String strVal1 = "나희도";                     // 리터럴 상수로 고정된다.
        String strVal2 = "나희도";
        String strVal3 = new String("나희도");  // heap 영역에 메모리 공간을 확보 함.

        // 참조 변수에서 ==, != :주소가 같은가 물어보는 것. 왜냐하면 실제 값을 갖는게 아니라 주소를 갖기 때문
        if (strVal1 == strVal3) { // 주소가 같은지 물어보는 것.
            System.out.println("strVal1과 strVal3는 참조하는 주소가 같음");
        } else {
            System.out.println("주소가 다름");
        }


        if (strVal1.equals(strVal3)) { // 포함된 내용이 같은 지(문자열) 물어보는 것.
            System.out.println("strVal1과 strVal3의 내용이 같음");
        } else {
            System.out.println("내용이 다름");
        }

    }
}
