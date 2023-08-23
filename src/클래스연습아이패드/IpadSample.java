package 클래스연습아이패드;

public class IpadSample {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            IpadPro ipadPro = new IpadPro("iPadPro");       // 생성자 생성
            if (!ipadPro.continueOder()) break;
            ipadPro.setScreen();
            ipadPro.setColor();
            ipadPro.setNetwork();
            ipadPro.setMemory();
            ipadPro.setName();
            ipadPro.setSerialNum();
            ipadPro.progressPad();  // sleep이 있기에 throws InterruptedException 필요
            ipadPro.produtPad();
        }
    }
}
