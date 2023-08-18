package 제어문;

import java.util.Scanner;

// 삼각형 별찍기
// 입력받은 수 만큼 별찍기
// 5를 입력하면
//*
//* *
//* * *
//* * * *
//* * * * *
public class For03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 :");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1 ; j ++) { // i +1 vs n : i + 1
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
