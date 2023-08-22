package 생성자;

public class Car {
    // 인스턴스 필드
    // 생성자는 아래의 값이 정해진 인스턴스 필드의 값을 초기화 해주는 역할을 함.
    String company = "현대자동차";
    String model;
    String color;
    int speed;
    int horsePower;

    // 메서드 오버로딩, 매개변수(여기서는 model)가 있는 것과 없는 것.
    Car() {}
    Car(String model) {
        this.model = model; // 자신의 객체를 참조함
    }
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    Car(String model, String color, int speed, int horsePower) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }


    //디폴트 생성자 : Car()

    // 인스턴스 필드를 도출하는 메소드
    public void carInfo() {
        System.out.println(company);
        System.out.println(model);
        System.out.println(color);
        System.out.println(speed);
        System.out.println(horsePower);
    }
}
