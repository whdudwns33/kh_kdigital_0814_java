package 자동차만들기답;

public class Sedan extends Car{

    public Sedan (String name) {    // 생성자
        this.name = name;
        maxSpeed = 200;
        fuelEff = 12;
        fuelTank = 45;
        seatCnt = 4;
    }

    @Override
    int setMode(boolean isMode) {       // 메서드
        if(isMode) seatCnt +=1;
        return 0;
    }
}
