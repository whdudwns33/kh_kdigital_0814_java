package 상속;

public class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}
// class 앞에 default 가 생략되어 있음.
// Animal을 상속받아 Dog 클래스를 만듦.
class Dog extends Animal {
    void sleep() { // 오버라이딩. 기능을 상속받아서 새로운 정의를 만들어 냄. 있는 특성을 재정의함.
        System.out.println(this.name + "zzz"); // 자식 클래스에서 새로운 특성을 만듦.
    }

}

class HouseDog extends Dog {
    void sleep() {
        System.out.println(this.name + "zzz in house");
    }
    void sleep(int h) {     // 이것은 오버로딩. 위에서 오버라이딩한 것을 오버로딩하는 것.
                            // 그러니까 새로운 매개변수를 추가함.
        System.out.println(this.name + "zzz in home" + h + "시간 동안");

    }
}