package 함수형프로그래밍02;
// 매개변수 람다식
@FunctionalInterface    // 함수형 프로그램을 만들기 위한 어노테이션. 어떤 동작을 하기 보다는 `함수로 쓸꺼다` 라고 알리는 효과
                        // 추가로 인터페이스 내부에 추상메서드는 하나만 구현되어야 함.
interface FuncInterface {
    void method(int x); // 추상 메서드. 상속받아서 구현 필요. 혹은 람다식으로 구현
//    void method2(int x); // 함수를 하나만 구현해야됨.
}

@FunctionalInterface
interface FuncInterface02 { // return값이 있는 람다식
    int min (int x, int y); // return값이 있기 때문에 데이터형을 선언해야함
}


public class Lambda {
    public static void main(String[] args) {
        FuncInterface fx = x -> {   // x는 매개 변수. 매개변수가 하나이면 소괄호 생략 가능. 추상 메서드를 구현.
            int resault = x * 5;
            System.out.println(resault);
        };
        fx.method(10);

        FuncInterface02 fx2 = (x,y) ->  (x < y) ? x : y; // 구현부가 한줄이면 중괄호 생략 가능. return 생략
        System.out.println(fx2.min( 3,5));
    }
}
