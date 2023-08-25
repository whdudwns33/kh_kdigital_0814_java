package 저항예제;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"black", "brown", "red", "orange", "yellow", "green", "blue", "blue", "violet", "grey", "white"};
        String[] arr = new String[3];

        System.out.print("첫번째");
        arr[0] = sc.next();
        System.out.print("두번째");
        arr[1] = sc.next();
        System.out.print("세번째");
        arr[2] = sc.next();

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (arr[0].equalsIgnoreCase(str[i])) {
                num1 = i;
//                System.out.println(num1);
            } else if (arr[1].equalsIgnoreCase(str[i])) {
                num2 = i;
//                System.out.println(num2);
            } else if (arr[2].equalsIgnoreCase(str[i])) {
                num3 = i;
//                System.out.print(num3);
            }
        }
        System.out.println((long)((num1*10) + num2)*(Math.pow(10,num3)));
        }
    }


