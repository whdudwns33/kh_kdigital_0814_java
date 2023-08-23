package 클래스연습아이패드;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
        this.name = name;
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
            if (network > 0 && network < 5) return;
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
}
