package 가장위연습;

import java.util.Scanner;

public class SeasonAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하시오 :");
        String name = sc.nextLine();
        System.out.print("제목을 입력하시오 :");
        String title = sc.nextLine();
        System.out.print("날짜를 입력하시오 :");
        String date = sc.nextLine();
        System.out.print("시간을 입력하시오 :");
        String time = sc.nextLine();
        String month = date.substring(4,6);
        String greeting = "";               // 초기화 필요. 여기가 제일 중요한 듯.
        switch (month) {
            case "12" :
            case "01" :
            case "02" :
                greeting = "한파의 연속인 계절입니다.";
                break;
            case "03" :
            case "04" :
                greeting = "따스한 계절입니다.";
                break;
            case "05" :
                greeting = "계절의 여왕 5월 입니다.";
            case "06" :
            case "07" :
            case "08" :
                greeting = "뜨거운 여름입니다.";
                break;
            case "09" :
            case "10" :
            case "11" :
                greeting = "풍요로운 계절입니다.";
                break;
            default: System.out.print("알 수 없습니다.");
        }

        System.out.println(name + "님\n" +  greeting);
        System.out.println("아래 일정으로" + title + "을(를) 진행할 예정이오니 참석부탁드립니다.\n");
        System.out.println("=".repeat(4) + "행사안내" +"=".repeat(4));
        System.out.println("행사안내 :" + title);
        System.out.println("날짜 :" + date.substring(0, 4) + "년" + month + "월" + date.substring(6,8) + "일");
        System.out.println(time + "시");
    }
}
