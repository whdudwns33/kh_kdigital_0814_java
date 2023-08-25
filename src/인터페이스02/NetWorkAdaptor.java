package 인터페이스02;

public interface NetWorkAdaptor {
    void connect();          // 이 기능을 상속받아 오버라이딩하도록, 구현하도록 추상화 함
                             // 원래는 {}가 포함되어야 하는데 상속받은 클래스에서 정의할 수 있도록 한것.
    void send (String msg); // 이 기능을 상속받아 오버라이딩하도록, 구현하도록 추상화 함.
}


class Wifi implements NetWorkAdaptor{

    @Override
    public void connect() {
        System.out.println("Wifi 연결");
    }

    @Override
    public void send(String msg) {
        System.out.println("Wifi >>" + msg);
    }
}

class FiveG implements NetWorkAdaptor{

    @Override
    public void connect() {
        System.out.println("FiveG 연결");
    }

    @Override
    public void send(String msg) {
        System.out.println("FiveG >>" + msg);
    }
}