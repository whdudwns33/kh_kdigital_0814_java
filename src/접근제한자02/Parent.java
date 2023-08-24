package 접근제한자02;
//
public class Parent {
    public String name;
    String money;
    protected String addr;  // 상속관계나 같은 패키지 내에서 접근 가능
    public Parent() {
        name = "부모님";
        money = "100억";
        addr = "서울";
    }
}
