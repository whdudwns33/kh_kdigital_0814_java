package 형변환;
// 형변환이란 하나의 데이터 타입을 다른 타입으로 변환하는 것.
// 명시적 형변환: 개발자가 의도를 가지고 형변환을 하는 것.
// 묵시적 형변환: 컴파일러가 자동으로 변환하는 것(유리한 방향으로 변환)
// ex. 3.14 + 3 = 3.14 + 3.00 = 6.14

public class TypeCasting {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        double resault1 = num1/num2;         //형변환이 일어나지 않음
        double resault2 = (double)num1/num2;
        //명시적, 묵시적 형변환 일어남. : num2 부분은 더블을
        //지정하지 않았음에도 자동으로 더블num1의 변환을 받아서 묵시적으로 형변환이 일어남.
        System.out.println(resault1);
        System.out.println(resault2);


        String Kor = "90"; // 문자열 90을 지정한 것. 숫자가 아님.so, 계산이 안됨.
        //int intKor = Integer.parseInt(Kor); // 문자열을 숫자로 변환하는 매서드
        int kr = 90;
        int math = 88;
        int eng = 64;
        int total =  Integer.parseInt(Kor) + math + eng;
        double average = (double)total/3;   //3이 정수에서 3.00~  실수로 변환
        System.out.println(average);


    }
}
