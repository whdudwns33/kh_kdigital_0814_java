package 입출력스트림;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 직렬화 : 객체를 출력하기 위해서는 연속적인 바이트로 변경
public class Main06 {
    public static void main(String[] args) {
        writeList();    // 객체를 쓰는 리스트.
        List<Board> list = readList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Board board : list) {
            System.out.printf("%d %s %s %s %s \n", board.getBn(),board.getTitle(),
                                                board.getContent(), board.getWriter(),
                                                sdf.format(board.getDate()));
        }
    }

    public static void writeList() {    // 메서드 생성. 쓰는 부분
        List<Board> list = new ArrayList<>();
        list.add(new Board(1, "전사", "페리온", "히어로", new Date()));
        list.add(new Board(2, "전사", "페리온", "팔라딘", new Date()));
        list.add(new Board(3, "전사", "페리온", "다크나이트", new Date()));

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("board.db");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();
            oos.close();
        } catch(IOException e ) {}
    }


    public static List<Board> readList () { // 읽는 메서드, 프론트엔드에서 많이 쓰임
        try {
            FileInputStream fis = new FileInputStream("board.db");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Board> list = (List<Board>) ois.readObject();
            return list;

        } catch (IOException e) {
        } catch (ClassNotFoundException e) {}
        return null;
    }
}


class Board implements Serializable {
    private int bn;
    private String title;
    private String content;
    private String writer;
    private Date date;

    public Board(int bn, String title, String content, String writer, Date date) {
        this.bn = bn;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    public int getBn() {
        return bn;
    }

    public void setBn(int bn) {
        this.bn = bn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
