package API;
// toString() : 해당 인스턴스의 정보를 문자열로 반환
// 클래스 이름@해시코드 (객체의 메모리 주소를 통해 해시 코드 생성)
// toString()은 오버라이딩이 가능하며 String, Integer의 경우 오버라이딩 되어 있음.
public class Object {
    public static void main(StringEx[] args) {
        Car car01 = new Car();
        Car car02 = new Car();

        System.out.println(car01.toString());   // API.Car@2133c8f8: 주소를 표현.
        System.out.println(car02.toString());
        System.out.println(car01.equals(car02));
        car01 = car02; // 두 참조 변수가 같은 주소를 가리킴.
        System.out.println(car01.equals(car02));
    }
}

class Car {

}
