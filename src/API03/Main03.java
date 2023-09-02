package API03;
//Calendar의 정적메소드인 getInstance() 메소드를 이용하면
//현재 운영체제에 설정되어 있는시간을 기준으로 Calendar 하위 개체를 얻을 수 있습니다.

//Calendar 클래스는 추상 클래스이므로 new 연산자를 사용해 인스턴스를 생성 할 수  없습니다.
//그 이유는 날짜와 시간을 사용하는 방법이 각 나라마다 다르기 때문 입니다.
import java.util.Calendar;


public class Main03 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int mon = now.get(Calendar.MONTH)+1;        // 0~11까지의 정수로 설정되어 있어서 1을 더해야 원하는 월이 나옴
        int day = now.get(Calendar.DAY_OF_MONTH);
        int isPM = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);
        if(isPM == 1) hour += 12;
        System.out.printf("%d년%02d월%02d일 %02d시%02d분%02d초\n", year, mon, day, hour, min, sec);
    }
}
