package 배열;
// Java의 배열은 동일한 데이터 타입 요소들을 연속적(메모리에서)으로 저장하는 자료 구조
// 배열은 데이터의 마지막에 추가하기 편하고 찾는 것은 쉽지만,
// 삽입과 삭제는 어려운 단점이 있음.
// index를 사용해서 각 요소를 접근할 수 있다. (index는 0부터 시작한다.)
// 배열은 크기를 지정해야한다.
// type [] 배열이름(참조 변수) = new 타입 [배열길이];

public class Arrayment {
    public static void main(String[] args) {
        // 배열의 크기를 할당하고 이후에 초기화 하는 방법
        int [] grade1 = new int[3]; //heap 영역에 정수 3개를 저장할 메모리 공간을 확보
        grade1[0] = 80;
        grade1[1] = 50;
        grade1[2] = 70;
//        grade1[3] = 77; // index의 범위를 벗어남.

//        for(int i = 0; i <grade1.length; i++) {
//            System.out.println(grade1[i]);
//        }
//        System.out.println();
//
//        // 향상된 for문 : 주어진 배열 등의 크기를 (자동 분해해서) 자동 순회
//        for (int e : grade1) {
//            System.out.println(e);
//        }
        int[] odd = {1,3,5,7,9}; // 이미 정해진 값을 배열에 대입하는 경우는 크기와 new를 사용하지 않아도 됨
        String[] weeks ={"월요일","화","수","목요일","금","토","일"};
        char[] weekends ={'월','화','수','목','금','토','일'};

        int[] grade2 = {88, 99, 55}; // 이미 값을 갖고 있는 경우
        int[] grade3 = new int[] {11,22,33}; // heap 영역에 저장.
        int[] grade4;  // 객체 타입의 참조변수만 선언, 실제 객체의 주소를 받아야 할 것.
//        grade4 = new int[] {70, 80, 90};
        //원본 데이터
        grade4 = new int[4];
        grade4[0] =10;
        grade4[1] =20;
        grade4[2] =30;
        grade4[3] =40;
        int sum = 0; //총점을 구하기 위함


        for (int e : grade4) sum+= e; // 향상된 for문은 자동 순회하면서 sum에 모든 값을 더함
        System.out.println("총점은 :" + sum);
        System.out.printf("평균 : %2f\n", (double)sum/ grade4.length);
        sum = 0; // sum 초기화
        
        for (int Val : grade4) {
            Val += 10;
            sum += Val;
        }
        System.out.println("총점은 :" + sum);
        System.out.printf("평균 : %2f\n", (double)sum/ grade4.length);
        sum = 0;


        for (int i =0; i < grade4.length; i++) { // length는 배열의 길이를 확인
            grade4[i] += 10;
            sum += grade4[i];
        }   // 원본 데이터 grade4의 값을 임의적 변경이 가능함
        System.out.println("총점은 :" + sum);
        System.out.printf("평균 : %2f\n", (double)sum/ grade4.length);
        // 자동 순회문에서 값을 바꿀 수 없음. 값을 바꿀 수 없다는 게 아무래도 배열의 길이와 위에 지정된 값을 의미하는 듯.



    }
}
