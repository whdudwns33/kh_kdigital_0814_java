package 시스템입력;

import java.util.Scanner;

public class Class03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하시오 :");
        String name = sc.next(); // 띄어쓰기(정확하게는 공백)를 하면 다음으로 넘어감. 띄어쓰기 입력x
        sc.nextLine(); // 버퍼 비우기
        System.out.print("주소를 입력하시오 :");
        String addr = sc.nextLine(); // 줄바꿈이 일어나면 다음으로 넘어감. 띄어쓰기 입력O
        System.out.print("성별을 입력하시오 :");
        char gender = sc.next().charAt(0); // 입력받은 문자열에서 맨앞의 문자 1개를 추출


        System.out.print("나이를 입력하시오 :");
        int age = sc.nextInt();

        System.out.println("====회원정보 출력====");
        System.out.println("이름 :" + name);
        System.out.println("주소 :" + addr);
        System.out.println("성별 :" + gender);
        System.out.println("나이 :" + age);
    }
}
