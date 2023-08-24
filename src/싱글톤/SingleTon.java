package 싱글톤;

public class SingleTon {
    String name;
    int id;
    // 클래스내에서 단 한번 객체를 생성함.
    private static SingleTon singleTon = new SingleTon();
    // 생성자를 외부에서 호출되지 않도록 접근제한을 함.
    private SingleTon() {
        name = "test";
        id = 100;
    }
    // 한번 만들어진 객체에 대한 주소를 반환함.
    static SingleTon getSingleTon() {
        return singleTon;
    }
}
