package 쓰레드예제01;
// 하나의 프로그램 내에서 여러가지 일을 동시에 수행하는 것.
public class Thread01 {
    public static void main(String[] args) {
        // 스레드 클래스를 상속받아서 스레드 생성
        Thread test = new CustomThread();
        test.start();                       //start는 운영체제에게 run을 실행하라고 명령하는 것.
        System.out.println("Main에서 작업합니다.");            // 메인의 경우 다른 스레드들이 실행 될 때 그냥 끝남.
                                                            // 출력만 하고 메인 끝나지만 스레드들은 끝날 때 까지 실행

        // Runnable 인터페이스를 상속받아서 스레드를 만드는 방법
        Runnable runTask = new InterThread();      //실제 작업 내용을 가지고 있지만, 실제 쓰래드(인터페이스 상속을 받음)는 아님
        Thread runTh1 = new Thread(runTask);       //스레드를 만듦.
        Thread runTh2 = new Thread(runTask);
        runTh1.start();
        runTh2.start();

        // 익명 객체로 쓰레드를 만드는 방법
        Runnable task = new Runnable() {    // 익명의 객체, Runnable 인터페아스는 구현부가 필수임.
            @Override
            public void run() {     //구현부
                int sum = 0;
                for(int i = 0; i <= 10; i++) {
                    sum += i;
                    System.out.println("익명의 객체 " + sum);
                }
                System.out.println(Thread.currentThread() + "합 :" + sum);
            }
        };  // 여기까지가 구현부
        Thread anonyTh1 = new Thread(task);
        anonyTh1.start();


        // 익명객체2 : 람다식으로 만들기
        // 익명의 객체, Runnable 인터페아스는 구현부가 필수임.
        Runnable task2 = () -> {     //구현부
            int sum = 0;
            for(int i = 0; i <= 10; i++) {
                sum += i;
                System.out.println("익명의 객체 " + sum);
            }
            System.out.println(Thread.currentThread() + "합 :" + sum);
        };  // 여기까지가 구현부
    }
}

// 상속받아서 쓰레드를 만드는 방법
class CustomThread extends Thread {
    @Override
    public void run() { //
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("상속받은 " + sum);
        }
        System.out.println(Thread.currentThread() + "합 :" + sum);
    }
}


class InterThread implements Runnable {  // Runnale?

    @Override
    public void run() {                 // 실제 작업 내용
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("인터페이스의 " + sum);
        }
        System.out.println(Thread.currentThread() + "합 :" + sum);
    }
}