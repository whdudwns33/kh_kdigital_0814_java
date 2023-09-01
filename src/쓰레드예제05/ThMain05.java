package 쓰레드예제05;
import static java.lang.Thread.sleep;
// 데몬 쓰레드 : 다른 쓰레드의 작업을 돕는 보조 쓰레드, 데몬 쓰레드 이외의 쓰레드가 모두 종료 되면 자동 종료

public class ThMain05 {
    public static void main(String[] args) throws InterruptedException {
        AutoSave autoSaveTh = new AutoSave();
        autoSaveTh.setDaemon(true);
        autoSaveTh.start();
        sleep(30000);
    }
}


class AutoSave extends Thread {
    public void save () {
        System.out.println("작업 내용을 저장함.");
    }
    @Override
    public void run() {
        while (true) {
            try {
                sleep(3000);
            } catch (InterruptedException e) {}
            save();
        }
    }
}
