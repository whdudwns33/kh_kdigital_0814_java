package API03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// Array 클래스
//binarySearch() 메소드는 전달받은 배열에서 특정 객체의 위치를 이진 검색 알고리즘을 사용하여 검색한 후, 해당 위치를 반환합니다.
//sort() 메소드는 전달받은 배열의 모든 요소를 오름차순으로 정렬합니다.
//반면에 내림차순 정렬을 위해서는 Arrays.sort(arr, Collections.reverseOrder());을 사용합니다.
public class Main04 {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 7, 8, 9, 2, 1};    // 정수타입의 배열
        Arrays.sort(arr);                            // 오름차순 정렬: 숫자가 작은 수부터 정렬
        Arrays.sort(arr, Collections.reverseOrder());// 내림차순 정렬
        for(int e : arr) System.out.print(e + " "); 
        System.out.println();
        System.out.println(Arrays.binarySearch(arr, 5));    // 5는 배열의 4번째 따라서 4 도출
    }
}
