package TV예제상속자포함;
// 이전에 만들었던 Tv에서 상속관계를 적용하고 오버라이딩 이점을 확인
// 프로토타입 티비로부터 상속을 받는 자식 클래스. 양산용 TV생성
// 상속은 extends를 사용

public class TV extends PrototypeTV {
    // 자식 클래스에서 새로운 인스턴스 변수 선언
    // 이름과 인터넷.
    // 속성을 추가
    String name;
    boolean isInternet;
    TV() {
        name = "Smart tv";
    }
    TV(String name){
        isPower =false;
        channel = 10;
        volume = 12;
        isInternet = false; //인터넷은 없음을 기본으로 선언
        this.name = name;   //this는 참조변수, 인스턴스 변수와 매개변수를 비교하기 위함
    }
    // 메서드 추가
    void setPower(boolean isPower) {
        this.isPower = isPower;
    }
    void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            this.volume = vol;
        } else System.out.println("볼륨을 다시 설정하세요");
    }
    // 오버라이딩. 부모에게서 상속받은 기능을 재정의 해서 사용
    // 오버라이딩 하면 부모클래스와 자식클래스에 기능이 구현되어 있음
    // 런 타임 동안(동적으로)에 기능을 선택함. 기본적으로 자식 클래스 사용
    // 이를 동적 바인딩
    @Override // 어노테이션(@) Override, 문법적으로 정당한지 확인이 가능.
    public void setChannel(int ch) {
        if(ch > 1 && ch < 2000) {
            channel = ch;
            System.out.println("채널을 " + channel + "선택하셨습니다");
        } else System.out.println("체널 설정 범위를 벗어났습니다.");
    }

    // 메소드 오버로딩
    // 동일 이름의 메소드를 매개변수의 타입이나 개수로 구분하는 것.
    // void는 반환타입이 없다는 것.
        //아래는 void return 예시 다시 한번 해보기
//    void setName(String name) {
//        this.name = name;
//        System.out.println(name);
//    }
//
//    public int Num(int a, int b) {
//        return a+b;
//    }



    public void setChannel (int ch, boolean isInternet) {    // 인터넷 기능을 추가한 메서드 오버로딩
        if(isInternet) {
            System.out.println("인터넷 모드입니다.");
            this.isInternet = true;
        } else{
            this.isInternet = false;
            if(ch > 1 && ch < 2000) {
                channel = ch;
                System.out.println("채널을 " + channel + "선택하셨습니다");
            } else System.out.println("체널 설정 범위를 벗어났습니다.");
        }
    }

    // 출력 메서드 생성
    void viewTv () {
        System.out.println("이름 :" + name);
        System.out.println("전원 :" + isPower);
        System.out.println("채널 :" + channel);
        System.out.println("볼륨 :" + volume);
        System.out.println("인터넷모드 :" + isInternet);
    }
}
