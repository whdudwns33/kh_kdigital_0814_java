package 예외처리;
// tyr catch 구문. 배열을 초과했을 때
public class Main {
    public static void main(String[] args) {
        int [] arr = new int[5];
        try {
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.print(arr[i] + " "); // 오류(예외) 발생? 왜? 배열의 길이는 5이고 i는 0~5까지인 6이기 때문이다.
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("배열의 인덱스를 초과 했습니다. 값을 확인해 주세요.");
        }
        System.out.println("프로그램 종료");
    }
}
