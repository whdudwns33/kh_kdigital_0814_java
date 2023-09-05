package 자바마지막프로젝트;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        // 문자 읽어 오기
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/자바마지막프로젝트/test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("읽을 파일을 찾지 못하였습니다.");
        }

        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String [] arr = line.split(" ");
//            System.out.println(arr);
            Integer total = Integer.valueOf(arr[1]) + Integer.valueOf(arr[2]) + Integer.valueOf(arr[3]);
//            System.out.println(total);
            studentList.add(new Student(arr[0],total));
        }
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getTotal() < o2.getTotal() ) return 1;
                else if (o1.getTotal() == o2.getTotal()) {
                    return o1.getName().compareTo(o2.getName());
                }
                else return -1;
            }
        });
        for (Student e : studentList) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }
}

class Student {
    protected String name;
    protected int total;

    Student (String name, int total) {
        this.name = name;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }
}
