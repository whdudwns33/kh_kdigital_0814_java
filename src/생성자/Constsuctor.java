package 생성자;

public class Constsuctor {
    public static void main(String[] args) {
        Car car = new Car();
        car.carInfo();

        Car santafe = new Car("싼타페");
        santafe.carInfo();

        Car avante = new Car("아반테", "흰색");
        avante.carInfo();

        Car granger = new Car("그랜저", "검은색",200);
        granger.carInfo();

        Car tucson = new Car("투싼", "레드", 200, 170);
        tucson.carInfo();

    }
}
