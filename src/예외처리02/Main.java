package 예외처리02;
// 스캐너 시스템 아웃 = IO input, output
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt")); // 파일을 첨부
            br.readLine();  // 파일을 읽음
            br.close();     // 파일을 닫음
        }   catch (IOException e) { // IOException은 입출력 예외 처리
            System.out.println(e);  // text 파일이 없기 때문에 (지정된 파일을 찾을 수 없습니다) 결과 출력
            System.out.println("파일이 없습니다. 다시 첨부하십시오.");
        }
    }
}
