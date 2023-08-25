package 디폴트메서드;

public interface RemoteCont {
    int MAX_VOLUME = 100; // FINAL STSTIC 추가됨.
    int MIN_VOLUME = 0;
    void turnON(); // 추상메서드 자동으로 public abstract 추가됨
    void turnOff(); // 추상메서드
    void setVolume(int vol); // 추상 메서드
    // 디폴트 메서드는 JDK 8 이후 추가됨.
    default void setMute(boolean mute) {// 음소거 기능 추상 메서드
                                        // 음소거 기능을 상속받아서 오버라이딩 해도 되고 안해도 됨.
        if (mute) System.out.println("음소거");
        else System.out.println("해제");
    }
    static void changeBattery() {
        System.out.println("건전지를 교환 합니다.");
    }
}
