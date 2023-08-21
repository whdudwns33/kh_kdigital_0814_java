package 커맨드라인;
//메인 메소드는 자바 프로그램의 시작지점임.
// CLI (Command Line Interface) : 입력
public class CommandLineEx {
    public static void main(String[] args) { //main(이자리에 무언가를 넣는다.) args: 매개변수들
        if(args.length != 2) {
            System.out.println("프로그램 사용법");
            System.out.println("Java Main String Argument num1 num2");
            System.exit(0); // 프로그램 강제 종료
        }
        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
