package 스택예제;
// 스택을 이용해서 열림괄호와 닫힘괄호 체크 하기
// 단순히 수식에 있어서 괄호의 숫자가 맞는지 아닌지만 판단하는 예제
import java.util.Scanner;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Character> characters = new Stack<>(); // 제네릭 문법에는 참조 타입이 와야한다.
        Scanner sc = new Scanner(System.in);
        System.out.print("수식입력 :");
        String exp = sc.next();
        // 입력받은 문자열을 길이 만큼 반복 순회
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {    //
                characters.push(ch);    // 오토 박싱.
            } else if (ch == ')')
                if (!characters.empty()) {   // 비어있지 않으면
                    characters.pop();       // 닫힘 괄호일 때 팝pop
                } else {
                    System.out.println("괄호가 일치 하지 않습니다.");
                    return;
                }
        }
        if (characters.isEmpty()) {
            System.out.println("괄호가 일치 합니다.");
        }
        else {
            System.out.println("괄호가 일치 하지 않습니다.");
        }
        System.out.println(characters);
    }
}