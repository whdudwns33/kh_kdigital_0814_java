package 소수의합;

import java.util.Scanner;

// 입력받은 정수보다 작은 소수의 합을 구하시오
// 소수는 자기 자신과 1이외의 수로는 나누어지지 않는 것.
public class PrimeSum {
    public static void main(String[] args) {

//        Prime n1 = new Prime();
//        n1.setSum(12);

        // 답
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 :");
        int n = sc.nextInt();

        // 입력받은 정수 미만의 소수를 찾기 위해 반복적으로 prime 메소드를 호출
        int sum = 0;
        for(int i =2; i < n; i++) sum += prime(i);  // 2에서 입력받은 정수 미만 중 소수만 누적
        System.out.println(sum);
    }

        static int prime(int n) {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) isPrime = false;
            }

            if (isPrime) return n; // 소수인 경우 매개 변수로 전달된 값을 반환
            else return 0;
    }
}
