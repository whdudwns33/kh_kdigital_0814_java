package 가장위연습;

import java.util.Scanner;

public class Season01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하시오 :");
        String name = sc.next();
        System.out.print("제목을 입력하시오 :");
        String title = sc.next();
        System.out.print("년도를 입력하시오 :");
        int year = sc.nextInt();
        System.out.print("월을 입력하시오 :");
        int month = sc.nextInt();
        System.out.print("일을 입력하시오 :");
        int day = sc.nextInt();

        System.out.println(name + "님\n" +  month +"월"+ day + "일은");
        switch (month) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("겨울입니다.");
                break;
            case 3 :
            case 4 :
                System.out.println("봄입니다.");
                break;
            case 5 :
                System.out.println("계절의 여왕 5월 입니다.");
            case 6 :
            case 7 :
            case 8 :
                System.out.println("여름입니다.");
                break;
            case 9  :
            case 10 :
            case 11 :
                System.out.println("가을입니다.");
                break;
        }
        System.out.println("아래 일정으로" + title + "을(를) 진행할 예정이오니 참석부탁드립니다.");
        System.out.println("==== 행사 안내 ====");
        System.out.println("행사안내 :" + title);
        System.out.println("일시 :" + year + "년" + month + "월" + day + "일");





    }
}
