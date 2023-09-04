package 스트림;
//

import java.util.ArrayList;
import java.util.List;

public class Main07 {
    public static void main(String[] args) {
        TravelCustomer A = new TravelCustomer("A", 25, 100);
        TravelCustomer B = new TravelCustomer("B", 23, 105);
        TravelCustomer C = new TravelCustomer("C", 21, 110);
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(A);
        customerList.add(B);
        customerList.add(C);
        customerList.add(new TravelCustomer("D", 19, 120));
        System.out.println("=".repeat(5)+ "고객명단" + "=".repeat(5));
        customerList.stream().map(c->c.getName()).forEach(c -> System.out.println(c + " "));    // 이름만 출력.
        System.out.println();
        // 총 비용
        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("총비용" + total);
        // 20세 이상 성인 출력
        System.out.println("=".repeat(5)+ "성인" + "=".repeat(5));
        customerList.stream()
                .filter(c -> c.getAge() >= 20)          // 20세 이상만 출력하는 조건  중간 연산
                .map(c -> c.getName())                  // 20세 이상의 이름을 출력하는 중간 연산
                .sorted()                               // 정렬. 아스킷코드 값 기준.
                .forEach(c -> System.out.println(c + " "));


    }
}

class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
