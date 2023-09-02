package 전자레인지예제;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        int t, a,b,c; // t는 요리시간, a는 5분, b는 1분, c는 10초
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        if (t % 10 != 0) {
            System.out.println("-1");
            return;
        }
        a = t / 300;            // 5분짜리 버튼의 몫. 5분을 몇번 눌렀는지
        b = t % 300 / 60;       // 1분 버튼이 눌린 횟수
        c = t % 300 % 60 / 10;  // 10초 버튼이 눌러진 횟수
        System.out.println(a+"번 " + b + "번 " + c + "번");
    }
}
