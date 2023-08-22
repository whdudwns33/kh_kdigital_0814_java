package 메소드와필드;
// 메소드는 클래스 내에서 동작에 대한 기능을 구현하는 것. 함수와 같은 느낌. 함수가 클래스 내부에 있으면 메소드
// 필드는 클래스 내에 존재하며 값을 저장하는 변수를 의미한다. 상태를 저장
// static을 붙이면 클래스 소속임 나중에 다시 설명해 주심 MethodAndFeild
// 소문자는 객체 소속 methodAndFeild
public class MethodAndFeild {
    public static void main(String[] args) {
        int resault = MethodAndFeild.sum(100,200);
        int resault1 = MethodAndFeild.sum(100,200, 300);
        int resault2 = MethodAndFeild.sum(100,200, 300, 400); // 매개변수의 갯수를 알 수 없는 경우 사용
        System.out.println(resault);
        System.out.println(resault1);
        System.out.println(recFunc(10));
        System.out.println(whileSum(10));
    }
    // 메소드 앞에 static을 선언하는 것은 객체 소속이 아니고 클래스 소속
    // static은 정적 변수로 힙영역이 아니라 메소드 영역, 스태틱 영역에 할당된다.
    // new 힙영역에 동적할 당하는 것.
    static int sum(int a, int b) {
        return (a + b); // 메서드의 결과를 도출하기 위한 분기문
    }
    // sum 메서드의 매개 변수를 다르게 만들었으므로 오버로딩 관계가 성립된 것.
    static int sum(int a, int b, int c) {
        return (a + b + c);
    }
    static int sum (int ... val) { // ...  => 전개연산자: 여러개가 존재한다.
        int sum = 0;
        for (int e : val) {
            sum += e;
        }
        return sum;
    }
    // 재귀호출 : 메소드 자신이 자기 자신을 호출하는 것.
    static int recFunc(int n) {
        if (n ==1) return 1;
        return n + recFunc(n-1);
    }
    static int whileSum (int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        return sum;
    }
}
