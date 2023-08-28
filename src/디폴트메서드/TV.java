package 디폴트메서드;
// 디폴트 메서드도 선택.
public class TV implements RemoteCont{
    private int volume;

    @Override
    public void turnON() {  // 추상 메서드로 무조건 선언해야됨
        System.out.println("티비를 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("티비를 끕니다.");
    }// 추상 메서드로 무조건 선언해야됨
    @Override
    public void setVolume(int vol) {// 추상 메서드로 무조건 선언해야됨
        if(vol > RemoteCont.MAX_VOLUME){
            this.volume = RemoteCont.MAX_VOLUME;
        } else if (vol < RemoteCont.MIN_VOLUME){
            this.volume = RemoteCont.MIN_VOLUME;
        } else {
            this.volume = vol;
        }
        System.out.println("현재 티비 볼륨: " + this.volume);
    }
    void getInfo() {
        System.out.println("티비 입니다.");
        System.out.println("현재 티비 볼륨은 " + volume + "입니다.");
    }
    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("티비를 무음 처리 합니다.");
        else System.out.println("티비를 무음 처리를 해제 합니다.");
    }
}
