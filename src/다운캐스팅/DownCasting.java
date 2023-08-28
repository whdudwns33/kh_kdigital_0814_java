package 다운캐스팅;

import java.util.ArrayList;
import java.util.Arrays;

// 다운 캐스팅은 상위클래스 형으로 변환되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것을 다운캐스팅이라고 함
public class DownCasting {
    ArrayList<Animal> aniList = new ArrayList<>();
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();    // 메인클래스 객체화
        downCasting.addAnimal();
        downCasting.testcasting();
    }
    public void addAnimal() {
        aniList.add(new Animal());  // aniList라는 하나의 배열에 객체로 만들어진 Animal을 더해가는 것. 정확히는 Animal이라는 객체의 주소를 추가해가는 것. 나중에 다시 볼문법임
        aniList.add(new Tiger()); // 호랑이의 객체 주소를 어레이리스트에 추가
        aniList.add(new Human());
        aniList.add(new Eagle());

        for (Animal ani : aniList) { // Animal타입의 ani 변수 선언;;;;; 시발;
            ani.move();
        }
    }
    public void testcasting() {
        for (int i = 0; i < aniList.size(); i++) {
            Animal ani = aniList.get(i); // 해당 인덱스의 값(여기서는 객체)를 불러옴. 업캐스팅: 부모 클래스의 메서드만 접근이 가능했지만

            if(ani instanceof Human) {  // 다운캐스팅
                                        // ani: 객체 타입 과 Human : 클래스형  으로 다운캐스팅이 가능한지 확인.
                                        // ani에서 i++ 되면서 human 형과 동일 해짐
                Human h = (Human) ani;
                h.readBook();           // 원래 자기자신의 클래스에 대한 참조 변수이기 때문에 접근 가능 함.
            } else if (ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if (ani instanceof Eagle) {
                Eagle t = (Eagle) ani;
                t.flying();
            } else {
                System.out.println("지원되지 않는 동물입니다.");
            }
        }
    }
}
