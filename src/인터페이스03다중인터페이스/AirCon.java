package 인터페이스03다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // public final static 숨겨져 있음. 인터페이스이기 때문에, 인터페이스는 객체화가 안됨.
    int MIN_TEMP = 0;
    void airConON();  // 상속 받은 클래스에서 기능을 완성해야 함. 추상 메서드.
    void airConOFF();
    void setAirConTemp(int tmp);
}
