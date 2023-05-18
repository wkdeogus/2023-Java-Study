package shu.exam.jun;

import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rdnum = (int) (Math.random()*10) + 1;

        for (int i = 1; i < 6; i++ ) {
            System.out.println("1~10사이의 수를 입력하세요");

            String num = scanner.nextLine();
            int Nnum = Integer.parseInt(num);
            if (rdnum == Nnum) {
                System.out.println(i + "번 만에 맞췄습니다");
                break;
            } else if (Nnum<rdnum) {
                System.out.println("up");
            } else {
                System.out.println("down");
            }
        }
        System.out.println("정답은 " + rdnum + "입니다");
    }
}
