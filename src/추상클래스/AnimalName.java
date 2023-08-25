package 추상클래스;

public class AnimalName {
    public static void main(String[] args) {
//        AniamalClass aniamalClass = new AniamalClass(); // 이렇게는 안됨. 추상클래스는 객체생성이 안되니까
        Cat cat = new Cat();
        cat.cry();
        cat.sleep();
        System.out.println("========");
        Dog dog = new Dog();
        dog.cry();
        dog.sleep();
// 추상클래스의 참조변수로 상속 객체를 접근
        AniamalClass aniamal = new Cat(); // 추상클래스에서 상속받은 실체가 있는 Cat이나 Dog 클래스를 객체로 접근 가능하다.
        aniamal.cry();
        aniamal.sleep();
        }
    }

