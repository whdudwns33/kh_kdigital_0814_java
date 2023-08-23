package PC방예제;
//인원 수
//예약할 좌석 수
//결과는 거절 횟수 출력

import java.util.Scanner;

public class Pc {
    public static void main(String[] args) {
        int[] pcRoom = new int[100];        // 배열에 100까지만 설정. 즉, 피시방에 100개의 자리만 있는것
        int rejectcnt = 0, seatNum;               //
        Scanner sc = new Scanner(System.in);//
        int n = sc.nextInt();               // 인원 수를 입력 받음.
        for(int i = 0; i < n; i++) {        //
            seatNum = sc.nextInt();         //
            if(pcRoom[seatNum-1] == 1) rejectcnt++;   // 배열 [seatNum-1]의 저장 값이 1이면 자리가 있는 거니까 거절 횟수(rejectcnt)가 증가
            else pcRoom[seatNum-1] = 1;     //
        }                                   //
        System.out.println(rejectcnt);            //
    }
}



