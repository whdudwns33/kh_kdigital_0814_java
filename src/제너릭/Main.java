package 제너릭;

class Person <T> {      // T는 타입 변수로 타입 선언
    public T info;
    Person(T info) {
        this.info = info;
    }
}

public class Main {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("고유림");    // 문자열 타입에 문자열 정보 출력
        Person<Integer> p2 = new Person<>(1000);      // 정수형 타입에 정수 입력 후 출력
        System.out.println(p1.info);
        System.out.println(p2.info);
    }
}