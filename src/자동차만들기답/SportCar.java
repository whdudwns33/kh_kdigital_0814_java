package 자동차만들기답;

public class SportCar extends Car{


    public SportCar (String name) {
        this.name = name;
        maxSpeed = 250;
        fuelEff = 8;
        fuelTank = 30;
        seatCnt = 2;
    }

    @Override
    int setMode(boolean isMode) {
        if (isMode) maxSpeed *= 1.2;
        return 0;
    }
}
