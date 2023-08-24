package 매개변수다형성02;

public class Vehicle {
    // 부모 클래스
    public void run() {
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle {
    // 자식클래스1
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}

class SportCar extends Vehicle {
    // 자식클래스2
    @Override
    public void run() {
        System.out.println("스포츠카가 달립니다.");
    }
}

class Taxi extends Vehicle {
    // 자식클래스3
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}