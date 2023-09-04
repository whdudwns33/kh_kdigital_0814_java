package 함수프로그래밍;
// 함수형 프로그래밍은 자바 8에서 처음 도입
// 자료 처리를 수학적 함수의 계산으로 취급하고 상태와 가변 데이터를 멀리하는 프로그래밍 패러다임.


// 객체 지향 코드로 만들기
interface Calculator {
    int sum (int a, int b); // 추상 메서드 생성. 구현시 오버라이드 필요
}

// 상속받아 오버라이드
//class Cal implements Calculator {
//    @Override
//    public int sum(int a, int b) {
//        return a + b;
//    }
//}

// 오버라이드 sum을 람다식으로 변형
//  Calculator lambda = (int a, int b) -> a + b;


// 구현
public class FunctionPrograming {
    public static void main(String[] args) {
//        Cal cal = new Cal();    // 객체 생성
//        int resault = cal.sum(3,4);
//        System.out.println(resault);

        Calculator lambda = (int a, int b) -> a + b;    // 인터페이스를 상속받아 익명객체 lamda로 만들어서 람다식으로 간단하게 구현
        int resault = lambda.sum(10, 20);         // sum 추상메서드를 쉽게 구현.
        System.out.println(resault);
    }
}
