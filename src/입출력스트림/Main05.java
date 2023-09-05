package 입출력스트림;

import java.io.*;

// 성능향상 보조 스트림
// bufferStream
// 프로그램과 입출력 장치 사이에는 엄청난 속도차이가 발생하며 이로 인해서 병목현상이 발생한다.
// 이를 해결하기 위해서 성능 향상 보조스트림을 사용 합니다.
public class Main05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;     //성능 향상을 위한 보조 스트림
        BufferedOutputStream bos = null;
        int data =-1; // 파일의 끝을 확인하기 위한 변수
        long start = 0; // 시작 시간을 측정하기 위한 변수
        long end = 0;   // 종료 시간을 측정하기 위한 변수

//        fis = new FileInputStream("src/입출력스트림/bear.jpg");
//        bis = new BufferedInputStream(fis);
//        fos = new FileOutputStream("d:/temp/bear2.jpg");
//        start = System.currentTimeMillis();   // 현제 시간 체크
//        while ((data = bis.read()) != -1) {
//            fos.write(data);
//        }
//        fos.flush();
//        end = System.currentTimeMillis();     // 현제 시간 체크
//        fos.close();
//        bis.close();
//        fis.close();
//        System.out.println("성능향상을 사용하지 않은 경우 : " + (end - start) + "ms"); // 시작 시간과 끝 시간을 빼면 걸린 시간을 확인 할 수 있음.

        fis = new FileInputStream("src/입출력스트림/bear.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("d:/temp/bear2.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("성능향상을 사용하는 경우 : " + (end - start) + "ms");
    }
}
