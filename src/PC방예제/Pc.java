package PC방예제;

import java.util.Scanner;

public class Pc {
    public static void main(String[] args) {
        int[] pcRoom = new int[100];        //
        int cnt = 0, seatNum;               //
        Scanner sc = new Scanner(System.in);//
        int n = sc.nextInt();               //
        for(int i = 0; i < n; i++) {        //
            seatNum = sc.nextInt();         //
            if(pcRoom[seatNum-1] == 1) cnt++;   //
            else pcRoom[seatNum-1] = 1;     //
        }                                   //
        System.out.println(cnt);            //
    }
}



