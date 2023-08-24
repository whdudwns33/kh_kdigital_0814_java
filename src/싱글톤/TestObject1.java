package 싱글톤;

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
