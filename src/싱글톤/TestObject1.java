package 싱글톤;
// 싱글톤이란 객체를 하나만 지장하는 것
public class TestObject1 {
    SingleTon single = SingleTon.getSingleTon();
    void setInfo (String name, int id) {
        single.name = name;
        single.id = id;
    }
    void viewInfo() {
        System.out.println("이름 :" + single.name);
        System.out.println("id :" + single.id);
    }
}
