package 로또문제;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LottoAns {
    public static void main(String[] args) {
        // 1.
//        int lotto[] = new int[6];
//        int tmp = 0; // 임시로또번호
//        boolean isExist = false;
//        int index = 0;
//
//        while (true) {
//            tmp = (int) ((Math.random() * 45) + 1);
//            for (int i = 0; i < lotto.length; i++) {
//                if (lotto[i] == tmp) isExist = true;
//            }
//            if (!isExist) lotto[index++] = tmp;
//            if (index == 6) break;
//            isExist = false;
//        }
//        for (int e : lotto) System.out.print(e + " ");


        // 2. ArrayList, 리스트는 제너릭 타입으로 내부에 객체가 들어와야함
        // 여기서는 Integer 라는 객체가 들어왔음
//        List<Integer> list = new ArrayList<>();
//        int tmp = 0;
//        while (true) {
//            tmp = (int) ((Math.random()* 45) + 1);
//            if (!list.contains(tmp)) {
//                list.add(tmp);
//            }
//            if (list.size() == 6) break;
//        }
//        System.out.println(list);

        //3. Set을 이용한 방법: 자바에서 사용하는 집합 개념
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int tmp = (int) ((Math.random()* 45) + 1);
            set.add(tmp);
            if (set.size() == 6) break;
        }
        System.out.println(set);
    }
}
