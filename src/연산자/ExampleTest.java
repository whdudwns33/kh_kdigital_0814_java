package 연산자;

import java.util.Scanner;

public class ExampleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("100의 자리 변수 입력 :"); // ex 236
        int num = sc.nextInt();
        int a = num/100; // 몫을 구하는 연산자.
        int b = (num % 100) / 10; // 100으로 나눈 나머지에서 10으로 나눈 몫을 취함.
        int c = num % 10; // 10으로 나누고 나머지 6이라는 나머지를 취함.

        System.out.println("100의 자리는 " + a + "이고 10의자리는 " + b + "이고 1의 자리는 " + c + "입니다.");
    }
}
