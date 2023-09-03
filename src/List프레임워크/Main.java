package List프레임워크;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            ArrayMethod arrayMethod = new ArrayMethod();
            arrayMethod.inputValue();
            arrayMethod.calcMethod();
            arrayMethod.printMethod();
        }
    }

class ArrayMethod {
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();
    // 정수값 입력 받는 메소드
    void inputValue() {
        int tmp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        while(true) {
            tmp = sc.nextInt();
            if(tmp == 999) break;
            else;
            inList.add(tmp);
        }
    }
    void calcMethod() {     // 짝수면 evenList에 추가
        for(Integer e : inList) {
            if(e % 2 == 0) evenList.add(e);
            else oddList.add(e);    // 홀수
        }
    }
    void printMethod() {
        System.out.print("홀수 : ");
        for(Integer e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(Integer e : evenList) System.out.print(e + " ");
        System.out.println();
    }
}

