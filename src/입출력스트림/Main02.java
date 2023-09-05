package 입출력스트림;

import java.io.*;

// Writer : 문자열 기반 출력 스트림의 최상위 추상 클래스.
// Reader : 문자열 기반 입력 스트림의 최상위 추상 클래스.
public class Main02 {
    public static void main(String[] args) throws IOException {
//        Writer writer = new FileWriter("test.txt");
//        char [] data = "메이플스토리".toCharArray(); // 문자 하나하나가 배열에 저장
////        for (int i = 0; i < data.length; i++ ) {
////            writer.write(data[i]);
////        }
//        writer.write(data);
//        writer.flush();
//        writer.close();

        Reader reader = new FileReader("test.txt");
        while(true) {
            int readData = reader.read();
            if(readData == -1) break;
            System.out.print((char)readData); // 읽을 때눈 숫자로 읽지만, 출력은 char로 해야 아스킷 코드 값이 출력이 안됨.
        }
        reader.close();
    }
}
