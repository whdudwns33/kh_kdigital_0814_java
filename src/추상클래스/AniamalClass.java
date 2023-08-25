package 추상클래스;
// 느슨한 결합관계.
// 추상클래스는 클래스 앞에 abstract 키워드를 붙여서 만듦.
// 추상클래스는 객체화가 안됨.
// 내부에 0개 이상의 추상메서드가 포함되어 있음.
// 추상 메서드는 반드시 상속받는 클래스에서 오버라이딩을 줘야 한다.(해당 메서드의 기능을 구체화하는 것.)
//
public abstract class AniamalClass { //객체로 만들수가 없음.
    abstract void cry(); // 추상화 된것. 이름만 만들었음.
    // 이게 추상메서드임:
    // 상속받은 클래스에서 구체화를 해주어야 함. 오버라이딩이 필요한 것.

//    void cry(){}
    void sleep () {// 일반 메서드. 상속받아서 오버라이딩을 굳이 할 필요는 없음. 그리고 상속을 받아도 되고 안받아도 됨.
        System.out.println("zzz");
    }   // 일반적인 메서드
}

class Cat extends AniamalClass { // 추상클래스를 상속받았기 때문에 오버라이딩이 필요함.
    @Override
    void cry() {
        System.out.println("이야옹");
    }
    @Override
    void sleep() {  // 추상클래스의 일반 메서드를 상속받아서 오버라이딩함. 안해도 됨.
        System.out.println("ZZZZ");
    }    // 일반적인 메서드 오버라이딩(재정의)
}

class Dog extends AniamalClass {

    @Override
    void cry() { // 추상메서드는 무조건 상속받아서 오버라이딩 해야함.
        System.out.println("멍멍");
    }
}

