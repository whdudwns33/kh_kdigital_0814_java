package 연습;

import java.util.Scanner;

public class PR {
    public static void main(String[] args) {
// 윤년 구하기
        Scanner sc = new Scanner(System.in);             //객체 생성 (인스턴스)
        System.out.println("년도를 입력하시오 : ");         //입력 매서드
        int year = sc.nextInt();                         //맴버 변수 설정.

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년아닙니다.");
        }
    }
}
