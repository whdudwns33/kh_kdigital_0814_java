package 가장위연습;

import java.util.Scanner;

public class Score02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("성적을 입력하시오 :");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                if (score >= 90) {
                    System.out.println("A");
                } else if (score >= 80) {
                    System.out.println("B");
                } else System.out.println("F");
                break;
            } else
                System.out.println("성적을 잘못 입력했습니다.");


        }
    }
}
