package 게터와세터;

public class Car {
    String name;
    String manufactor;
    String color;
    String year;
    int speed;



    // 우클릭 제너레이터 컨스트럭터로 생성자 생성.
    public Car(String name) {
        this.name = name;
    }

    public Car(String name, String manufactor) {
        this.name = name;
        this.manufactor = manufactor;
    }

    public Car(String name, String manufactor, String color) {
        this.name = name;
        this.manufactor = manufactor;
        this.color = color;
    }



    // 우클릭 제너레이터 게터 앤드 세터로 게터세터메서드 생성

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
