package 집주소예제;
// 집주소 만들기
// 입력은 숫자를 입력
// 몇자리 숫자인지 출력
// 0을 입력하면 종료

import java.util.Scanner;

public class AddressMake {
    public static void main(String[] args) {
//        int i [] = new int[10];
//        Scanner sc = new Scanner(System.in);
//
//        int sum = 0;
//        while (true) {
//            System.out.print("숫자를 입력:");
//            String num = sc.next();
//            for(int s = 0; s < i.length; s++)
//                if (num.toCharArray(0).equals("0")) {
//                    sum += 4;
//                } else if (num.equals("1")) {
//                    sum += 2;
//                } else {
//                    sum += 3;
//                }
//                break;
//        }
//        System.out.println(sum);
//    }

        // 각 숫자가 차지하는 자릿 수를 배열로 입력
        int[] numSize = {4,2,3,3,3,3,3,3,3,3};
        int sum = 0; // 입력받은 수가 차지하는 총 자리수
        Scanner sc = new Scanner(System.in);
        while (true) {
            String num = sc.next();
            if (num.equals("0")) break; // 0이 입력되면 끝남
            for (int i = 0; i < num.length(); i++) {
                sum += numSize[num.charAt(i)  -'0'] + 1; // 자릿수에 1을 더함: 각 숫자마다 여백이 한칸 존재
            }
            System.out.println(sum + 1); // 1을 더하는 이유는 처음 시작할 때 필요한 여백
            sum = 0; // while이 끝나면 다음 계산을 위해서 초기화 해야함.
        }
    }
}
