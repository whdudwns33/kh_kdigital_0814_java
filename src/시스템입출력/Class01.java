package 시스템입출력;

//import java.io.PrintStream;

public class Class01 {
        public static void main(String[] args) {
            String name = "사육사";
            String addr = "수원시";
            int age = 22;
            double pi = 3.14;
            String gender = "M";
            int kor = 99, eng = 87, math = 98;
            // 자바 스타일은 오버로딩으로 구현되어 있음

            System.out.println("======= JAVA STYLE ========\n");
            System.out.println("이름 :" + name);
            System.out.println("주소 :" + addr);
            System.out.println("성별 :" + gender);
            System.out.println("나이 :" + age);
            System.out.println("총점1 :" + kor + eng + math);  // 앞선 문자열의 형태에 따라 결정. 이어 붙이기
            System.out.println("총점2 :" + (kor + eng + math));
            // 연산자 우선 순위를 변경해서 먼저 덧셈을 수행
            System.out.println("평균 :" + ((double)(kor + eng + math) /3 ));
            // 연산자 우선 순위가 덧셈보다 나눗셈이 높아서 순서를 변경한 것. (double)()사용 or 더블 뺴고 3.0을 사용해도 됨


            // c 언어 스타일. 서식을 지정하는 스타일
            // 서식 지정자. %d:정수 %ld:long 타입 정수 %u: 보호없는 정수형 %f: 실수형 %c: 문자형
            // 이스케이프 시퀀스 : \n (줄바꿈), \r(캐리지 리턴, 커서를 라인의 처음으로 이동), \t(탭), \b(백스페이스: 앞글자를 지우는 것.), \\(백슬래시가 필요하면 사용)
            System.out.printf("이름 : %s\n", name); // %를 넣으면 그 다음은 서식에 대한 정보가 와야함.
            //이경우 s는 문자열 (string)
            System.out.printf("오늘의 습도는 %.2f%% 입니다.\n", 85.5555); // %뒤에 %를 더 찍는 것이 진정으로 퍼센트를 표현하는 것. why?
            // %다음은 서식을 지정하는 것. .2는 소숫점 이하의 2자리까지 표현하는 것.
            // 실수형 출력 소숫점 두자리까지 출력
            System.out.printf("성별 : %s\n", gender);
            System.out.println("안녕하세요. \\'여행자', \"모험가\"여");
            // 이스케이프 예시. 백슬래시 뒤로 큰따옴표를 적용하면 큰따옴표 안에 큰따옴표 적용 가능. 따옴표자체는 가능
            System.out.printf("평균 : %.2f\n", (kor + eng + math) /3.0);

            System.out.println("Apple\rBanana\tOrange\b\b\n");
            System.out.printf("| %-6d | %-6d | %6d |\n", 100,2000,30000); // -는 왼쪽으로 정렬

            


        }
    }

