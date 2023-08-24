package 로또문제;

public class Lotto02 {
    public static void main(String[] args) {
        int [] lotto = new int[6];
        int rand = (int)(Math.random()*45 +1);
        for(int i = 0; i < lotto.length; i++ ) { // for 초기식부터 조건식까지 true일떄까지 반복
            lotto[i] = rand;
            for(int e : lotto) {
                System.out.print(e +" ");
            }
//            if(lotto[0] != lotto[1]) {
//                for(int e : lotto) {
//                    System.out.print(e + " ");
//                }
//            }
        }
    }
}
