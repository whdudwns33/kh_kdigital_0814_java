package 자바마지막프로젝트;

import java.io.Serializable;

public class MenuInfo implements Serializable {
    String name; // 메뉴명
    int price; // 가격
    String category; // 분류
    String description; // 설명

    public MenuInfo(String name, int price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }
    // 다른 패키지에 사용하기 위해서 게터와 세터 설정.



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
