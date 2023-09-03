package Map프레임워크;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;




public class HashMap {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = (Map<String, Integer>) new HashMap();    //???
        // 객체 저장
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 96); // 키가 같기 때문에 나중에 저장된 값으로 대치
        System.out.println("총 Entry 수 : " + map.size());
        // 객체 찾기
        System.out.println(map.get("동그라미"));
        // 객체를 하나씩 처리
        Set<String> keySet = map.keySet(); // 모든 키를 Set 객체에 담아서 리턴
        Iterator<String> iterator = keySet.iterator();
        System.out.println("iterator를 이용하는 방법");
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + "\t" + value);
        }
        System.out.println();


        // 향상된 for문을 이용하는 방법 : keySet()으로 key를 포함하는 Set컨렉션 반환
        System.out.println("향상된 for문을 사용하는 방법");
        for (String key : map.keySet()) {
            System.out.println(key + "\t" + map.get(key));
        }

        //객체 삭제
        map.remove("최수연"); // 키로 Map.Entry를 제거
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();

        // replace() 메소드를 이용한 요소 수정
        map.replace("이준호", 91);

        // 객체를 하나씩 처리, 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 set에 담아서 리턴
        System.out.println("iterator entrySet() ");
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "\t" + value);
        }
        System.out.println();

        //객체 전체 삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());
    }
}
