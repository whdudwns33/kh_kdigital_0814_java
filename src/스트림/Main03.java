package 스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main03 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("가", 100),
                new Student("나", 90),
                new Student("다", 80),
                new Student("라", 70)
        );
        //stream
        list.stream().forEach(e->{
            String name = e.getName();
            int score = e.getScore();
            System.out.println(name + " : " + score);
        });
        System.out.println();
        // 향상된 for문
        for(Student s : list) {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " : " + score);
        }
        System.out.println();
        // 내부 반복자를 이용한 병렬처리
        list.parallelStream().forEach(s-> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " : " + score);
        });
        System.out.println();
        // 평균
        double average = list.stream()  //스트림 생성
                .mapToInt(e->e.getScore())             //mapToInt는 정수형으로 반환. 메서드 참조, 중간연산.
                .average()                             //중간연산. 평균구하는 메서드. 내부에 있음
                .getAsDouble();                        //결과 출력. 최종 연산. forEach로 계산 불가
        System.out.println(average);

//        IntStream stream = IntStream.range(1,100);
//        int sum;
//        stream.forEach(e -> sum += e);
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
