package 객체타입확인;
// InstanceOf : 상속관계가 성립하는지 확인하는 용도
// 왼쪽 피연사자가 오른쪽 피연산자의 인스턴스인지를 검사하며
// 결과 값이 불리언 값(true / false)으로 변환됩니다.
public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");
        System.out.println(parent instanceof Parent); // 왼쪽 객체가 오른쪽 클래스의 인스턴스인지 판별
        System.out.println(child instanceof Parent);  // 부모로 부터 상속 받은 객체이므로 참
        System.out.println(parent instanceof Child);  // 부모가 자식에게서 상속받은게 아님.
        System.out.println(child instanceof Child);   // 자식클래스로 자식객체를 만들었기 때문에 참임
    }
}

class Parent {
    String name;


    //생성자 생성 : 인스턴스 값 초기화
    Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    Child(String name) {    // 부모 생성자가 디폴트값이 아닌 String name을 직접 선언했기 때문에 자식에서도 name이 필요함

        super("부모");
        this.name = name;

    }
}
