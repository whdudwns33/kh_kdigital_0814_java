package 저항예제;

import 추상클래스02.Phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color1 = sc.next();
        String color2 = sc.next();
        String color3 = sc.next();

        String num = "";
        String num1 = "";
        String num2 = "";

        switch (color1) {
            case "black":
                num = "0";break;
            case "brown":
                num = "1";break;
            case "red":
                num = "2";break;
            case "orange":
                num = "3";break;
            case "yellow":
                num = "4";break;
            case "green":
                num = "5";break;
            case "blue":
                num = "6";break;
            case "violet":
                num = "7";break;
            case "grey":
                num = "8";break;
            case "white":
                num = "9";break;
        }

        switch (color2) {
            case "black":
                num1 = "0";break;
            case "brown":
                num1 = "1";break;
            case "red":
                num1 = "2";break;
            case "orange":
                num1 = "3";break;
            case "yellow":
                num1 = "4";break;
            case "green":
                num1 = "5";break;
            case "blue":
                num1 = "6";break;
            case "violet":
                num1 = "7";break;
            case "grey":
                num1 = "8";break;
            case "white":
                num1 = "9";break;
        }

        switch (color3) {
            case "black":
                num2 = "0";break;
            case "brown":
                num2 = "00";break;
            case "red":
                num2 = ",000";break;
            case "orange":
                num2 = "0,000";break;
            case "yellow":
                num2 = "00,000";break;
            case "green":
                num2 = "000,000";break;
            case "blue":
                num2 = "0,000,000";break;
            case "violet":
                num2 = "00,000,000";break;
            case "grey":
                num2 = "00,000,000,000"; break;
            case "white":
                num2 = "000,000,000,000";break;
        }
        System.out.println(num + num1 + num2);
    }
}
