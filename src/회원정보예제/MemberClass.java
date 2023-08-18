package 회원정보예제;

public class MemberClass {
    public static void main(String[] args) {
        Membeinfo membeinfo = new Membeinfo(); // 클래스에 대한 참조변수, 인스턴스화 되어 메모리에 저장
        membeinfo.setName();
        membeinfo.setAge();
        membeinfo.setGender();
        membeinfo.setJobs();

        membeinfo.getInfo();

    }
}
