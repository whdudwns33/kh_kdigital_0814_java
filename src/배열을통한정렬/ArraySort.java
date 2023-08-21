package 배열을통한정렬;
//1차원 배열을 통한 기본 정렬 (버블 정렬/삽입 정렬)
//사용예시의 버블정렬은 일반적인 방법과 약간의 차이가 있음
//기본적인 버블정렬이나 삽입정렬은 시간의 복잡도를 나타내는 빅오 표기법으로 표시하면 O(n^2)
public class ArraySort {
    public static void main(String[] args) {
        int[] arr ={6,4,3,5,9,7,8,1,2,};
        int tmp = 0; //정렬을 위한 임시 공간
        for(int i = 0; i < arr.length; i++) {
            for (int j =i; j <arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp =arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for(int e : arr) System.out.print(e +" ");
    }
}
