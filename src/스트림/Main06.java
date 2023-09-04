package 스트림;

import java.util.Optional;
import java.util.stream.Stream;

public class Main06 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("넷","둘","셋","하나");
        Stream<String> stream2 = Stream.of("넷","둘","셋","하나");
        Optional<String> rst1 = stream1.reduce((s1, s2) -> s1 + "++" + s2); // reduce는 s1,s2로 결과를 하나 만들면서 소모가 되고 s1으로 합쳐짐, 그리고 반복.
                                                                            // Optional은 널타입이 아니면 값을 출력한다는 것.
        rst1.ifPresent(e -> System.out.print(e + " "));
        System.out.println();
        String rst2 = stream2.reduce("시작",(s1, s2) -> s1 + "++" + s2);
        System.out.println(rst2);
    }
}
