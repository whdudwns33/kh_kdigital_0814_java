package 회원정보예제;
// 이름(문자열), 나이(정수형 나이는 1에서 199까지 수를 정상 입력으로 인정, 이외의 값은 재입력), 
// 성별(문자 'M','F'으로 입력받고 출력은 "남성","여성"),
// 직업(문자열 1.학생 2.회사원 3.주부 4.무직 1~4가 아니면 재입력 요구)
// 결과는 한번에 출력


import java.util.Scanner;

public class Membeinfo {// 인스턴스는 객체라는 뜻, 클래스가 객체화되면 인스턴스가 됨
    String name;        // 인스턴스 필드
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);

    public void setName() {
        System.out.print("이름을 입력하시오 :");
        name = sc.nextLine();
    }

    public void setAge() {
        while (true) {
            System.out.print("나이를 입력하세요 :");
            age = sc.nextInt();
            if (age > 0 && age < 200) return;
            // break; 를 써도 상관 없음. 여기서는 브레이크는 와일문을 탈출하는 조건이고 아래의 수행을 모두 함
            // return은 입력했던 선택으로 다시 돌아감. 아래에 있는 수행문을 수행하지 않음
            System.out.println("나이를 잘못 입력하셨습니다.");
        }
    }

    public void setGender() {
            while (true) {
                System.out.print("성별을 입력하세요 :");
                gender = sc.next().charAt(0);
                switch (gender) {
                    case 'M':
                    case 'm':
                    case 'F':
                    case 'f':
                        return;
//                        break;        // mf를 입력하면 디폴트를 넘어감
                    default:
                        System.out.print("성별을 잘못 입력하셨습니다.");
//                        continue;     // switch안에서 사용되었더라도 while문의 조건임.
                }
            }
    }

    public void setJobs() {
        while (true) {
            System.out.print("직업을 입력하십시오 :");
            jobs = sc.nextInt();
            if (jobs > 0 && jobs < 5) break;
            System.out.print("직업을 잘못 입력했습니다.");
        }
    }
    public int getGenderType() {
        if (gender == 'M' || gender == 'm') return 1;
        else return 2;
    }
    public void getInfo() {
        String[] genderStr = {"", "남성", "여성"};
        String[] jobsStr = {"", "학생", "회사원", "주부", "무직"}; //jobs -1을 하면 "학생", "회사원", "주부", "무직"
        System.out.println("=".repeat(5) + "회원정보" + "=".repeat(5));
        System.out.println("이름 :" + name);
        System.out.println("나이 :" + age);
        System.out.println("성별 :" + genderStr[getGenderType()]);
        System.out.println("직업 :" + jobsStr[jobs]); // jobs -1
    }
}
