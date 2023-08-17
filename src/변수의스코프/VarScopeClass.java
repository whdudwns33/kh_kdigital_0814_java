package 변수의스코프;
// 변수가 할당되고 사용되는 범위 확인
public class VarScopeClass {
    public static void main(String[] args) {
//        int value = 10;         // int 형
//        int sum = value + 20;
//            System.out.println(sum);
//        int n = 20;
//        if(n > 10) { // 블록 스코프 m은 지역변수로 지역안에서만 사용됨
//            int m = 30;
//            m = n - 30;
//            System.out.println("m 값은 :" + m);
//        }
//        int m = 30;
//        int k = n + m; // 에러가 난다. 이유는 m이 지역 변수 밖으로 나와서 존재하기 때문에.
//    }
//    String test = "서울";
//    System.out.println(test);
        byte num1 = 127; // -128 ~ 127.
        num1++;          // 오버플로우가 생겨서 -128로 값이 뒤집힘.
        System.out.println(num1);
        // 부호 비트는 0이면 양수, 1이면 음수



    }
}
