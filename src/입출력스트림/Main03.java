package 입출력스트림;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
// 이미지 복사하기.
public class Main03 {
    public static void main(String[] args) throws IOException {
        String originFileName = "src/입출력스트림/순대국밥.jpg";
        String targetFileName = "d:/temp/bear.jpg";

        FileInputStream fis = new FileInputStream(originFileName);      // 경로에 있는 파일 읽어오기 
        FileOutputStream fos = new FileOutputStream(targetFileName);    // 새로운 경로에 파일 저장

        int readByteNum;
        byte [] readByte = new byte[100];
        while ((readByteNum = fis.read(readByte)) != -1) {              // fis로 100byte씩 읽기. -1인 파일의 끝까지.
            fos.write(readByte, 0 , readByteNum);                   // fos는 새로운 경로에 이미지의 데이터의 가장 처음인 0부터 fis로 읽어온 모든 데이터 저장
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}
