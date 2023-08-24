package 나머지문제;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.util.Arrays.*;

public class NumberEX {
    public static void main(String[] args) {
//        int [] arr = new int[10];
//        int cnt = 0;
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            int num = sc.nextInt();
//            arr[i] = num % 42;
        int [] arr = new int[42];   // 42로 설정이게 중요
        int cnt = 0; // 42로 나누었을 때 나머지가 다를 경우의 총 횟수
        int tmp;        // 입력 받은 값
        Scanner sc = new Scanner(System.in);
        System.out.print("10개의 수 입력 :");
        for (int i = 0; i < arr.length; i++) {
            tmp = sc.nextInt();
            arr[tmp % 42] = 1;  // 여기가 제일 중요. 42로 나누면 나머지에 해당하는 인덱스에 1을 대입
        }
        for (int val : arr) {
            cnt += val;
        }
        System.out.println(cnt);
    }
}

//    public static void main(String[] args) {
//        int[] arr = new int[42];
//        int n;
//        int cnt = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("숫자 10개 입력 : ");
//        for (int i = 0; i < 10; i++) {
//            n = sc.nextInt();
//            arr[n % 42] = 1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            cnt += arr[i];
//        }
//        System.out.println(cnt);
//    }
