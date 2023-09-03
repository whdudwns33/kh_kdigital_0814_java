package Set프레임워크;

import java.util.HashSet;
// 중복 제거를 위한 예제: 카리나와 지수 중복
public class MemberHashSetTest {
    public static void main(String[] args) {    // 각각의 객체를 생성한 후 hashSet
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "유나");
        Member member2 = new Member(1002, "채원");
        Member member3 = new Member(1003, "지수");
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);

        hashSet.add(new Member(1003, "카리나"));   // 지수와 id 동일
                                                           // 하지만, 각각 다른 객체로 생성되었기 때문에 1003은 중복제거 되지 않음
                                                           // 인스턴스 주소가 다르기 때문에 hashcode가 다른 것.
        for(Member e : hashSet) e.showMember();
    }
}



class Member {  // 객체 클래스.
    int id;
    String name;
    @Override
    public int hashCode() { // 해시코드를 오버라이딩. @~~~~ 주소 값의 중복을 제거하기 위함.
        return id;
    }
    @Override
    public boolean equals(Object obj) { // 객체인 obj
        if(obj instanceof Member) {     // obj가 Member의 객체인지 확인 하는 것.
            Member member = (Member) obj;
            if(this.id == member.id) return true;
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {    // 생성자: 객체의 초기화를 위함.
        this.id = id;
        this.name = name;
    }
    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}

