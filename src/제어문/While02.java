package 제어문;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        int age = 0; // 나이를 입력받기 위한 변수
        Scanner sc = new Scanner(System.in);
        while (true) { //무한의 횟수를 반복하기 위한 조건식을 참으로 만듦 (반드시 탈출문이 필요함.)
            System.out.print("나이를 입력하시오 :");
            age = sc.nextInt();
            if(age > 0 && age < 200) break; // 1부터 199사이만 정상적으로 입력된 나이로 간주
            System.out.println("나이를 잘못 입력하셨습니다.");



        }
        System.out.println("입력하신 나이는 :" + age + "입니다.");

    }
}
