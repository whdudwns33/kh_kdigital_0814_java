package List프레임워크;
import java.util.ArrayList;
import java.util.Comparator;
import static java.lang.System.*;
// List 와 ArrayList의 차이점
// List는 배열에 정수형, 문자열 등 데이터 값(참조변수)만 입력이 되지만, ArrayList는 클래스 자체를 저장할 수 있음

// add 배열에 데이터 삽입
// get 특정 인덱스의 배열 데이터 출력
// size 배열의 길이(크기)
// contains 배열에 해당 정보가 존재하는 지 판별 후 boolean(true or false)으로 반환
// String.join ","로 구분: 문자열만 되는 듯.
// 오름차순 정렬 : `Comparator.naturalOrder()`
// 내림차순 정렬 : `Comparator.reverseOrder()`


public class List {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();  // 문자열
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        String resualt = String.join(",", pitches); // ,로 문자열 구분
        out.println(pitches);

        ArrayList<Integer> A = new ArrayList<>();       // 정수형
        A.add(10);
        A.add(20);
        A.add(30);
        out.println(A);          // [10, 20, 30]
        A.add(0, 1001);   // 0번째열 데이터 삽입, 나머지 요소는 뒤로 한칸씩 밀림
        out.println(A);          //  [1001, 10, 20, 30]
        out.println(A.get(1));   // 1번째열 데이터인 10 출력
        out.println(A.size());   // 0번째열부터 3번째 열까지의 길이인 4 출력
        out.println(A.contains(10)); // true
        out.println(A.contains(99)); // false

        ArrayList<String> str = new ArrayList<>();
        str.add("A");
        str.add("D");
        str.add("C");
        str.add("B");
        str.sort(Comparator.naturalOrder());    // 오름차순 정렬.
        out.println(str);
        str.sort(Comparator.reverseOrder());    // 내림차순 정렬.
        out.println(str);


        ArrayList<MenuInfo> list = new ArrayList<>();
        list.add(new MenuInfo("피자", 15000));    // 클래스의 객체를 배열레 저장.
        list.add(new MenuInfo("햄버거", 5000));
        list.add(new MenuInfo("치킨", 18000));

        for(int i = 0; i < list.size(); i++) {
            out.println(list.get(i).getMenu());
        }
    }
}


// 클래스 자체를 배열에 추가 가능.
class MenuInfo {
    String name;
    int price;

    MenuInfo (String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getMenu() {
        return ("name : " + name + " \n" + "price : " + price);
    }
}
