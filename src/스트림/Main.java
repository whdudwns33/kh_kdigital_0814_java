package 스트림;
// 스트림이란 함수형 프로그램을 이용해 다양한 데이터 소스를 표준화된 방법으로 다루기 위함.
// 특징
// -자료의 대상에 상관없이 동일한 연산 수행
// -내부 반복자 사용(반복문을 배제하기 위함.)
// -원본데이터를 변경하지 않음
// -지연 연산과 병렬 처리를 지원 (성능 향상을 위한 방법)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        // 스트림을 생성(일회용 스트림), 중간 연산 : s, 최종연산 : e
        list.stream().filter(s->s.intValue() %2 == 0).forEach(e->System.out.print(e + " "));    // 입력받은 값중에서 짝수만 추출(filter)하여 결과 출력
        System.out.println();

//        int sunVal = list.stream().mapToInt(e -> e).sum();  // 중간 연산 mapToInt(e)는 e를 입력받아 int stream으로 변환.
                                                            // 중간 연산은 여러번 사용가능 하지만, 최종연산은 단 한번만 사용이 가능함
                                                            // sum은 최종 연산이다. 따라서 forEach같은 최종 연산을 함께 사용할 수 없다
        int count = (int) list.stream().count();            // list.size 가능
        int sunVal = list.stream().reduce(0,(e1, e2)->e1 + e2); // reduce는 다시 볼예정.
        System.out.println(sunVal);
        System.out.println(count);
    }
}
