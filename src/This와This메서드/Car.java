package This와This메서드;
// this라는 것은 Car car = new Car(); 에서 car:참조변수를 의미함.
public class Car {
    // 인스턴스 필드
    private String model;
    private int year;
    private String colors;
    private int maxSpeed;

    Car() {}
    Car(String model) {
        this(model, 2022, "검정", 200);   // this() 이미 만들어진 생성자를 호출함.
    }
    Car(String model, int year, String colors, int speed) { // 매개변수 설정-> 이것은 지역변수
        this.model = model; // 지금은 매개변수(=지역변수)와 인스턴스변수의 이름이 같은 경우 충돌이 일어나 매개변수로만 설정될 수 있음
        // this라는 것은 Car car = new Car(); 에서 car:참조변수를 의미함.
        // 즉, 여기서는 클래스의 인스턴스 변수와 메서드의 매개 변수를 구분하기 위함. 왜냐? 여기서는 이름을 같게 설정해서
        this.year = year;
        maxSpeed =speed; // 이 자체로는 이름이 다르기 때문에 this를 쓸필요가 없음. 그리고 this는 max앞에 숨어 있음.
    }
}
