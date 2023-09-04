package Algorism백준;

import java.util.Scanner;

// 조건문 1330번
public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력 :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n1 == n2) {
            System.out.println("n1 == n2");
        } else if (n1 < n2) {
            System.out.println("n1 < n2");
        } else {
            System.out.println("잘 못된 정보입니다.");
        }
    }
}
