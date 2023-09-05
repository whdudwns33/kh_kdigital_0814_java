package 입출력스트림;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

// 파일 읽기.
public class Main04 {
    public static void main(String[] args)  {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/입출력스트림/순대국.txt");
        } catch (FileNotFoundException e) {
            System.out.println("읽을 파일을 찾지 못하였습니다.");
        }

        Scanner sc = new Scanner(inputStream);  // System.in 탈출 ㅎㅎ.
        while (sc.hasNext()) {  // hasNext() 읽을 내용이 있으면 true. while을 쓰니까 처음부터 끝까지 읽을 내용이 있는지 반복 없으면 false로 탈출
            String line = sc.nextLine();        // 문자열을 줄바꿈 기준으로 읽음.
            System.out.println(line);
        }
    }
}
