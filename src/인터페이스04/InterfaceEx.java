package 인터페이스04;

public class InterfaceEx {
    public static void main(String[] args) {

            Customer customer = new Customer(); // 객체 생성.
            Buy buyer = customer; // Customer Type의 customer 참조 변수를 Buy 인터페이스형에 대입하여 형 변환
            buyer.buy();          //  Buyer는 Buy 인터페이스의 메서드만 호출 가능

            Sell seller = customer;
            seller.sell();

            Customer customer2 = (Customer) seller; // 다시 역으로 형 변환. 다운캐스팅. 부모형으로 바꾸었던 형태를 자기 자신으로 다시 변형
            customer2.buy();
            customer2.sell();

    }
}
