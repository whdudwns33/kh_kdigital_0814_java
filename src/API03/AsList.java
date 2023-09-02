package API03;

import java.util.Arrays;
import java.util.Scanner;

public class AsList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이 입력:");
        int num = sc.nextInt();             // 배열의 길이를 입력
        Integer [] arr = new Integer[num];  // 입력받은 길이 만큼 배열 생성
        System.out.println("찾을 수 입력:");
        int key = sc.nextInt();             // 찾을 숫자 입력
        for (int i = 0; i < arr.length; i++) {  // 배열에 랜덤 숫자 넣기
            arr[i] = (int) (Math.random() * num) + 1; // 정수형 배열이니까 랜덤 앞에 정수 선언.
                                                  // random은 0.0이상 1.0미만의 숫자 무작위 추출
                                                  // 따라서 정수를 출력하기 위해선 입력한 num을 곱하고 +1을 해야 최소 1부터 출력가능
        }
        Arrays.sort(arr);                   // 오름차순 정렬. 작은 수 순서로
        for (int e : arr) {
            System.out.println(" " + e);    // 정렬된 배열을 보기 위한 배열
        }
        System.out.println();
        int resault = Arrays.binarySearch(arr, key);      // 배열에 정렬된 key정보(순서 등)를 출력하기 위함.
        if (resault > 0) {                                // 자연수만 출력하기 위함.
            System.out.println(resault);
        } else;
    }
}
