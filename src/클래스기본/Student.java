package 클래스기본;
// 구현은 main에서 하면 되고 지금은 클래스 설정만
// 이건 설계도
public class Student {
    // 각각 필드라고 부름. 그리고 얘네는 인스턴스 필드라고 함.
    // 인스턴스 필드는 객체가 만들어질 때 같이 만들어짐
    // student basic에 학생을 3명을 만드니까 3번 만들어짐.
    // new라는 객체 생성으로 만들어짐.
    // 이름 3개, 주소도 3개.
    // private : 직접 접근하는 것을 막는다. 캡슐화 예를 들어 학번같은 것을 함부로 바꾸면 안되니까 캡슐화
    // 같은 클래스 내에서만 접근할 수있음. 
    private int Id;      // 학번
    private String name; // 이름
    private int grade;   // 학년
    private String addr; // 주소

    public void showInfo() {
        System.out.println(name + ", " + addr);
    }
    // Setter 메소드
    // 앞선 필드(변수)는 프라이빗으로 변경 불가이지만 set을 설정함으로 써 다른 클래스에서도 
    // 값을 지정할 수 있음
    public void setname(String name) {
        this.name = name;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
}
