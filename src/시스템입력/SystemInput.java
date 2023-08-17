package 시스템입력;
// scanner clss 사용하여 입력 받음.

import java.util.Scanner;

public class SystemInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너에 대한 객체 생성
        // 클래스란 설계도면.
        // new란 동적인 heap 메모리에 할당.
        // sc는 클래스에 대한 변수
        byte a = sc.nextByte();              // a라는 변수에 byte 형 입력을 받아 반환
        short b = sc.nextShort();            // b라는 변수에 short 형 입력을 받아 반환
        int c = sc.nextInt();                // c라는 변수에 int 형 입력을 받아 반환
        long d = sc.nextLong();              // d라는 변수에 long 형 입력을 받아 반환
        char ch = sc.next().charAt(0);       // next는 문자열을 입력받는 매서드.
                                             // 0번째는 첫번째 값.
                                             // 문자열에서 0번쨰(첫번쨰) 문자를 추출
        float e = sc.nextFloat();            //
        double h = sc.nextDouble();          //
        String g = sc.next();                // 공백기준으로 입력받음
        String g1 = sc.nextLine();           // 줄바꿈 문자 기준



    }

}
