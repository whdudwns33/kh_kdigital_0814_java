package 저항예제;

import java.util.Scanner;

public class Ans {
    public static void main(String[] args) {
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "blue", "violet", "grey", "white"};
        String frt, scd, thd;
        int frt1 = 0, scd1 = 0, thd1 = 0;
        Scanner sc = new Scanner(System.in);
        frt = sc.nextLine();
        scd = sc.nextLine();
        thd = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            if(frt.equalsIgnoreCase(color[i])) {    // 10의 자리 값
                frt1 = i;   // 첫번째 입력받은 문자열의 인덱스 값을 구함
            }
            if(scd.equalsIgnoreCase(color[i])) {    // 1의 자리  값
                scd1 = i;   // 두번째 입력받은 문자열의 인덱스 값을 구함
            }
            if(thd.equalsIgnoreCase(color[i])) {    // 10의 제곱, 곱하는 값
                thd1 = i;   // 세번째 입력받은 문자열의 인덱스 값을 구함
            }
        }
        System.out.println((long)(frt1*10 + scd1)* Math.pow(10, thd1));
    }
}
