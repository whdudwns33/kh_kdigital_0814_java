package API03;
//### countTokens()
//- 꺼내지 않고 남아 있는 토큰의 수
//### hasMoreTokens()
//- 남아 있는 토큰이 있는지 여부
//### nextToken()
//- 토큰을 하나씩 꺼내 옴
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 /기준으로 연속 입력 하세요 : ");
        String names = sc.nextLine();
        StringTokenizer st = new StringTokenizer(names, "/");
        String[] nameStr = new String[st.countTokens()];    // 남아있는 토큰 수만큼 배열 생성
        int idx = 0;
        while(st.hasMoreTokens()) { // 토큰(아무래도 값? 인듯)이 있으면 True 없으면 False로 while문 종료
            nameStr[idx++] = st.nextToken();    // 배열 0부터 하나씩 토큰을 저장함.
        }
        for(int i = 0; i < nameStr.length; i++) {
            System.out.print(nameStr[i] + " "); // 배열 생성
        }
        System.out.println();


        String str = "23:34:45";
        String[] time = str.split(":");     // : 를 구분자로 함
        for(int i = 0; i < time.length; i++) {    // 구분자로 구분된 time 배열에서 i번째 값을 출력  
            System.out.println(time[i]);
        }
    }
}
