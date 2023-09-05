package 입출력스트림;
import java.io.*;

// 바이트 스트림
// OutputStream은 바이트 기반. 2진수로 표현. 바이트 기반 출력 스트림의 최상위 추상 클래스.
// 파일은 예외가 생김.


public class Main {
    public static void main(String[] args) throws IOException {
        // write는 오버로딩 되어 있음
        //1.
//        OutputStream os = new FileOutputStream("./tset.bin"); // 부모 클래스로 자식객체로 접근.
//        byte a = 10;
//        byte b = 20;
//        byte c = 30;
//        os.write(a);
//        os.write(b);
//        os.write(c);

        //2.
//        OutputStream os = new FileOutputStream("./tset2.bin"); // 부모 클래스로 자식객체로 접근.
//        byte [] arr = {10, 20, 30};
//        os.write(arr);  // write는 배열 타입으로 쓰여 있음.
//        os.flush(); // 버퍼 비우기.
//        os.close(); // 자원 반납 후 스트림 닫기.

        //3.
//        OutputStream os = new FileOutputStream("./tset2.bin"); // 부모 클래스로 자식객체로 접근.
//        byte [] arr = {10, 20, 30, 40, 50};
//        os.write(arr, 1, 3); // 20, 30, 40.
//        os.flush(); // 버퍼 비우기.
//        os.close(); // 자원 반납 후 스트림 닫기.

        //4.
//        InputStream is = new FileInputStream("test.bin");
        InputStream is = new FileInputStream("tset.bin");
//        while (true) {
//            int data = is.read();   // 1바이트씩 읽는 메서드 사용
//            if(data == -1) break;   // 더 이상 읽을 데이터가 없으면 -1이 들어옴. 즉, 파일의 끝
//            System.out.println(data);
//        }
        byte [] buffer = new byte[100];
        while (true) {
            int readNum = is.read(buffer); // 배열의 길이 만큼 읽기.
            if (readNum == -1) break;
            for (int i = 0; i < readNum; i++) {
                System.out.println(buffer[i]);
            }
        }
        is.close();
    }
}
