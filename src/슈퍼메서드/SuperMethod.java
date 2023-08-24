package 슈퍼메서드;
// super: 부모의 필드나 메서드를 접근할 때 사용
// super(): 부모의 생성자를 호출
public class SuperMethod {
    public static void main(String[] args) {
        Child child = new Child();
//        child.childMethod();
        child.display();
    }
}





class Parent {
//    int x = 10;
    int a;
//    Parent() { //
//        a = 10;
//    }
    Parent(int n) {
        a = n;
    }
}




class Child extends Parent {
//    int x = 20;
    int b;
    Child() {
        super(100); // 부모의 메서드를 불러주는 것.
        b =20;
    }
    void display () {
            System.out.println(a);
            System.out.println(b);
    }
//    void childMethod () {   // this 참조변수
//        System.out.println("x :" + x);  // 자식 필드 접근
//        System.out.println("x :" + this.x); // 자식 필드 접근. 원래 this는 숨어 있던거니까
//        System.out.println("x :" + super.x);// 부모의 필드 접근
//    }
}