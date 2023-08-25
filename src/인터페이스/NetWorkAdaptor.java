package 인터페이스;

public interface NetWorkAdaptor {   // 연결 통로.
    public abstract void connect(); // 자동으로 public abstract가 포함됨. 붙이나 안붙이나 상관없음. 완전 추상화
}


// 유선인터넷.
class Lan implements NetWorkAdaptor{ // 상속받음
    String commpany;
    Lan(String commpany){
        this.commpany = commpany;
    }

    @Override   // 실제 기능을 구현하기 위함이므로 abstract를 사용하면 안됨
    public void connect(){ 
        System.out.println(commpany + " Lan에 연결되었습니다.");
    }
}

class WiFi implements NetWorkAdaptor {
    String commpany;
    WiFi(String commpany){
        this.commpany = commpany;
    }

    @Override
    public void connect() {
        System.out.println(commpany + " WiFI에 연결되었습니다.");
    }
}


class FiveG implements NetWorkAdaptor {
    String commpany;
    FiveG(String commpany){
        this.commpany = commpany;
    }

    @Override
    public void connect() {
        System.out.println(commpany + " 5G에 연결되었습니다.");
    }
}