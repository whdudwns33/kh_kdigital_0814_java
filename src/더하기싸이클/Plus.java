package 더하기싸이클;
// 입력 받은 두자리 수를 각각 더하고 ex.11 => 1+1
// 원래의 수의 1의 자리 수와 더한 수를 이어 붙이는 싸이클로 ex. 1 2
// 원래의 수로 돌아가려면 몇번 반복 해야하는 가?

import java.util.Scanner;

// 0~ 99 사이의 수 입력
// 1의 자리 숫자는 앞자리에 0을 삽입
//
public class Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int input = sc.nextInt();       // 최초 숫자를 입력받음
        int cnt = 0;                    // 총 싸이클의 누적 횟수
        int calcNum = input;            // 최초 입력값이 변경되지 않도록 하기 위해서
        int divSum = 0;                 // 수를 10의 자리와 1의 자리로 분리해서 더하기 위한 변수
        int newNum = 0;

        while (true) {  // while은 보통 몇번 반복할지 모를 떄 사용
            cnt++;
            divSum = (calcNum/10 + calcNum%10); // 10의 자리와 1의 자리를 분리해서 더함
            newNum = (calcNum % 10) * 10 + (divSum % 10);
            if (newNum == input) {
                break;
            }
            calcNum = newNum;
        }
        System.out.println(cnt);
//
//
//            int num = sc.nextInt();
//            int ten = num / 10;
//            int one = num % 10;
//            //여기에 while문을 넣기
//
//            int sum = ten + one;
//        }
    }
}
