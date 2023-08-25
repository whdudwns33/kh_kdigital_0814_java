package 추상클래스02;

// 객체화(인스턴스화)가 될 수 없는 추상화 클래스
public abstract class Phone {
    public String name;
    public boolean isPower;
    public Phone(String name) {
        this.name = name;
    }
    public void setPower(boolean isPower) {
        this.isPower =  isPower;
        if(isPower) System.out.println("Phone power ON");
        else System.out.println("Phone power Off");
    }
    abstract void call();
}
