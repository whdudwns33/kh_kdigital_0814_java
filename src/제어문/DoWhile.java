package 제어문;
//do while문은 무조건 한번은 수행하고 조건을 물어봄
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int age; // 나이를 입력받기 위한 변수

        do {
            System.out.print("나이를 입력하시오 :");
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();

        } while (age <= 0 && age > 200);
        System.out.println("입력하신 나이는 :" + age + "입니다.");
    }
}
