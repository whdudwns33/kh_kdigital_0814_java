package 제어문;
// for  (초기식; 조건식; 증감식) {참인동안 수행되는 구문}
// 주로 정해진 횟수를 반복하는 경우에 사용된다.

public class ForEx {
    public static void main(String[] args) {
//        for(int i = 1; i <= 100; i++) {
//            System.out.printf("%4d", i);           // 4칸에 글을 작성. 양수는 오른쪽 기준으로
//            if (i % 10 == 0) System.out.println(); // 한줄에 10개씩 찍는다.
//        }


//        int i = 1;
//        while (true) {
//            System.out.printf("%4d", i);           // 4칸에 글을 작성. 양수는 오른쪽 기준으로
//            if (i % 10 == 0) System.out.println(); // 한줄에 10개씩 찍는다.
//            i ++;
//            if(i >100) break;
//        }
        int i = 1;
        for(;;) {
            System.out.printf("%4d", i);           // 4칸에 글을 작성. 양수는 오른쪽 기준으로
            if (i % 10 == 0) System.out.println(); // 한줄에 10개씩 찍는다.
            i++;
            if(i >100) break;
        }


    }
}
