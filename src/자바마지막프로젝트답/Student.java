package 자바마지막프로젝트답;

import java.util.Comparator;

public class Student implements Comparable<Student> {
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


    @Override
    public int compareTo(Student o) {
        if (this.getTotal() == o.getTotal()) return this.name.compareTo(o.name);
        return o.getTotal() - this.getTotal(); // 내림차순 정렬
    }
}
