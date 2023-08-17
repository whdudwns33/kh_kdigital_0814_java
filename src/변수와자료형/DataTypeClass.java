package 변수와자료형;
// 변수란 값을 저장할 수 있는 메모리 공간에 이름을 붙이는 것.
public class DataTypeClass {
    public static void main(String[] args) {
        int age; // 정수형 변수 선언. 4바이트(32Bit) 공간을 확보하고 초기값은 설정하지 않음. 정수값을 저장하는 목적
                 // 정수란 소숫점 이하가 없는 수
        double value; // 실수값을 저장하기 위한 변수 선언

        /*
        int 1st; : 숫자가 가장 처음 오면 안됨
        int class; : class는 예약어(자바에서 사용하는 문법)라서 사용이 불가하다.
        int a#@; : 특수문자는 _ & 만 가능하다.
        반면에
        int ____123; 가능하다
        int $$$___;  가능하다
         */
        
        int taxRate; // 카멜 표기법: 자바는 camel 표기법을 사용한다.
        char gender = 'M'; // 선언과 동시에 초기화. gender 라는 변수에 문자 M을 대입한다.

        // 논리형
        boolean isTrue = true; // 참과 거짓을 판별하기 위해 사용하는 자료형. true ir false의 예약어 로만 선언
                               // 다른 언어는 꼭 그럴 필요는 없음
        // 정수형 : 소숫점 이하가 없고 양수와 음수가 존재
        byte bNum1; // Byte 크기의 변수 선언 1Byte == 8Bit (-128 ~ 127 : 0의 존재로 2의 8승인 256개를 표현)
        short sNum; // 2Byte 크기의 변수 선언
        int iNum;   // 4Byte -> 기본
        long lNum;  // 8Byte
        // short 와 byte는 잘 사용하지 않는다. 

        // 실수형
        float fNum;     // 4byte
        double dNum;    // 8byte -> 기본
        // 실수형은 근사치 계산 법으로 정수값이 잘 도출 되지 않음. 따라서, 가능한 피해주길 바람.
        // 1 아니면 0으로 참 거짓을 판단하는데 실수는 그렇지 못하다는 것.

        int num1 , num2; // 같은 타입의 변수를 , 로 구분할 수 있음.
        double num3 = 3.14;
        double num4 = 1.24 , num5 = 1.11;

        int hour = 4;
        int min = 50;
        System.out.println(hour + ":" + min );


    }
/*
    class NameCard{
        string name;
        string address;
        string email;
        string phoneNum;
    }
 */
}


