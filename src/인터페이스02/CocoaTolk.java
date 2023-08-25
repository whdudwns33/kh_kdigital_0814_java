package 인터페이스02;

public class CocoaTolk {
    private String to;
    private String msg;
    public CocoaTolk(String name) {
        to = name;
    }
    public void writeMessage(String msg) {
        this.msg = to + " : " + msg;
    }
    public void send (NetWorkAdaptor na) {
        na.send(msg);
    }
}
