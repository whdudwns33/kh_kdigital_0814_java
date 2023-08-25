package 에어컨만들기;
// 메서드와 인스턴스 생성

// 에어컨의 기능
// 1.전원 on off 기능
// 2.현재온도 표시 기능
// 3.냉방기 기능 Cooler
// 4.난방기 기능 Heater
// 5.바람세기 설정 : 1단:60 2단:30 3단:20


// * 메서드랑 인스턴스 필드의 이름은 같아도 상관없음.
import java.util.Calendar;
import java.util.Scanner;

public class AirCon {
    // 인스턴스 필드
    private boolean isPower;    // 참 거짓 등 2가지 경우로 on off 를 구현
    private int setTemp; // 온도 설정
    private int currTemp; // 현재 온도
    private boolean isCooler; // 냉방기
    private boolean isHeater; // 난방기
    private int windStep;

    // 생성자
    AirCon() {  // 에어컨의 현재 온도를 보여주기 위함. 즉, 에어컨을 키지 않았을 때 평시 온도
        final int[] MONTHTEMP = {-5, 3, 10, 15 ,22, 28, 32, 30, 24, 16, 2}; // 에어컨의 해당 달의 온도
        Calendar now = Calendar.getInstance(); // Calender 클래스는 객체를 만들 수 없음. 따라서 메소드를 불러주는 것
                                               // getInstance는 로컬에 있는 시간을 불러주는 메서드
                                               // Calender 는 운영체제가 설정한 현재 시간을 불러드림.
        int month = now.get(Calendar.MONTH);   // 배열의 인덱스와 동일.
        // 대문자로 접근하면 스태틱 필드.
        currTemp = MONTHTEMP[month];            // 배열의 온도를 가져오는 것. 1월이면 -5

        isPower = false;    // 기본적으로 꺼져있음
        setTemp = 18; // 기본 온도는 18도
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }
    void airConInfo() { // 정보 구현 메서드
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isPower) ? "ON" : "OFF";
        String coolerStr = (isPower) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("=".repeat(10) + "에어컨 정보" + "=".repeat(10));
        System.out.println("전원 :" + onOffStr);
        System.out.println("현재온도 :" + currTemp);
        System.out.println("설정온도 :" + setTemp);
        System.out.println("히터 :" +  heaterStr);
        System.out.println("쿨러 :" + coolerStr);
        System.out.println("바람세기 :" + windStr[windStep]);
    }

    public void setAirConState () {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도 :" + currTemp);
        System.out.print("온도 설정 :");
        setTemp = sc.nextInt(); // 온도설정
        System.out.println("설정온도 :" + setTemp);
        System.out.print("바람세기를 설정하세요. :");
        windStep = sc.nextInt();
        if(currTemp > setTemp) {    // 설정 온도가 현재 온도보다 낮기 때문에(더움) 쿨러도출
            System.out.println("냉방기가 동작합니다.");
            isCooler = true;
            isHeater = false;
        } else if(currTemp < setTemp){
            System.out.println("온풍기가 동작합니다.");
            isHeater = true;
            isCooler = false;
        } else {
            isHeater = false;
            isCooler = false;
        }
    }
    public void setPower(boolean power) {
        isPower = power;
    }
    public int getWindStep() {
        return windStep;
    }
    public boolean isHeater() {
        return isHeater;
    }
    public boolean isCooler() {
        return isCooler;
    }
    public void setCurrTemp (int n) { // 매개변수의 정수값을 받아 현재 온도를 변경해줌
        currTemp += n;
    }
    public int getCurrTemp() {  // 현재온도를 읽는 메서드
        return currTemp;
    }
    public int getSetTemp() { // 설정온도를 읽는 메서드
        return setTemp;
    }
}
