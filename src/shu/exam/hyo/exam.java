package shu.exam.hyo;

import java.util.Scanner;

public class exam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("생일을 입력하세요 → 1월 23일 : 0123 입력");

        String birthday = scanner.nextLine();
        String mon = birthday.substring(0, 2);
        int month = Integer.parseInt(mon);

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("겨울에 태어났군요 ~");
        } else if (month >= 3 && month <= 5) {
            System.out.println("봄에 태어났군요 ~");
        } else if (month >= 6 && month <= 8) {
            System.out.println("여름에 태어났군요 ! ~");
        } else if (month >= 9 && month <= 11) {
            System.out.println("가을에 태어났군요 ! ~");
        } else {
            System.out.println("생일을 제대로 입력하셨나요 ??");
        }
    }
}