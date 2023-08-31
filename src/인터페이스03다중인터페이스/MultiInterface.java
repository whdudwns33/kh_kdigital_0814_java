package 인터페이스03다중인터페이스;
// 자바는 다중 상속을 지원하지 않지만, 인터페이스를 통해서 다중 상속의 효과를 만듦.
public class MultiInterface {
        public static void main(String[] args) {
            SportCar ferrari = new SportCar(false,18,
                    false,250, "Red", "2022");
            ferrari.viewInfo();
            ferrari.setAirConTemp(20);
        }
    }
