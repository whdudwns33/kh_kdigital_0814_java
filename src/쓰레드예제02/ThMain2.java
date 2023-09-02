package 쓰레드예제02;

import java.awt.*;
import static java.lang.Thread.sleep;

// 다른 쓰레드의 종료를 기다림 Join()

public class ThMain2 {
    public static void main(String[] args)
//            throws InterruptedException
    {
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        for(int i = 0; i < 10; i++) {
//            toolkit.beep();     // 띠링 소리나는 것
//            try {
//                sleep(3000);
//            }   catch(InterruptedException ignored) {
//            }
//        }
        SumThread sumThread = new SumThread();
        sumThread.start();        // start는 run이 실행되기 전까지 약간의 텀이 있음. 그렇기 때문에
//        sleep(1);           //  sleep을 주어서 run할 시간을 주고
        try {
            sumThread.join();       // sumThread가 작업을 완료할 때 까지 기다림.
                                    // sleep & join은 메인 스레드가 일시정지하도록 만듦.
                                    // join에 시간 값(매개변수)을 주면 그만큼만 기다리게 되어 sleep과 거의 동일하지만, 주지 않으면 무한히 기다림.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("합 :" + sumThread.getSum());     // 그 결과를 메인 스레드에 구현함.
                                    // run을 주지 않으면 다른 수가 나옴.
    }
}


class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run () {
        for (int i = 0; i <= 10000; i++) {
            sum += i;
        }
    }
}