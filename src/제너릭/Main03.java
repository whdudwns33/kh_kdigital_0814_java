package 제너릭;

public class Main03 {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());    // 객체타입 주입
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);  // 파우더
        System.out.println(powder);         // 파우더

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);
        System.out.println(plastic);
    }
}

class Powder {  // 파우더 클래스 타입
    public void doPrinting() {
        System.out.println("Powder 재료로 출력 합니다.");
    }
    public String toString() {  // toString은 문자열로 반환. 추가로 이상황에서는 return을 반환하도록 오버라이딩 되어 있음.
        return "재료는 Powder 입니다.";
    }
}

class Plastic {
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력 합니다.");
    }
    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}

class GenericPrinter<T> {
    private T material; // T 자료형으로 선언한 변수

    public void setMaterial(T material) {   // 객체타입을 주입.
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    public String toString() {
        return material.toString();
    }
}
