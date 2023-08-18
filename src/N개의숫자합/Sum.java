package N개의숫자합;

import java.util.Scanner;

// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 더하라
// 첫 줄에 숫자의 개수 N(1 < <100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
// 입력으로 주어진 숫자 N개의 합을 출력한다.
// 입력을 문자열로 간주해야함. 문자열하나에 하나의 문자를 주출해야함
public class Sum {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("숫자를 입력하세요 :");
//        String num = sc.nextLine();
//
//        Integer.parseInt(num);

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자의 갯수를 입력하시오 :");
        int n = sc.nextInt();
        System.out.print("숫자를 입력하시오 :");
        String num = sc.next();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += num.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
