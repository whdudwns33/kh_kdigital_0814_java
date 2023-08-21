package 상근날드;

import 배열을통한정렬.ArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class Bugger {
    public static void main(String[] args) {
        int [] menu = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴입력 :");
        for (int i =0; i < menu.length; i++) {
            menu[i] = sc.nextInt();             // 금액을 입력받음
        }
        int minB = menu[0];                     // 금액이 가장 낮은 햄버거
        int minD = menu[3];                     // 금액이 가장 낮은 음료
        for(int i =0; i < menu.length; i++) {
            if (i < 3 && minB > menu[i]) {
                minB = menu[i];
            }
            if (i > 2 && minD > menu[i]) {
                minD = menu[i];
            }
        }
        System.out.println(minB + minD - 50);
    }
}
