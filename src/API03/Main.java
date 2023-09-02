package API03;
// 열거 타입
//`열거타입 변수 = 열거타입.열거상수;`
//`Week today = Week.SUNDAY;`
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Week today = null;
        Calendar cal = Calendar.getInstance();          // 로컬 타임을 읽어오는 듯. 오늘 날짜를 읽는 듯
        int week = cal.get(Calendar.DAY_OF_WEEK);
        switch(week) {
            case 1 :
                today = Week.SUNDAY; break; // 열거 상수 대입
            case 2 :
                today = Week.MONDAY; break;
            case 3 :
                today = Week.TUESDAY; break;
            case 4 :
                today = Week.WEDNESDAY; break;
            case 5 :
                today = Week.THURSDAY; break;
            case 6 :
                today = Week.FRIDAY; break;
            case 7 :
                today = Week.SATURDAY; break;
        }
        System.out.println("오늘 요일 : " + today);
    }
}



