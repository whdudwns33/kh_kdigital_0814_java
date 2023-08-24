package This와This메서드;
// this : 자기자신의 객체(인스턴스)를 참조하는데 사용하는 변수. 참조 변수
// this() : 디스 메서드는 생성자 내에서 다른 생성자를 호출하는데 사용
public class ThisRef {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("자동차");
    }
}
