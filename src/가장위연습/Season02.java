package 가장위연습;

import java.util.Scanner;

public class Season02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하시오 :");
        String name = sc.next();
        System.out.print("제목을 입력하시오 :");
        String title = sc.next();
        String date = "20230817";
        String month = date.substring(4,6);

        System.out.println(name + "님\n" +  month +"월은");
        switch (month) {
            case "12" :
            case "01" :
            case "02" :
                System.out.println("겨울입니다.");
                break;
            case "03" :
            case "04" :
                System.out.println("봄입니다.");
                break;
            case "05" :
                System.out.println("계절의 여왕 5월 입니다.");
            case "06" :
            case "07" :
            case "08" :
                System.out.println("여름입니다.");
                break;
            case "09" :
            case "10" :
            case "11" :
                System.out.println("가을입니다.");
                break;
        }
        System.out.println("아래 일정으로" + title + "을(를) 진행할 예정이오니 참석부탁드립니다.");
        System.out.println("==== 행사 안내 ====");
        System.out.println("행사안내 :" + title);
        System.out.println(date);


    }
}
