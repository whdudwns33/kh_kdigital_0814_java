package 제너릭;

public class Main02 {
    public static void main(String[]args) {
        Product<String, Integer> pr1 = new Product<>();
        pr1.setName("스마트 TV");
        pr1.setYear(2022);
        System.out.println(pr1.getName());
        System.out.println(pr1.getYear());

        Product<Integer, String> pr2 = new Product<>();
        pr2.setName(12345);
        pr2.setYear("2022");
        System.out.println(pr2.getName());
        System.out.println(pr2.getYear());
    }
}


class Product<T, M> {   // 복수의 매개 타입
    private T name;
    private M year;

    public T getName() {    // 매서드
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getYear() {
        return year;
    }

    public void setYear(M year) {
        this.year = year;
    }
}