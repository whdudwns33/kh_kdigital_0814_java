package 함수형프로그래밍03;

import java.util.function.IntBinaryOperator;

class Calculator {
    public static int staticMethod(int x, int y ) {
        return x+y;
    }
    public int instanceMethod(int x, int y) {
        return x+y;
    }
}


// 메서드 참조
// 메서드 참조(method reference)는 메소드를 참조해서 매개 변수의 정보 및 리턴 타입을 알아 내어, 불 필요한 매개 변수를 제거하는 것이 목적
public class MethodRef {
    public static void main(String[] args) {
        IntBinaryOperator operator; // 두개의 정수값을 받아 연산을 수행한 결과를 반환하는 메서드를 정의하기 위해서 사용
        // 람다식 사용 방법.
        operator = (x, y) -> Calculator.staticMethod(x,y);
        System.out.println(operator.applyAsInt(+ 10,30));
        // 정적 메서드 참조
        operator = Calculator::staticMethod;    // 매개 변수 .staticMethod (x,y) 생략 가능
        System.out.println(operator.applyAsInt(100,300));
    }
}
