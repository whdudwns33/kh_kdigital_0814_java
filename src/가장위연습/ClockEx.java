package 가장위연습;

import java.util.Scanner;

public class ClockEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하시오 :");
        int h = sc.nextInt();
        System.out.print("분을 입력하시오 :");
        int m = sc.nextInt();
        int tM = m - 45;
    //
            if (h == 0) {
                System.out.print("전 날 ");
                h = 23;
            } else if(h >24) {
                h = h -24;
                System.out.print("다음날 ");
            } else;
    //
        if(tM < 0) {
            h -= 1;
            tM = m + 15;
        } else;

        System.out.println(h + ":" + tM + "알람입니다.");






//        int cal = (h * 60) + m - 45;
//        int n = m + 15;
//        int time = (cal / 60);
//        if (time == 0) {
//            System.out.print("전날 ");
//            time = 23;
//        } else if (time > 24) {
//            System.out.print("다음날 ");
//            int s =
//            time = h - 24();
//        }
//        System.out.print(time + "시" + n + "분 알람입니다.");


//        int totalMin = h*60 + m;
//        if (totalMin < 45) {
//            totalMin = 24 * 60 + totalMin;
//        }
//        totalMin -= 45;
//        System.out.println((totalMin/60) + ":" + (totalMin % 60));
    }
}




