package 인스턴스필드;

public class Instance {
    public static void main(String[] args) {
        int val = 30; // 지역 변수
        FieldTset fieldTset1 = new FieldTset();
        fieldTset1.insctanceVal = 200;  // 각각의 객체마다 값을 다르게 설정할 수 있음. 참조변수로 접근
        FieldTset fieldTset2 = new FieldTset();
        fieldTset2.insctanceVal = 300;

        FieldTset.classVal = 1000;      // 클래스 자체로 접근
    }
}
