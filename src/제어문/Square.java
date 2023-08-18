package 제어문;

import java.util.Scanner;

// in put을 3이라고 입력하면
// out put을
// 1 2 3
// 4 5 6
// 7 8 9
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 :");
        int n = sc.nextInt();

        for (int i = 1; i <= n*n; i++) {
            System.out.printf("%4d",i);
                if(i%n == 0) {
                    System.out.println();
                }
        }
    }
}
