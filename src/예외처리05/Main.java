package 예외처리05;

import java.io.IOException;
// 예외처리 미루기
public class Main {
    public static void main(String[] args) {
        IOSample test = new IOSample(); // IOSample 객체
        try {
            test.input();
        } catch (IOException e) {
            System.out.println("입력 에러입니다.");
        }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
    }
}

class IOSample {
    private int num;
    public void input() throws IOException {    // 입출력 예외처리. main에서 예외 처리하도록 미룸
        num = System.in.read(); // Scanner 보다 저수준의 입력. 예외처리가 필요함. throw로 예외처리를 미룸
    }

    public void output() {
        System.out.println(num);
    }
}
