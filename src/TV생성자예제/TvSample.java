package TV생성자예제;

public class TvSample {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.getInfoTv();


        Tv tv2 = new Tv(false, 20, 30);
        tv2.getInfoTv();


        tv2.setON(true);
        tv2.setChannel(22);
        tv2.setVolume(20);
        tv2.getInfoTv();
    }
}
