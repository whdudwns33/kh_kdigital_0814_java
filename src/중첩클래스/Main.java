package 중첩클래스;

public class Main {

        public static void main(String[] args) {
            A a = new A();              // A클래스의 객체 생성
            A.B b = a.new B();          // A클래스 내부의 B클래스를 이용하여 a참조변수를 이용한 B객체 생성
            b.testMethod();
        }
    }

    class A {
        class B {
            void testMethod() {
                System.out.println("중첩 클래스의 메소드 입니다.");
            }
        }
    }

