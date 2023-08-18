package N개의숫자합;

import java.util.Scanner;

// 문자열을 입력받으면 asd -> dsa로 반전
// 문자열의 길이는 length()를 사용
//
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력:");
        String input = sc.next();
        int pos = input.length() -1;  // 문자열의 반전된 시작위치를 찾음

        while (pos > -1) {
            System.out.print(input.charAt(pos));
            pos--;
        }
    }
}
