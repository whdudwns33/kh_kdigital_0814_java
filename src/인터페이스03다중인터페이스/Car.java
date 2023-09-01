package 인터페이스03다중인터페이스;

public abstract class Car {
    protected int speed;    // 상속관계가 성립되면 접근 가능
                            // 같은 패키지와 부모 자식 관계에서 접근 가능
    protected String color;
    protected String year;
    public Car() {          // 생성자
        this.speed = 150;
        this.color = "white";
        this.year = "1999";
    }

    public abstract void setAitConTemp(int temp);
}

