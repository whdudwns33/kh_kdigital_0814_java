package 제어문;

import java.util.Scanner;

// 계산기 만들기. cal
public class Condition04 {
    public static void main(String[] args) {
        int x, y;  //좌변과 우변
        char op;   //연산자 자리
        Scanner sc = new Scanner(System.in);
        System.out.print("공식을 입력하시오 :");
        x = sc.nextInt();
        op = sc.next().charAt(0);    // 문자 하나를 넣기 위함
        y = sc.nextInt();
        switch (op) { //  op는 문자열 자료
            case '+' :
                System.out.println("덧셈 :" + (x + y));
                break;
            case '-' :
                System.out.println("뺼셈 :" + (x - y));
                break;
            case '*' :
                System.out.println("곱셈 :" + (x * y));
                break;
            case '/' :
                System.out.println("나눗셈 :" + (x / y));
                break;
            default:
                System.out.println("연산자를 잘못 입력했습니다.");
        }
    }
}
