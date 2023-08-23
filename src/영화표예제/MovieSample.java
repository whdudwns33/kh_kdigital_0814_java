package 영화표예제;
// 간단한 영화표 예제 시스템
// 사용자가 영화 극장의 좌석을 선택
// 선택하면 판매된 좌석의 개수만큼 판매금액을 계산하는 것.
// 1. 예매하기, 종료하기 메뉴 만들기 (종료하기를 선택 시 총 판매금액을 계산함)
// 2. 극장의 좌석은 10개
// 3. 각 좌석당 금액은 12,000원

import java.util.Scanner;

public class MovieSample {
    public static void main(String[] args) {
        Movie movie = new Movie(15000); // 생성자 생성. 생성자를 추가함, 좌석당 가격을 정할 수 있음
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1] 예매하기");
            System.out.println("[2] 종료하기");
            System.out.print("입력 :");
            if(sc.nextInt() == 1) movie.selectSeat();
            else {
                System.out.println("총 판매금액은 " + movie.totalAmount());
                break;
            }
        }
    }
}
