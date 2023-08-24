package TV예제상속자포함;
// main으로 객체 생성 및 메서드로 결과 도출
public class InheritanceTv {
    public static void main(String[] args) {
        PrototypeTV prototypeTV = new PrototypeTV();  // 상속을 주는 클래스가 객체화(인스턴스화) 된다는 의미가 추상화가 아니라는 의미
        TV smartTv = new TV("우리집 티비"); // 우항의 TV()는 생성자. TV클래스에서 오버로딩된 생성자
        smartTv.setPower(true);
        smartTv.setVolume(120);
        smartTv.setChannel(1200, true);
        smartTv.viewTv();
    }
}
