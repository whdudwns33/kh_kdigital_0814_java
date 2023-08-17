package 상수와리터럴;
// 상수도 변수와 마찬가지로 메모리에 저장할 공간을 확보하는 것.
// 상수는 고정된 값을 의미한다. 변수는 변화함.
// 상수는 단 한번만 값을 정할 수 있음
// 값을 한번 쓰고 나면 read only 상태가 된다.
// final 이라는 키워드를 사용

// 클래스 안에서는 자료형 설정은 가능하지만 문법은 매서드 안에서 해야됨

import java.util.Scanner; // 스캐너를 사용하기 위해서는 임포트 사용

import java.util.Scanner;


public class Const {
    final static String KH_DOMAIN = "http://128.129.133.12";
    // static으로 단 한번만 지정하면 고칠 수 없음. 나중에 더 설명해 주심.
    final static String PORT_NUM = "8111";

    public static void main(String[] args) {
        System.out.println(KH_DOMAIN);
        System.out.println(PORT_NUM);
        /*
        final int AGE;         // 상수는 관례상 대문자.
                                    // final int AGE; 이것도 됨.
                                    // 자바는 선언과 별도의 대입이 가능
        char gender = 'M';
        if (gender == 'M') {
            AGE = 33;
        }
            System.out.println(AGE);
    }

         */
/*
        final double TAX_RATE = 0.1; // 세율을 고정
        Scanner sc = new Scanner(System.in); // 표준 입력을 받기 위해서
        System.out.print("수입을 입력하세요:"); // ln이 없기 때문에 줄바꿈이 없음

        int income = sc.nextInt();           // 키보드가 입력받은 값을 정수형 변수에 대입함.
        System.out.println("당신이 내야하는 세금은" + (income * TAX_RATE));


 */



    }
}
