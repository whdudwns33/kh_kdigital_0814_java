package 예외처리04;

import java.util.Scanner;

// 연산오류와 방어 코드. ArithmeticExceotion
// finally 예외에 상관없이 출력
// 0으로 나누면 Unchecked 예외발생.
public class Main {
    public static void main(String[] args) {
        int r = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("나눗셈 입력 :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                r = a/b ;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하시오.");
                continue;
            } finally { // 예외에 상관없이 무조건 수행
                System.out.println("예외에 상관없이 도출되는 finally :" + a + "," + b);
            }
            System.out.println("결과 :" + r);
            break;
        }
    }
}
