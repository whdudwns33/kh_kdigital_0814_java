package 오버라이딩금지;

public class Car {
    int speed;
    String name;
    String color;
    final void accelerator() {  // 바뀌면 안되는 메서드를 고정시키는 역할 final
        System.out.println("차의 속도를 증가 시킵니다.");
    }
    void breakPanel() {
        System.out.println("차의 속도를 감소 시킵니다.");
    }
}

class sportCar extends Car {
    boolean isTutbo;
    sportCar(String name) {
        isTutbo = false;
        speed = 200;
        this.name = name;
        this.color = "red";
    }
//    @Override // 어노테이션: 상속이 문법적으로 성립하는지 확인해줌.
//    void accelerator() {
//        super.accelerator();
//        System.out.println("차의속도를 200% 증가시킵니다.");
//    }
//    @Override
//    void breakPanel() {
//        super.breakPanel();
//        System.out.println("차의속도를 감속합니다.");

    int getspeed() {
        if(isTutbo) return speed *= 1.2;
        return speed;
    }
    public boolean isTutbo() {
        return isTutbo;
    }
    public void setTutbo(boolean turbo) {
        isTutbo = turbo;
    }
    void infoCar() {
        System.out.println("이름 :" + name );
        System.out.println("속도 :" + getspeed());
        System.out.println("색상 :" + color);
        System.out.println("터보모드 :" + isTutbo);
    }
}
class ElectricCar extends Car {
    boolean isAutoDrv;

    ElectricCar(String name) {
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        color = "White";
    }

    public boolean isAutoDrv() {
        return isAutoDrv;
    }

    public void setAutoDrv(boolean autoDrv) {
        isAutoDrv = autoDrv;
    }

    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율주행 : " + isAutoDrv);

    }
}
