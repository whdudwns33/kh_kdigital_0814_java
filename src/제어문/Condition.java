package 제어문;

import java.util.Scanner;

// 조건문은 조건을 만족하는 경우와 만족하지 않는 경우로 나누어 수행하는 것.
public class Condition {
    public static void main(String[] args) {
        // is ~ else : 참인 경우와 거짓인 경우를 나누어 수행
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오 :");
        int num = sc.nextInt();
        if(num > 100) {
            System.out.println(num + "은(는) 100보다 큽니다.");
        } else if (num == 100) {
            System.out.println(num + "은(는) 100과 같습니다.");
        } else {
            System.out.println(num + "은(는) 100보다 작습니다.");
        }
    }
}
