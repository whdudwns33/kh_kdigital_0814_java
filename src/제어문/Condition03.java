package 제어문;

import java.util.Scanner;

// 스위치 문. 조건에 조건식이 올 수 없고 조건의 값이 와야 함.
// 조건값에는 정수, 문자열이 올 수 있음.
// 장점은 if else에 비해 가독성이 좋음. 성능적이 좋음.
// 단점은 조건식이나 범위가 올 수 없음.
public class Condition03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요 :");
        String season = sc.next();

        switch (season) {
            case "spring" :
            case "SPRING" :     // 대문자 또한 입력하기 위함.
                System.out.println("봄입니다.");
                break;
            case "summer" :
                System.out.println("여름입니다.");
                break;
            case "fall" :
            case "autumn":      // or 연산자 같은 효과를 줌. fall 이나 autumn이면 가을 출력
                System.out.println("가을입니다.");
                break;
            case "winter" :
                System.out.println("겨울입니다.");
                break;
            default: // 모든 조건을 만족하지 않으면 도출. if문의 else같은 것.
                System.out.println("잘못 입력했습니다.");
        }
    }
}
