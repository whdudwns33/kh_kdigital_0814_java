package 변수와자료형;

public class DataTypeClass02 {
    public static void main(String[] args) {
      /*
        // 문자 자료형. 유니코드를 사용. 2바이트로 전세계의 모든 문자를 표현.
        // 앞의 1바이트는 아스키코드와 동일
        char ch = 'A';    // 자바에서는 문자는 작은 따옴표를 사용. ''는 문자를 의미함. ""는 숫자를 의미함
        // 실제 저장값은 정수로 저장
        String ch1 = "A"; // 문자형 데이터형은 쌍따옴표

        System.out.println(ch);
        System.out.println((int)ch); // 문자열을 정수로 변환

        System.out.println(ch1);
        //System.out.println((int)ch1);

        char ch2 = 66;               // ch2는 66 -> B 값
        System.out.println(ch2);
        System.out.println((int)ch2);

       */

        // 실수형 : float 4Byte(32bit). double 8Byte(64bit). 프로그램을 할 때는 프로그래밍을 잘 하지 않음
        // 실수형은 근사치 계산법을 사용함. 명확한 값을 가지지 않음. 정수는 명확한 값을 갖기 때문에
        // 되도록 정수로. + Byte는 앞글자가 대문자, bit는 소문자

//        float height = 175.5f; // float은 f를  꼭 붙여야함
//        double pi = 3.141592;  // 반면에 double은 굳이 글자를 붙일 필요가 없음.
//                               // 대부분 double을 사용함.

        double num1 = 0.1;
        for (int i = 0; i < 1000; i++) {
            num1 += 0.1;
        }
        System.out.println(num1);
        // i를 999번 반복.


    }
}

