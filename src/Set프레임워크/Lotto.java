package Set프레임워크;

import java.util.HashSet;

public class Lotto {
    public static void main(String[] args) {
        HashSet<Integer> arr = new HashSet<>();
        while (true) {
            int val = (int) ((Math.random()*45) +1);
            arr.add(val);
            if (arr.size() == 6) break;
        }
        System.out.println(arr);
    }
}
