package 배열관리;

public class NameCard {
    private String name;
    private String mail;
    private String phoneNumber;
    private int age;
    public void setName(String name) {  // 이름을 설정하는 메서드
        this.name = name;
    }
    public void setAge(int age) {       // 나이를 설정하는 메서드
        this.age = age;
    }

    public void setMail(String mail) {  // 메일을 설정하는 메서드
        this.mail = mail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printInfo() {           // 결과 도출 메서드
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("연락처 : " + phoneNumber);
        System.out.println("메일 : " + mail);
    }
}
