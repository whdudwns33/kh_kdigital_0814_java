package 접근제한자;

import 접근제한자02.Parent;

public class Restrict {
    public static void main(String[] args) {
//        Resteictor resteictor = new Resteictor();
//        resteictor.seoul();         // public에서 접근
////        resteictor.busan();         // protected 메서드에 대한 접근, 같은 패키지 내이거나 상속관계이면 접근 가능
//        resteictor.suwon();         // default 메서드에 대한 접근. 같은 패키지 내에서만 접근 가능
//        resteictor.incheon();     // private에 대한 접근 제한. 왜냐 같은 클래스 내부가 아니기 때문에 접근 허용이 안됨

        Child child = new Child("마법사");
        System.out.println(child.getName());
        System.out.println(child.getMoney());
        System.out.println(child.getAddr());

    }
}

class Child extends Parent {
    String jobs;
    public Child(String jobs) {
        this.jobs = jobs;
    }
    public String getMoney() {  // private라서 접근 제한 상태, 디폴트로 바꿈: 같은 패키지 내에 있어야 접근가능함
            return money;
    }
    public String getName() {
        return name;
    }
    public String getAddr() {   // 상속관계가 있기 때문에 접근 가능
        return addr;
    }
}

