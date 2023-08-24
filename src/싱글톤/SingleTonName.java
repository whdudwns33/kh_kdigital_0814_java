package 싱글톤;
// 객체가 한번만 생성 된다.
// 개념만 가져가면 될 듯.
public class SingleTonName {
    public static void main(String[] args) {
//        SingleTon Test = new SingleTon(); // 객체 생성을 할 수 없음.
//        SingleTon obj1 = SingleTon.getSingleTon(); // new를 사용할 수 없고 원래 있는 걸로
//        SingleTon obj2 = SingleTon.getSingleTon(); // obj1,2 는 같은 값을 갖음
//        System.out.println(obj1.id);
//        System.out.println(obj1.name);
//        obj1.id =  1004;
//        obj1.name = "전사";
//        System.out.println(obj1.id);
//        System.out.println(obj1.name);
//        obj2.id =  1001;
//        obj2.name = "도적";
//
//        System.out.println(obj2.id);
//        System.out.println(obj2.name);

        TestObject1 member1 = new TestObject1();
        TestObject2 member2 = new TestObject2();
        for(int i = 0; i < 1000; i++){
            member1.setInfo("동그라미", 22);
            member2.setInfo("우영우", 22);
        }
        member1.viewInfo();

//        member1.setInfo("동그라미", 22);
//        member2.viewInfo();


    }

}
