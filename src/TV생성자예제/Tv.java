package TV생성자예제;

public class Tv {
    private boolean isON; //TV전원
    private int channel;  //채널 . private로 고정되어 있기 때문에 매서드로만 변경 가능
    private int volume;   //볼륨

    Tv() {  // 기본 값(아무것도 안했을 때)을 표현한 생성자
        isON = false;   // 전원이  켜지고 꺼지고를 표현
        channel = 11;
        volume = 10;
        System.out.println("전원 :" + isON + " 채널 :" + channel + " 볼륨 :" + volume);
    }
    Tv(boolean isON, int ch, int vol) { //
        this.isON = isON;
        channel = ch;
        volume = vol;
        System.out.println("전원 :" + isON + " 채널 :" + channel + " 볼륨 :" + volume);
    }
    public void setON(boolean isON) {
        this.isON = isON;
        String onOffStr = (isON) ? "on" : "off";
        System.out.println("TV 전원이 " + onOffStr + "되었습니다.");
    }
    public void setChannel(int ch) {
        if (ch >= 1 && ch <1000) {
            channel =  ch;
            System.out.println("채널은" + channel + "입니다.");
        } else {
            System.out.println("채널 설정값이 허용범위를 벗어났습니다.");
        }
    }
    public void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨은" + volume + "입니다.");
        } else {
            System.out.println("잘 못 입력하셨습니다.");
        }
    }
    public void getInfoTv() {
        String onOffStr = (isON) ? "on" : "off";
        System.out.println("=". repeat(5) + "Tv정보" + "=".repeat(5));
        System.out.println("전원 : " + onOffStr);
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + channel);
    }
}
