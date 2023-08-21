package 문자열;
// 자바는 문자열을 나타내는 자료형은 String 이며, 참조 타입 자료형이다.
// equals : 두 개의 문자열이 동일한지 비교하여 결과값을 리턴함.(true/ false),
// == 문자열의 주소가 같은지  물어봄
// indexOf : 문자열에서 특정 문자가 시작되는 인덱스를 반환
// cotains : 문자열에서 특정 문자열이 포함되어 있는지 여부 확인
// replace : 문자열 중에서 특정 문자열을 다른 문자열로 변경
// replaceAll: 정규식을 변경
// substirnig : 특정한 문자열을 추출할 떄 사용, 시작 인덱스만 주는 경우와 시작~끝을 지정하는 경우가 존재
// toUpperCase : 문자열 전부를 대문자로 변경
// toLowerCase : 문자열 전부를 소문자로 변경
// trim : 문자열 좌우의 공백을 제거
// split : 문자열을 특정 구분자로 분리하는 매서드
// toCharArray() :
import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "Hello";
        String d = new String("hello");// heap 메모리에 메모리 할당. 하지만 내용은 hello랑 같음
        String e = "hello java";
        String f = "Hello Java";
        String oldStr = "        자바 프로그래밍   ";
        String time = "10:24:13";
        String [] modifyTime = time.split(":");
        String testName = "james";
        char [] chName = testName.toCharArray();

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c)); //문자열을 비교하는데 대문자 소문자를 구분하지 않는다.
        System.out.println(a.equals(d));
        System.out.println(a.indexOf("lt"));        // 문자가 시작되는 인덱스 반환
                                                    // hello 에서 lt를 수출하라고 명령하면 -1이라는 
                                                    // 없다는 의미의 부정이 나옴
        System.out.println(e.contains("java"));     // **공간 띄어쓰기도 인식됨
        System.out.println(e.charAt(4));            // charAt(n) n번째 문자 추출
        System.out.println(f.replace("Java","Python"));
        System.out.println(f.substring(4,7)); // 4번째 열부터 7미만의 문자 추출.
        System.out.println(f.toUpperCase());
        System.out.println(f.toLowerCase());
        System.out.println(oldStr);
        System.out.println(oldStr.trim());
//        String [] modifyTime = time.split(":");
        for (String ad : modifyTime) System.out.print(ad + " ");
        System.out.println();

        // 문자열 포맷팅을 출력을 위해서 사용
        System.out.printf("I eat %d apples. \n", 3);
        String test = String.format("I eat %d apples. \n", 3);
        System.out.println(test);

        for (char eCJh : chName) System.out.print(eCJh + " ");




    }
}
