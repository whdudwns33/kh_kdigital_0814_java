package 스택구조;
// Stack은 제일 나중에 들어온 값이 가장 먼저 빠져 나가는 구조. First in Last out

import java.util.Stack;

public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // 이 구조는 1 2 3 순으로 탑을 쌓는 구조임.
        System.out.println(stack.peek());   // peek는 스택 구조의 가장 위의 값을 도출 = 3이 나옴
        System.out.println(stack.pop());    // pop은 맨위에 나온 값을 끄집어 낸다. = 3
        System.out.println(stack.empty());  // empty는 현재 스택이 비어 있는지 확인 = 비어 있지 않으면 false.
        System.out.println(stack.size());   // 스택에 몇개의 데이터가 있는지 확인
        System.out.println(stack.contains(10)); // 매개 변수의 값이 스택 내부에 존재하는지 확인.   = 1 2만 있기 때문에 10은 false
        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
}
