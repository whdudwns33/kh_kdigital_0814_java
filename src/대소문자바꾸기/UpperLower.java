package 대소문자바꾸기;
//charAt(index) : 문자열에 해당하는 인덱스 문자 추출
//toCharArray() : 문자열을 문자 배열로 변환

// 방법 문자열을 입력 받아 길이만큼 순회하면서 ASCII값을 확인해서 대소문자 구분하고 계산
import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch < 'a') {
                System.out.print((char) (ch + ('a' - 'A')));
            }
            else System.out.print((char)(ch - ('a' - 'A')));
        }
    }
}
