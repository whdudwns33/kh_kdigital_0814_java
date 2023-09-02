package API;
// clone()은 Cloable 인터페이스를 상속받아야만 사용 가능
public class Clone {
    public static void main(StringEx[] args) {
        Member mem1 = new Member("bear", "곰돌이사육사", "12345", 23, true);
        Member mem2 = mem1.getMember(); // 얕은 복사. 객체의 주소값을 복사하고 값을 동일하게 복사. 단순 복사인듯
        mem2.age = 100;                 // 그래서 값을 변경함.
        mem2.name = "test";

        System.out.println("name : " + mem1.name);
        System.out.println("name : " + mem2.name);

        System.out.println("age : " + mem1.age);
        System.out.println("age : " + mem2.age);
    }
}

class Member implements Cloneable {
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // 클론 메서드는 Object타입이므로 Member 타입으로 변경
        } catch (CloneNotSupportedException e) { }
        return cloned;
    }
}