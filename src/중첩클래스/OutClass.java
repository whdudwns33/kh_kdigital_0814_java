package 중첩클래스;




public class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass{
        int inNum = 100;
        // static int cInNum = 200; // 인스턴스 내부 클래스에 정적 변수 선언 불가능
        void inTest() {
            System.out.println("외부 클래스의 인스턴스 변수 : " + num);
            System.out.println("외부 클래스의 정벅 변수 : " + sNum);
        }
        // static void sTest() {} // 인스턴스 내부 클래스에 정적 메소드 정의 불가능
    }

    public void usingClass() {
        inClass.inTest();
    }
}
