package Set프레임워크;
import java.util.Arrays;
import java.util.HashSet;
//retainAll() 교집합
//addAll() 합집합
//removeAll() 차집합
//값 추가하기(add)
//값 여러 개 추가하기(addAll)
//특정 값 제거하기(remove)

public class Main02 {
    public static void main(String[] args) {
        // 교집합
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        s1.retainAll(s2); // 교집합을 수행하는 메소드
        System.out.println(s1);

        // 합집합
        HashSet<Integer> s3 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s4 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        s3.addAll(s4); // 합집합을 수행
        System.out.println(s3);

        // 차집합
        HashSet<Integer> s5 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s6 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        HashSet<Integer> substract = new HashSet<>(s5);  // s5으로 substract 생성. s5집합생성
        substract.removeAll(s6); // 차집합 수행. 4,5,6 제거
        System.out.println(substract);  // [1, 2, 3] 출력

        // add 값 추가하기. ArrayList 등과 동일한 기능
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, Jump] 출력

        // addALl 값을 동시에 여러개 추가
        HashSet<String> set1 = new HashSet<>();
        set1.add("Jump");
        set1.addAll(Arrays.asList("To", "Java"));
        System.out.println(set);  // [Java, To, Jump] 출력

        // remove 값을 제거.
        HashSet<String> set2 = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set2.remove("To");
        System.out.println(set);  // [Java, Jump] 출력
    }
}
