package 트리셋;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);

        for(int e : ts) {
            System.out.print(e + " ");
        }
        ts.remove(22); // 해당 요소 삭제
        for (int e : ts) {
            System.out.print(e + " ");
        }
    }
}
