package 자바마지막프로젝트답;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Student> treeSet = new TreeSet<>();
        FileInputStream fis = new FileInputStream("src/자바마지막프로젝트답/score.txt");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String [] str = sc.nextLine().split(" ");
            treeSet.add(new Student(str[0], Integer.parseInt(str[1])
                    + Integer.parseInt(str[2])
                    + Integer.parseInt(str[3])));
        }
        for (Student s : treeSet) {
            System.out.println(s.getName() + s.getTotal());
        }
    }

}
