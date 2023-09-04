package 예외처리06;
// 사용자 정의 예외처리 클래스 만들기
// 기본적으로 자바는 수많은 예외 클래스가 존재. 하지만 사용하려는 목적에 맞는 예외처리가 없는 경우 직접 만들 수 있음.
public class Main {
    public static void main(String[] args) {
        CheckEven ce = new CheckEven();
        int num1 = 100;
        int num2 = 99;
//        System.out.println(ce.printEven(num1));
        try {
            System.out.println(ce.printEven(num1));
            System.out.println(ce.printEven(num2));
        } catch (EvenException e) {
            e.printStackTrace();
        }

    }
}


class EvenException extends Exception {
    private Integer number = null;

    public EvenException(int number) {
        this.number = number;
    }

    @Override
    public String getMessage() {
        if (number == null) return "숫자가 없습니다.";
        else return Integer.toString(number) + "는 짝수가 아닙니다.";
    }
}

class CheckEven {
    private int num;
    public void setNum (int num) {
        this.num = num;
    }

    public int printEven(int number) throws EvenException {
        this.num = number;
        if(num % 2 != 0) throw new EvenException(num);
        else return num;
    }
}
