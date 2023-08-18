package 가장위연습;
// 주사위 두개를 던져서 12가 나오면 탈출하는 게임
public class Random {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0;          //몇번만에 탈출했는지 계산
        while (true) {
            cnt++;             //
            rand1 = (int) ((Math.random() * 6) + 1);
            // math.random은 0.1.... ~ 5.99.. + 1 = 6..... so, int형으로 변환 그러면 1~6으로
            rand2 = (int) ((Math.random() * 6) + 1);
            if ((rand1 + rand2) == 12 ) {
                System.out.printf("무인도를 %4d번만에 탈출 했습니다.\n", cnt);
                break;
            }
            else {
                System.out.println("주사위 합은" + (rand1+rand2) + "입니다.");
            }
        }
    }
}
