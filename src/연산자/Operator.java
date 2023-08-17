package 연산자;

import java.util.Scanner;

// 산술연산자. 사칙연산. +-*/ 과  나머지 연산자(%)
// 0은 지정되어 나누기가 될 수 없음. num2에 0이 되면 나누기 안됨.
public class Operator {
    public static void main(String[] args) {
        int num1 = 10, num2 = 4;
        /*
        System.out.println("덧셈 :" + (num1 + num2));
        System.out.println("뺼셈 :" + (num1 - num2));
        System.out.println("곱셈 :" + (num1 * num2));
        System.out.println("나눗셈 :" + ((double)num1 / num2));
        // 더블을 지정하지 않으면 정수끼리 나누고 나머지는 삭제 so, 더블을 함수 안에 쓰는것
        // 추가로 묵시적 변환이 발생. num1에만 더블 지정.

        System.out.println("나머지 :" + (num1 % num2));
        System.out.println("몫 :" + (num1 / num2));

         */
// 대입 연산자. 변수에 값을 대입하는 연산자( = ) , 프로그램에서 = 은 같다라는 의미가 아닌 대입한다는 의미
// == vs =
        /*
        System.out.println(num1 += 2);
        // 복합대입 연산자: num1 = num1 + 2; num1에다가 2를 더한 후 num1에 대입해라
        // 만약 num1에 값을 지정하지 않으면 초기화 값이 없어서 어떠한 변화가 일어나지 않음.
        System.out.println(num1 -= 2);
        // 여기서는 10이 나옴, 왜냐, 앞서 10에서 12로 바뀌고 다시 2를 빼니까
        System.out.println(num1 *= 2);
        System.out.println(num1 /= 2);
         */
// 증감연산자. 단항연산자 피연산자의 값을 1증가 또는 1감소 시키는 연산자
//        System.out.println(++num1); // 11 전위 연산자
//        System.out.println(num1++); // 11 why? 후위 연산자. 값을 일단 도출하고 그 후에 더한다.
        /*
        int tmp = num1++;
        System.out.println(tmp);     // 10 일단 도출함
        System.out.println(num1);    // 11 도출된 값에 1이 더해진 후 그것을 보여줌

         */
// 비교연산자. 두개의 피연산자를 비교해서 크다 작다를 판단
        int x = 10;
        int y = 20;
        boolean rst1, rst2, rst3;
        System.out.println(x > y); // 자바는 참 거짓으로 판단. 반면 c언어는 0(거짓)과1(참)로 표현
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x != y); // 같지 않다를 표현
        System.out.println(x >= y);
        System.out.println(x <= y);
// 논리연산자.
// &&(and 연산자) 둘다 참인 경우 참.
// || (or 연산자) 둘 중 하나만 참이어도 참.
// ! : NOT 연산자. 현재의 조건이 참이면 거짓으로 , 거짓이면 참으로
        /*
        rst1 = (x > 0) && (x > y);      // 거짓
        rst2 = (x > 0) || (x > y);      // 참
        rst3 = !((x > 0) || (x < y));   // 거짓
            System.out.println(rst1 + " " + rst2 + " " + rst3);

         */
// 삼항 연산자. 3개의 피연산자를 필요로 하는 연산자.
//        Scanner sc = new Scanner(System.in); // 키보드의 입력을 받기 위해서
//        System.out.print("나이를 입력하세요. :");
//        int age = sc.nextInt();
//        boolean isAdault = (age > 19) ? true : false;
//        System.out.println(isAdault);
// 문자열 결합 연산자
//        System.out.println("Java" + 18.04 + 12);    // 문자열이 앞자리라 뒷 자리도 문자열로 인식
//        System.out.println(3 + 3.3 + "JDK");        // 앞자리가 숫자라 합이 이루어짐.
// 연산자 우선순위 확인
        int val1 = 5;
        int val2 = 5;
        int val3 = 5;
        int result1, result2, result3;

        result1 = val1 + val2 * val3;
        result2 = (val1 + val2) * val3;
        result3 = val1 + (++val2) * val3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
