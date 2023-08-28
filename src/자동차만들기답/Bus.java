package 자동차만들기답;

public class Bus extends Car{
    @Override
    int setMode(boolean isMode) {
        if(isMode) fuelTank += 30;
        return 0;
    }
    public Bus (String name) {
        this.name = name;
        maxSpeed = 150;
        fuelEff = 5;
        fuelTank = 100;
        seatCnt = 20;
    }
}
