package 자바마지막프로젝트02;

import 자바마지막프로젝트.MenuInfo;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, MenuInfo> map = readList(); // 맵 객체 생성

        for(String e : map.keySet()) {
            System.out.println("메뉴 : " + map.get(e).getName()); // .name이런 식으로 못 불러오는 것은
                                                                 // private 필드라서 게터를 불러와야 함.
            System.out.println("가격 : " + map.get(e).getPrice());
            System.out.println("분류 : " + map.get(e).getCategory());
            System.out.println("설명 : " + map.get(e).getDescription());
            System.out.println("-".repeat(28));
        }
    }


    public static Map<String, MenuInfo> readList () { // 읽는 메서드, 프론트엔드에서 많이 쓰임.
        try {
            FileInputStream fis = new FileInputStream("src/자바마지막프로젝트02/text.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String, MenuInfo> map = (Map<String, MenuInfo>) ois.readObject();
            return map;
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {}
        return null;
    }
}






