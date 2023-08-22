package 핸드폰요금문제;

import java.util.Scanner;

public class HandPhone {
    public static void main(String[] args) {

        // 답
        int [] call = new int[20]; //통화 횟수에 대한 통화시간을 입력 받기 위한 배열
        int yPay = 0, mPay = 0;
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) { // 통화 횟수 당 통화 시간을 입력 받음
            call[i] = sc.nextInt();
        }
        // 총 통화 요금
        for (int i = 0; i < cnt; i++) {
            yPay += (call[i] / 30) * 10 + 10; //기본적으로 한통하는 필요함, 30초 이전까지의 비용을 계산한 것.
            mPay += (call[i] / 50) * 15 + 15;
        }
        if(yPay > mPay) {
            System.out.println("M " + mPay);
        } else if (yPay < mPay) {
            System.out.println("Y " +yPay);
        } else{
            System.out.println("같다");
        }
    }
}
