package 연산자;
// 윤년 계산하기
import java.util.Scanner;

public class OperatorTset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하시오 :"); // ln을 안붙이는 것은 줄바꿈을 하지 않겠다는 뜻.
        int year = sc.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {// 조건이 참인 경우 수행되는 구간
            System.out.println(year +"는 윤년입니다.");

        } else {// 조건이 거짓인 경우 수행되는 구간
            System.out.println(year +"는 윤년이 아닙니다.");
        }
    }
}
