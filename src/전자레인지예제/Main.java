package 전자레인지예제;
// 요리시간 입력
// 전자레인지로 5분짜리로 나누고 나머지에서 1분짜리로 나누고 거기서 10초로 나누고
// 버튼 구현은 잘 모르겠음


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요리시간을 입력하세요. 단위는 --초입니다.");
        int cook = sc.nextInt(); // 요리시간 입력
        // 버튼을 누른 횟수
        int second;
        int minute;
        int five;

//        int cook1 = cook % 300;
//        int cook2 = cook1 % 60;
//        int cook3 = cook2 % 10;

        if (cook % 10 == 0) {
            five = cook / 300;
            minute = cook % 300 / 60;
            second = cook % 300 % 60 / 10;
            System.out.println("5분 :" + five + "번 1분 : " + minute + "번 10초 :" + second + "번.");
        }
        else {
            int cook1 = cook - (cook % 10) + 10;
            five = cook1 / 300;
            minute = cook1 % 300 / 60;
            second = cook1 % 300 % 60 / 10;
            System.out.println("5분 :" + five + "번 1분 : " + minute + "번 10초 :" + second + "번.");
//            System.out.println("-1");
        }
    }
}
