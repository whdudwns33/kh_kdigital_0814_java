package 클래스기본;
// 이부분은 오늘 한번 강의 다시 들어보기
// 막 이해를 못한 것은 아니지만, 살짝 필기하다가 지나간 부분이 있는 듯.
// 스태틱 할당 얘기 부분이 조금 부족함.
// new는 객체 생성자

public class Classbasic {// 얘도 클래스
    public static void main(String[] args) {// public 공용 접근제어자
        // 객체 생성, 스튜던트 클래스에 대한 s1은 참조 변수, type은 스튜던트의 타입
        Student s1 = new Student();         // 메모리에 동적 할당(프로그램 런타임에 할당)을 한다.
                                            // 힙 영역에 저장,
                                            // 인스턴스화
        System.out.println(s1.setname("마법사"));
        System.out.println(s1.setAddr("엘레니아"));
        s1.showInfo();

        Student s2 = new Student();
        s2.setname("전사");
        s2.setAddr("페리온");
        s2.showInfo();

        Student s3 = new Student();
        s3.setname("도적");
        s3.setAddr("커닝시티");
        s3.showInfo();

    }
}
