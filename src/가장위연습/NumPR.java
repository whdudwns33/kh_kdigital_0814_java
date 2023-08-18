package 가장위연습;
//
import java.util.Scanner;

public class NumPR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오 :");
        int num = sc.nextInt();
        int resualt1 = num / 100;
        int resualt2 = (num % 100) / 10;
        int resualt3 = num % 10;

        if (resualt1 > resualt2 && resualt1 > resualt3) {
            System.out.println(resualt1);
        } else if (resualt2 > resualt1 && resualt2 > resualt3) {
            System.out.println(resualt2);
        } else if (resualt3 > resualt1 && resualt3 > resualt1) {
            System.out.println(resualt3);
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
