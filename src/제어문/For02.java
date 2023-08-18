package 제어문;
// 중첩 for 문, 그중 이중 반복문
public class For02 {
    public static void main(String[] args) {
//        for(int i = 0; i <10; i++) {                // i가 0부터 9까지 10번 반복.
//                                                    // i가 0일떄는 첫번쨰 행
//            for (int j = 0; j <10; j ++) {          // 열 10개를 찍는 j
//                System.out.print("* ");             //
//            }
//            System.out.println();                   // 10개 찍고나면 100의 별이 찍힘.
//        }

//        for (int i = 2; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.printf("%d x %d = %d\n", i,j,(i*j)); //1부터 9까지 곱하기
//            }
//            System.out.println();
//        }

        for(int i = 0; i <10; i++) {                // i가 0부터 9까지 10번 반복.
            // i가 0일떄는 첫번쨰 행
            System.out.printf("[i = %d] ", i);
            for (int j = 0; j <10; j ++) {          // 열 10개를 찍는 j
                System.out.print("* ");             //
            }
            System.out.println();                   // 10개 찍고나면 100의 별이 찍힘.
        }
    }
}
