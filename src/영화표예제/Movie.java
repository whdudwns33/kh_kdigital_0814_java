package 영화표예제;

import java.util.Scanner;

// 영화표 클래스
// 1. 좌석의 개수 결정
// 2.
public class Movie {
    int [] seat = new int[10];  //좌석의 개수를 배열로 결정. 이것은 인스턴스 필드. 객체가 생성될 때 같이 생성
    int ticketPrice;
    Movie(int price) { // 무비라는 생성자에 티켓 가격을 추가는 생성자
        ticketPrice = price;
    }

    // 메서드 생성
    // 판매된 좌석의 개수를 파악해 총 판매액을 반환
    // 혹여나 티켓 값을 바꾸고 싶다면
    int totalAmount() {
        int cnt = 0; // 지역 변수
        for (int val : seat) { // val이라는 변수는 seat라는 배열의 처음부터 끝까지 순회하는 요소 여기는 0~9까지
            if(val == 1) cnt ++;    //val이 1이면 판매된 좌석을 의미함.
                                    //지금 배열에는 값이 정해지지 않았기 때문에
                                    //0으로 채워져 있음
                                    //1을 넣으면 좌석이 구매된것이고 가격이 책정됨.
        }
        return cnt * ticketPrice;         // 반환 타입이 int형이므로 cmt *ticketPrice도 int형일 것.
    }
    void printSeat() {// 선택가능한 좌석의 리스트를 보여줌
        for (int s : seat) {
            if (s == 0) System.out.print("[ ]");  // 판매되지 않아서 공백으로 남김
            else System.out.print("[O]"); // 판매가 된 좌석을 의미
        }
        System.out.println();
    }
    void selectSeat  () { // 좌석을 판매하는 메뉴
        printSeat(); // 좌석 상태을 보여주는 메소드 호출
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석을 선택하세요 :");
        int selSeat =sc.nextInt();      // 사용자가 선택한 좌석을 입력 받음. (유저는 1부터 생각함)
        if (seat[selSeat - 1] == 0) {   // 사용자가 선택한 좌석이 판매가되었는 확인
                                        // 0부터 배열은 시작 되니까 -1을 넣은 거고
                                        // 선택된 배열의 수가 0이면 빈칸
                                        // 있으면 1이기에 이런 식으로 표현
            seat[selSeat - 1] = 1; //판매가 안된 좌석이기 때문에 판매함
            printSeat();    // 판매 이후의 좌석 상태를 다시 보여줌
        } else System.out.println("이미 판매된 자리입니다."); // else는
    }
}
