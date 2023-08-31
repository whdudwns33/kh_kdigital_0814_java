package 인터페이스03다중인터페이스;
// 인터페이스는 다중 상속이 가능하여 각 인터페이스의 추상메서드가 메인 클래스에 상속이 가능하고
// 일반적인 상속은 다중 상속이 불가능 하기 때문에 하나의 클래스에서만 상속이 가능하다.
public class SportCar extends Car implements AirCon, AutoDrive {
    private boolean isAirCon; // AirCon ON/OFF
    private int setTemp;
    private boolean isAutoDrv;
    private int speed;
    private String color;
    private String year;
    private boolean isTurbo;


    // 생성자 생성.
    public SportCar(boolean isAirCon, int setTemp,
                    boolean isAutoDrv, int speed, String color,
                    String year) {
        this.isAirCon = isAirCon;
        this.setTemp = setTemp;
        this.isAutoDrv = isAutoDrv;
        this.speed = speed;
        this.color = color;
        this.year = year;
        this.isTurbo = false;
    }
    public void viewInfo() {    // 메서드. 정보 출력
        String airConStr = (isAirCon) ? "ON" : "OFF";
        String autoStr = (isAutoDrv) ? "ON" : "OFF";
        String turboStr = (isTurbo) ? "ON" : "OFF";
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("제작연도 : " + year);
        System.out.println("에어컨 : " + airConStr);
        System.out.println("에어컨 온도 : " + setTemp);
        System.out.println("자율 주행 : " + autoStr);
        System.out.println("터보 모드 : " + turboStr);
    }

    @Override
    public void airConON() {
        System.out.println("에어컨을 켰습니다.");
    }

    @Override
    public void airConOFF() {
        System.out.println("에어컨을 껐습니다.");
    }

    @Override
    public void setAirConTemp(int tmp) {
        System.out.println("에어컨 설정 온도를 " + tmp + "로 변경 합니다.");
    }

    @Override
    public void setAitConTemp(int temp) {
        System.out.println("에어컨 설정 온도를 " + temp + "로 변경 합니다.");
    }

    @Override
    public void autoDrvON() {
        System.out.println("자율 주행 모드를 켰습니다.");
    }

    @Override
    public void autoDrvOFF() {
        System.out.println("자율 주행 모드를 껐습니다.");
    }
}