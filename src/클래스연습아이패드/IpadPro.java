package 클래스연습아이패드;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IpadPro {
    // 인스턴스 필드로 만듦. 
    // 스크린과 컬러를 정수로 설정하면 1번은 뭐뭐 2번은 뭐뭐가 도출 될 수 있게
    int screen; // 11인치, 12.9인치 1번이면 11인치, 2번이면 12.9인치
    int color;  // 스페이스 그레이 , 실버
    int memory; // 128G, 256G, 512G, 1TB
    int network; // WiFi only, WiFi+Cellular

    String name; // 각인서비스시 이름 저장
    String productDate; // 제품생산일자
    String serialNum; // 제품의 일련번호 -> 제품의 고유값을 의미
    static int cnt = 0; //정적 변수, class 변수, 메소드 영역에 생성. 컴파일 실행중에 만들어짐.
                        // 이 변수를 사용하는 이유는 생산대수를 확인하기 위함
                        // 그러니까 클래스 변수는 단한번만 만들어지는 데, 즉, 클래스가 객체로 만들어질 때 횟수가 1 증가하는 것을 보기 위함이다
    
    // 메서드 영역
    // 이름 각인을 위한 메서드
    IpadPro(String name) {
        this.name = name;       // this의 의미는 참조변수
        Date now = new Date(); //자바 유틸에서 임포트해서 사용
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd"); // 시간 정보를 표시해주는 클래스를 객체로 만듦.
        productDate = sdf.format(now);  // 생산한 년/월/일을 가져 옴
        cnt++;
        productDate += cnt; // 문자열에 생산대수를 이어붙이기
    }

    // 구매 여부 결정
    boolean continueOder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(5)+"아이패드 구매하기" + "=".repeat(5));
        System.out.println("구입하시려면 yes/ 종료는 quit :");
        String isContinue = sc.next();
        if(isContinue.equalsIgnoreCase("yes")) return true; // 대문자를 구분하지 않는 문자열 비교. 구입을 계속 진행
        else return false;
    }

    // 화면 사이즈 설정
    void setScreen() { // 객체 내에 저장.
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("디스플레이 선택 : [1] 11인치 [2] 12.9인치 :" );
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return;
            System.out.println("디스플레이를 다시 선택하시오");
        }
    }

    void setColor() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("컬러 선택 : [1] 그레이 [2] 실버 :" );
            color = sc.nextInt();
            if (color == 1 || color == 2) return;
            System.out.println("컬러를 다시 입력하시오");
        }
    }

    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("용량선택 : [1] 128G [2] 256G [3] 512G [4] 1TB :");
            memory =sc.nextInt();
            if (memory > 0 && memory < 5) return;
            System.out.println("용량을 다시 선택하세요.");
        }
    }

    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("네트워크 선택 : [1] WiFi [2] WiFi + cellular :");
            network = sc.nextInt();
            if (network > 0 && network < 2) return;
            System.out.println("네트워크를 다시 선택하세요.");
        }
    }
    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("각인 서비스를 신청하시겠습니까? yes/ no :");
        String service = sc.next();
        if(service.equalsIgnoreCase("yes")) {
            System.out.print("이름을 입력하세요.");
            name = sc.nextLine();
        }
    }
    void setSerialNum () {
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memStr = {"", "128", "256", "512", "1024"};
        String netStr = (network == 1) ? "W" : "C";
        serialNum = "ipad" + screenStr + memStr[memory] + netStr + productDate; // 일련 번호 생성.
    }
    void progressPad () throws InterruptedException {       // 30초 동안 아이패드가 만들어지는 과정을 임의로 만든 것.
        int cnt = 0;
        while (true) {
            sleep(300); // 0.3초 동안 멈춤
            cnt++;
            System.out.print(" << ipad Pro 제작중 : [" + cnt + "%] >>");
            System.out.print("\r");
            if (cnt >= 100) break;
        }
    }
    void produtPad() {  // 최종 생성된 패드의 정보를 읽어 주는 메서드
        // 배열에 { a:0번쨰, b:1번째 ,c:2번째 }
        final String[] screenType = {"", "11인치", "12.9 인치"};    // final은 상수 취급을 하겠다.
        final String[] colorType = {"", "그레이", "실버"};
        final String[] memType = {"", "128G", "256G", "512G", "1T"};
        final String[] netType = {"", "WIFI", "WIFI + CELLULAR"};
        System.out.println("=".repeat(5)+ "iPad Pro 사양" + "=".repeat(5));
        // 배열[선택된 숫자: 앞에서는 1 or 2로 yes no를 선택했기 때문에 배열에 1아니면2로 선택 가능]
        System.out.println("화면크기 :" + screenType[screen]);
        System.out.println("색상 :" + colorType[color]);
        System.out.println("용량 :" + memType[memory]);
        System.out.println("네트워크 :" + netType[network]);
        System.out.println("이름 : " + name);
        System.out.println("일련번호 :" + serialNum);
        System.out.println("-".repeat(40));
    }
}
