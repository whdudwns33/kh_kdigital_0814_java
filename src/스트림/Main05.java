package 스트림;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림 중개 연산
// 생성된 스트림은 중간 연산을 통해서 또 다른 스트림으로 변환 합니다.
// 1. 필터링 :
// filter()     : 주어진 조건에 맞는 요소만으로 구성된 새로운 스트림 생성.
// distinct()   : 중복된 요소가 제거된 새로운 스트림 생성

// 2. 스트림 변환 :
// map()    : 해당 스트림의 요소들을 함수의 인수로 전달하여, 반환값으로 이루어진 새로운 스트림을 만듦.
// flatMap(): 각 요소를 변환하여 중첩된 스트림들을 평면화하여 새로운 스트림을 생성합니다.
// 3. 제한
// limit()  : 해당 스트림의 첫번째 요소부터 전달된 개수만큼의 요소만으로 새로운 스트림 생성
// skip()   : 해당 스트림의 첫번째 요소부터 전달된 개수만큼 요소를 제외한 나머지 요소만으로 이루어진 새로운 스트림 생성
// 4. 정렬
// sorted() :해당 스트림을 주어진 비교자(comparator)을 이용하여 정렬
public class Main05 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(1,2,3,4,5,5,6,6,7);    // 스트림은 한번 사용하고 나면 사라짐
        IntStream stream2 = IntStream.of(1,2,3,4,5,5,6,6,7);
        // 스트림의 중복 제거
        stream1.distinct().forEach(e->System.out.print(e + " "));       // 중복제거 후 기존 스트림은 삭제
        System.out.println();
        // 조건에 맞는 스트림 새로운 스트림 생성. 
        stream2.filter(e->e % 2 != 0).forEach(e -> System.out.print(e + " "));  // 홀수 조건식 2로 나누어서 0이 아닌 것만.
        System.out.println();
        //

        Stream<String> stream =Stream.of("HTML","CSS","JAVA","JAVASCRIPT");
        stream.map(e -> e.length()).forEach(e->System.out.print(e + " "));  // 입력된 문자열의 길이(lenth)를 반환.
        System.out.println();

        Stream<String>  stream4 = Stream.of("I study Java", "I study hard", "I wanna go home.");
        stream4.flatMap(e -> Stream.of(e.split(" "))).forEach(e -> System.out.print(e + " "));

//          // map과 flatmap 차이
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        List<Integer> squarNumbers = numbers.stream()
//                .map(n -> n*n)
//                .collect(Collectors.toList());
//        for (Integer e : squarNumbers) System.out.print(e + " ");

        // 전달된 요소의 개수만큼 제외 skip, limit
        IntStream stream5 = IntStream.range(0,10);
        IntStream stream6 = IntStream.range(0,10);
        IntStream stream7 = IntStream.range(0,10);
        stream5.skip(4).forEach(e -> System.out.print(e + " "));    // 0~3번째까지 전달된 요소의 개수만큼 제외
        System.out.println();
        stream6.limit(5).forEach(e -> System.out.print(e + " "));    // 5번째 까지 출력
        System.out.println();
        stream7.skip(3).limit(5).forEach(e -> System.out.print(e + " "));    // 중간연산자는 여러번 사용 가능
        System.out.println();

        // 정렬
        Stream<String> stream8 = Stream.of("HTML","CSS","JAVA","JAVASCRIPT");
        Stream<String> stream9 = Stream.of("HTML","CSS","JAVA","JAVASCRIPT");
        stream8.sorted().forEach(s -> System.out.print(s + " "));                           // 오름차순
        stream9.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));  // 내림차순
        System.out.println(stream8);
        System.out.println();
        System.out.println(stream9);

    }
}
