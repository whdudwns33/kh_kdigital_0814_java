package TV예제상속자포함;
// 상속을 위한 부모 클래스, 
// 시제품. 기본적인 기능을 함
// this 는 객체가 만들어지면 나오는 참조변수와 같은 것.
public class PrototypeTV {
    boolean isPower;    // 전원
    int channel;        // 채널
    int volume;         // 볼륨

    // 생성자 생성. 객체의 기본값을 초기화해주는 역할
    public PrototypeTV() {  
        this.isPower = false;
        this.channel = 10;
        this.volume = 15;
    }
    // 생성자 오버로딩: 매개변수 추가 등등.
    // 추가로 메서드와 생성자 오버로딩은 동일함.
    public PrototypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    // 메서드 생성
    public void setChannel(int ch) {
        if (ch > 0 && ch < 1000) {
            channel = ch;
        } else System.out.println("체널이 없습니다.");
    }
}

//class TV extends PrototypeTV { // 같은 클래스파일에 두 개의 클래스를 만들려면 public클래스는 하나만 있어야함 + 파일 이름과 같아야함
//    String name;
//    boolean isInternet;
//    TV() {
//        name = "Smart tv";
//    }
//    TV(String name){
//        isPower =false;
//        channel = 10;
//        volume = 12;
//        isInternet = false;
//        this.name = name;
//    }
//    // 메서드 추가
//    void setPower(boolean isPower) {
//        this.isPower = isPower;
//    }
//    void setVolume(int vol) {
//        if (vol >= 0 && vol <= 100) {
//            this.volume = vol;
//        } else System.out.println("볼륨을 다시 설정하세요");
//    }
//    // 오버라이딩. 부모에게서 상속받은 기능을 재정의 해서 사용
//    // 오버라이딩 하면 부모클래스와 자식클래스에 기능이 구현되어 있음
//    // 런 타임 동안(동적으로)에 기능을 선택함. 기본적으로 자식 클래스 사용
//    // 이를 동적 바인딩
//    @Override // 어노테이션(@) Override, 문법적으로 정당한지 확인이 가능.
//    public void setChannel(int ch) {
//        if(ch > 1 && ch < 2000) {
//            channel = ch;
//            System.out.println("채널을 " + channel + "선택하셨습니다");
//        } else System.out.println("체널 설정 범위를 벗어났습니다.");
//    }
//
//    // 메소드 오버로딩
//    // 동일 이름의 메소드를 매개변수의 타입이나 개수로 구분하는 것.
//    public void setChannel (int ch, boolean isInternet) {    // 인터넷 기능을 추가한 메서드 오버로딩
//        if(isInternet) {
//            System.out.println("인터넷 모드입니다.");
//            this.isInternet = true;
//        } else{
//            this.isInternet = false;
//            if(ch > 1 && ch < 2000) {
//                channel = ch;
//                System.out.println("채널을 " + channel + "선택하셨습니다");
//            } else System.out.println("체널 설정 범위를 벗어났습니다.");
//        }
//    }
//
//    // 출력 메서드 생성
//    void viewTv () {
//        System.out.println("이름 :" + name);
//        System.out.println("전워 :" + isPower);
//        System.out.println("채널 :" + channel);
//        System.out.println("볼륨 :" + volume);
//        System.out.println("인터넷모드 :" + isInternet);
//    }
//}
