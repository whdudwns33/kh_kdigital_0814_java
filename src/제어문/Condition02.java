package 제어문;

import java.util.Scanner;

public class Condition02 {
    public static void main(String[] args) {
        System.out.print("문자를 입력하세요 :");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);                // 문자형 자료는 분명 순서가 있고 ahrAt에서 몇번째인지 결정
        if(ch >= 'a' && ch <= 'z' ) {
            System.out.println(ch + "는 알파벳 소문자입니다.");
            // 'a'는 아스킷 코드 값 97부터 시작
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "는 알파벳 대문자입니다.");
        } else {
            System.out.println(ch + "는 알파벳이 아닙니다.");
        }
    }
}
