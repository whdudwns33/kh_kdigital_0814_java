package 스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// 반복자 스트림forEach : 내부 반복자. 스트림 요소에 대한 순차 접근을 제공하며, 최종 연산에 해당합니다.
public class Main02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("가","나","다"));
        //for문 사용
        for (String e : list) System.out.print(e + " ");
        Iterator<String> iterator = list.iterator();
        System.out.println();
        //while문 사용
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.print(name + " ");
        }
        //stream 사용
        list.stream().forEach(e -> System.out.println(e + " "));
        System.out.println();
    }
}
