package 배열관리;

import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 인원 :");
        int cnt = sc.nextInt();
        NameCard [] nameCard = new NameCard[cnt];     // 네임카드라(문자열, 정수형 등 포함)는 배열타입과 참조변수. 그러니까 배열의 타입의 네임카드의 타입을 따름
        System.out.println("-".repeat(5)+"정보입력"+"-".repeat(5));
        for (int i = 0; i < nameCard.length; i++) {
            nameCard[i] = new NameCard();
            System.out.print("이름 :");
            nameCard[i].setName(sc.next());
            System.out.print("나이 :");
            nameCard[i].setAge(sc.nextInt());
            System.out.print("메일 :");
            nameCard[i].setMail(sc.next());
            System.out.print("연락처 :");
            nameCard[i].setPhone(sc.next());
            System.out.println();
        }
        for (NameCard card : nameCard) {    // card는 객체 타입, nameCard 배열의 수만큼 반복
            card.printInfo();
        }


    }
}
