package 함수형프로그래밍04;

import java.util.function.ToIntBiFunction;

//`ToIntBiFunction<String, String>` : 두개의 문자열을 입력 받고 int 값을 리턴
//`compareToIgnoreCase()`  : 두 문자열을 대소문자와 상관없이 동일한 알파벳으로 구성되어 있는지 비교
public class MethodRef {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;
        function = (a,b) -> a.compareToIgnoreCase(b); // 대소문자 구분없이 a와 b를 비교
        print(function.applyAsInt("Java8", "java11"));


        function = String::compareToIgnoreCase; // 매개 변수 생략
        print(function.applyAsInt("Java8", "java8"));

    }

    static void print (int order) {
        if (order < 0) System.out.println("사전 순입니다.");
        else if (order == 0) System.out.println("동일한 문자열 입니다.");
        else System.out.println("사전의 나중에 나옵니다.");
    }
}


