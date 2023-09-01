package 디폴트메서드02;

public interface Buy {
        void buy(); // public abstract가 자동으로 추가됨.
        default void order() {  // 디폴트 메서드. 예외적으로 구형부를 갖음. 인터페이스의 상속은 광범위하게 일어나는 데,
                                // 수정과 추가를 할 때 일반상속(디폴트 메서드)로 용이함.
            System.out.println("구매 주문");
        }
    }

interface Sell {
    void sell();
    default void order() {
        System.out.println("판매 주문");
    }
}


class Customer implements Buy, Sell {

    @Override
    public void buy() {
        System.out.println("판매하기");
    }

    @Override
    public void order() {
        System.out.println("고객 판매 주문");
        Sell.super.order();
        Buy.super.order();
    }

    @Override
    public void sell() {
        System.out.println("구매하기");
    }
}