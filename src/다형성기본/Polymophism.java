package 다형성기본;

public class Polymophism {  //
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        child.out();
        child.display();
        parent.display();

        System.out.println("===");
        Parent p = new Child(); // 부모클래스의 참조변수p로 자식 개체를 접근할 수 있음.
                                // 자식클래스는 부모 클래스로부터 상속받기 때문에 가능
        p.display();            // 부모 클래스의 메서드만 상속
                                // display는 누구의 메서드가 불려질까.
                                // 일단은 자식의 메서드가 불려짐
                                // 동적 바인딩 런타임동안 시행. 상속받아 재정의(오버라이딩)된 메서드 호출

                                    
        
        child.out();            // 자식 클래스의 메서드 두개 모두 상속
        child.display();


    }
}


