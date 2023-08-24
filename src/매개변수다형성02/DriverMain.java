package 매개변수다형성02;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver("마법사");
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        SportCar sportCar = new SportCar();
        Scanner sc = new Scanner(System.in);
        System.out.println("운전하고 싶은 차량 선택 : [1]버스 [2]택시 [3]스포츠카 :");
        int selcar = sc.nextInt();
        switch (selcar) {
            case 1 : driver.drive(bus); break;
            case 2 : driver.drive(taxi); break;
            case 3 : driver.drive(sportCar); break;
            default: System.out.println("해당 차량이 없습니다.");
        }
    }
}
