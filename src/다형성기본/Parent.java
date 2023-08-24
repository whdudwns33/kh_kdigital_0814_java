package 다형성기본;
// 부모 클래스
// ** 부모 클래스도 Object로 부터 상속받고 있음. 생략되어 있을 뿐임. 나중에 다시 공부할 내용 넘어가
// 생성자 자체는 메서드의 일부임.
public class Parent {
        protected int money = 10;          //상속관계와 같은 패키지 내에서 접근가능.
        int num = 1000;
        public void display() {
            System.out.println("부모클래스의 메서드");

    }
}
