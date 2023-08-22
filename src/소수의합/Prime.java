package 소수의합;

import java.util.Scanner;

public class Prime {

    private int num;
    private int sum;

    Prime(int i) {

    }

    public void setSum(int num) {
        this.num = num;
        for (int i = 2; i < num; i++) {
            if (num < 3) {
                sum = 2;
            } else if (num < 4) {
                sum = 2 + 3;
                if (num >= 4 && i % 2 != 0 && i % 3 != 0) {
                    sum += i;
                }
            }
            System.out.println(sum + 5);
        }
    }
}
