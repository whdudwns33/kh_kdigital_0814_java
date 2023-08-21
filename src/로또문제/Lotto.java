package 로또문제;
// 1~45 사이의 임의수 6개를 생성
// 단 중복 제거
// 배열은 6개
// 반복횟수는 정할 수 없음 (무한 반복 -> while (true), 탈출조건: 중복되지 않는 번호 6개가 저장되면 break;)
// 입력은 받지 않음
// math.random 활용
// 생성된 val 값을 배열에 답을 때, 배열 내에 해당하는 값이 있는지 확인 필요.
//        int val = (int) ((Math.random() * 45) +1);

public class Lotto {
    public static void main(String[] args) {

        int [] lot = new int[6];
        int rand1, rand2, rand3, rand4, rand5, rand6;
        while (true) {
            rand1 = (int)((Math.random() * 45) +1);
            rand2 = (int)((Math.random() * 45) +1);
            rand3 = (int)((Math.random() * 45) +1);
            rand4 = (int)((Math.random() * 45) +1);
            rand5 = (int)((Math.random() * 45) +1);
            rand6 = (int)((Math.random() * 45) +1);
            if (rand1 != rand2 && rand2 != rand3 && rand3 != rand4 && rand4 != rand5 && rand5 != rand6) {
                lot[0] = rand1;
                lot[1] = rand2;
                lot[2] = rand3;
                lot[3] = rand4;
                lot[4] = rand5;
                lot[5] = rand6;

                for (int e : lot) {
                    System.out.print(e + " ");
                }
                break;
            }
            else;
        }
    }
}
