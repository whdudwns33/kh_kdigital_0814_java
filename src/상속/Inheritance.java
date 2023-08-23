package 상속;
// 상속 : 자식 클래스가 부모 클래스의 기능을 물려 받는 것.(필드와 메서드)
// 키워드는 extends
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("강아지");
        dog.sleep();    // 출력까지 만들어진 메서드 추가
        System.out.println(dog.name);

        HouseDog houseDog = new HouseDog();
        houseDog.setName("뽀삐");
        houseDog.sleep();       // 오버라이딩이 발생, 가장 마지막에 만들어진 sleep 매서드가 출력
                                // 이걸 오버라이딩이라고 함. 재정의 된것임.
        houseDog.setName("해피");
        houseDog.sleep(10);
    }
}
