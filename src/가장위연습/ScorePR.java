package 가장위연습;
// 시험 성적 입력
// 옵션 성적이 잘 못 입력 되었으면  재입력 요구
import java.util.Scanner;

public class ScorePR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하시오 :");
        int score = sc.nextInt();

        if (score <= 100 && score >= 90) {
            System.out.println("A입니다.");
        } else if (score < 90 && score  >= 80) {
            System.out.println("B입니다.");
        } else if (score < 80 && score  >= 70) {
            System.out.println("C입니다.");
        } else {
            System.out.println("나머지는 F입니다.");
        }

    }
}
/*
강사님 답안
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하시오 :");
        int score = sc.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
            System.out.println("A");
            } else if (score >= 80) {
            System.out.println("B")
            } else System.out.println("F");
            }
        else
            System.out.println("성적을 잘못 입력했습니다.");


 */