package 매개변수다형성02;

public class Driver {
    String name;
    public Driver (String name) {
        this.name = name;
    }
    public void drive (Vehicle vehicle) { // 매개변수의 다형성.
        System.out.print(name + "의 ");
        vehicle.run();
    }
}

