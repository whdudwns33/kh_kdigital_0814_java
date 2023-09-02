package API03;
//values() 메소드는 해당 열거객체의 모든 상수를 저장한 배열을 생성하여 반환합니다.
//valueOf() 메소드는 전달된 문자열과 일치하는 해당 열거객체의 상수를 반환 합니다.
//ordinal() 메소드는 해당 열거체 상수가 열거체 정의에서 정의된 순서(0부터 시작)를 반환합니다.

enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }   // 열거 객체 생성 및 열거 상수 선언
enum Rainbow2 {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);
    // 상수 선언에있어서 생성자를 사용할 수 있다.

    private final int value;
    Rainbow2(int value) { // 생성자. 생성자는 항상 private
        this.value = value;
    }

    public int getValue() { // 매서드
        return value;
    }
}

public class Main02 {
    public static void main(String[] args) {
        Rainbow[] arr = Rainbow.values();       // Rainbow라는 배열에 열거 객체의 상수 저장
        for (Rainbow rb : arr) {                // 향상된 for문으로 0번쨰 열부터 마지막 열까지 대입.
            System.out.print(" values :" + rb);
        }
        System.out.println();                   // 가독성을 위해서 내가 임의로 넣은 공백 추가

        Rainbow rb1 = Rainbow.valueOf("GREEN");
        System.out.println(" valueOf :" + rb1);

        int idx = Rainbow.YELLOW.ordinal();     // 상수의 순서를 반환하는 ordinal()
        System.out.println(idx);

        System.out.println(Rainbow2.YELLOW.getValue()); // rainbow2에서 상수에 대입한 value값을 출력하기 위한 메서드 사용
    }
}


