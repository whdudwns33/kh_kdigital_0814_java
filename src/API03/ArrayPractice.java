package API03;
//compareTo() 함수는 두개의 값을 비교하여 int 값으로 반환해주는 함수이며 주로 정렬에서 사용 됩니다.
import java.util.Arrays;
import java.util.Comparator;

public class ArrayPractice {
    public static void main(String[] args) {
            String[] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                    "Mango", "Watermelon", "Cherry", "Plum", "Peach"};

            Arrays.sort(fruit, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    // o1 > o2 return 1 : 오름차순
                    // o1 < o2 return 1 : 내림차순
                    // 1은 배열을 바꿈, -1은 현 상태 유지
                    if(o1.length() > o2.length()) return 1; // o1와 o2를 비교하여 길이가 짧은 순서 대로 정렬
                    else {
                        if(o1.length() == o2.length()) {    // 문자열의 길이가 같은 조건
                            return o1.compareTo(o2); // 두번째가 사전순서상 앞에 있으면 양수
                            //- 음수: 현재 객체(o1)가 매개변수(o2) 객체보다 작음을 나타냅니다.
                            //- 0: 현재 객체와 매개변수 객체가 같음을 나타냅니다.
                            //- 양수: 현재 객체가 매개변수 객체보다 큼을 나타냅니다. (정렬 조건이 됨)
                        }
                        return -1; // 현 상태 유지
                    }
                }
            });
            System.out.println(Arrays.toString(fruit));
        }
}
