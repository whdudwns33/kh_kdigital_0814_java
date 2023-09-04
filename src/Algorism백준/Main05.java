package Algorism백준;
// 9498번
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        System.out.println((score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F");
        // 위는 삼항 연산자 쓴거고 이거 아니면 if, else if 사용할 것
    }
}
