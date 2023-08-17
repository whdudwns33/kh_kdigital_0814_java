package 비트연산자;
// 비트 연산자는 비트단위의 연산을 수행합니다.
// & : bit AND, 비교하는 두개의 비트가 모두 1이어야 1이됨
// | : bit or, 비교하는 두개의 비트가 한쪽만 1이면 1이됨
// ^ : XOR, 비교하는 두 비트가 서로 다른 경우만 1이됨
// ~ : NOT, 현재의 비트 값을 반전시킴
// <<: 왼쪽 시프트, 비트를 왼쪽으로 이동 시킴
// >>: 오른쪽 시프트. 비트를 오른쪽으로 이동 시킴

public class BItOperator {
    public static void main(String[] args) {
        int num1 = 10;                      // 0000 1010
        int num2 = 12;                      // 0000 1100
        // 이진법으로 그리고 비교하기
        System.out.println(num1 & num2);    // 0000 1000
        System.out.println(num1 | num2);    // 0000 1110
        System.out.println(num1 ^ num2);    // 0000 0110
        System.out.println(~num1);          // 1000 0101 2의 보수체계 때문에 1차이가 난다.
        System.out.println(num1 << 1);      // 0001 0100 왼쪽으로 한칸이동은 X2
        System.out.println(num1 >> 1);      // 0000 0101 오른쪽으로 한칸이동은 /2

        // 수정

    }
}
