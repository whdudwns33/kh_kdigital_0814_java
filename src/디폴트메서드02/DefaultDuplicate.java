package 디폴트메서드02;

public class DefaultDuplicate {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();
        buyer.order(); // 재정의된 메소드 호출

        Sell seller = customer;
        seller.sell();
        seller.order(); // 재정의된 메소드 호출

        Customer customer1 = (Customer) seller;
        customer1.buy();
        customer1.sell();
        customer1.order();

    }
}
