package Set프레임워크;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));// asList는 일반 배열을 ArrayList로 변환
        System.out.println(set);    // 중복되는 단어 생략.

        HashSet<String> set1 = new HashSet<>();
        set1.add("Java");
        set1.add("C");
        set1.add("C++");
        set1.add("Python");
        set1.add("Java");

        for(String e : set1) {
            System.out.print(e + ", ");
        }
    }
}
