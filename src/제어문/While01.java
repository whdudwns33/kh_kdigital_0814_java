package 제어문;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 :");
        int n = sc.nextInt();
        int sum = 0;                            //더하기 위한 변수
//        while (n>0) {                           //
//            sum += n;                           //
//            n--;                                //while문 탈출 조건
            for(int i = 1; i <= n; i++) {     //for문은 while과 동일하다.
                sum += 1;
            }
        System.out.println("답 :" + sum);
        }

    }
