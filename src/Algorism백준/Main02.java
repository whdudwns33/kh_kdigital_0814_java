package Algorism백준;
// 1998 베트남 문제
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (y>=1000 && y <= 3000) {
            y -= 543;
            System.out.println(y);
        } else {
            System.out.println("다시 입력하시오.");
        }
    }
}
