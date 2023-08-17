package 시스템입출력;

import java.util.Scanner;

// 줄맞춤 샘플 + 정확히 알 수 없으니 일단 자세한 부분은 생략
public class Class02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 :");      // 정수입력 프린트
        int n = sc.nextInt();
        for(int i = 1; i <= n*n; i++) {
            System.out.printf("%4d", i);
            if(i % n == 0)
                System.out.println();
        }
    }
}
