package 디폴트메서드;
// 디폴트 메서드는 상속을 안받음
public class Audio implements RemoteCont{
    private int volume;

    @Override
    public void turnON() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int vol) {
        if(vol > RemoteCont.MAX_VOLUME){
            this.volume = RemoteCont.MAX_VOLUME;
        } else if (vol < RemoteCont.MIN_VOLUME){
            this.volume = RemoteCont.MIN_VOLUME;
        } else {
            this.volume = vol;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }
    void getInfo() {
        System.out.println("오디오 입니다.");
        System.out.println("현재 오디오 볼륨은 " + volume + "입니다.");
    }
    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("오디오를 무음 처리 합니다.");
        else System.out.println("오디오를 무음 처리를 해제 합니다.");
    }
}
