package 쓰레드예제04;

import static java.lang.Thread.sleep;

// ㅅ스레드를 종료하는 방법.
// stop이라는 메서드가 있었으나 사용 중지가 됨.
public class ThMain04 {
    public static void main(String[] args) /*throws InterruptedException*/ {
        RunThread runThread = new RunThread();
        runThread.start();
//        sleep(1000);
//        runThread.setStop(true);

        try {
            sleep(3000);
        } catch (InterruptedException e) {}
        runThread.interrupt();
    }
}



class RunThread extends Thread {
//    private boolean stop ; // stop 클래스 설정
//    public void setStop(boolean stop) {
//        this.stop = stop;
//    }
//    @Override
//    public void run () {
//        while(!stop) {
//            System.out.println("Thread를 실행중...");
//        }
//        System.out.println("자원 정리...");
//        System.out.println("실행 종료...");
//
//    private boolean stop; // stop 클래스 설정
//    public void setStop(boolean stop) {
//        this.stop = stop;
//    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Thread를 실행중...");
                sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("인터럽트 발생");
        }
        System.out.println("자원 정리...");
        System.out.println("실행 종료...");
    }
}

