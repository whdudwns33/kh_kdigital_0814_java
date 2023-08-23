package KMP예제;

import java.util.Scanner;


// split("-") 이용해서 문자열을 자르고 자른 문자열의 0번째 인덱스를 선택하는 방법
// 0번째 선택, - 다음의 문자 선택
// 대문자만 고르기.
// charAt(인덱스) -> 숫자로 바뀌는 문제가 있고 또한 다양한 입력이 불가능, toCharArray()
public class Kmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // 1. charAt
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 'A' && name.charAt(i) == 'Z') {
                System.out.print(name.charAt(i));
            }
        }

        // 2. 첫번째 문자 선택, - 다음의 문자 선택
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) System.out.print(name.charAt(i));
            else {
                if (name.charAt(i) == '-') System.out.print(name.charAt(i + 1));
            }
        }
        // 3. split() 메소드를 이용하기
        String[] splitName = name.split("-"); // regex: 정규식(=패턴)을 넣을 수 있음.
        for(String n : splitName) {
            System.out.print(n.charAt(0));
        }
        // 4. toCharArray() : 문자열을 문자 배열로 변경
        char[] chName = name.toCharArray(); // 문자열을 문자 배열로 변환
        for (char ch : chName) {
            if (ch >= 'A' && ch <= 'Z') System.out.print(ch);
        }


    }
}
