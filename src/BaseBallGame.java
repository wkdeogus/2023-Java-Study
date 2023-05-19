//숫자 야구 게임
import java.util.Scanner;

public class BaseBallGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rdnum1 = (int) (Math.random() * 9);
        int rdnum2 = (int) (Math.random() * 9);
        int rdnum3 = (int) (Math.random() * 9);

        System.out.println("첫번째 숫자 입력");
        int num1 = scanner.nextInt();
        System.out.println("두번째 숫자 입력");
        int num2 = scanner.nextInt();
        System.out.println("세번째 숫자 입력");
        int num3 = scanner.nextInt();

        int str = 0;
        int ball = 0;

        if (rdnum1 == num1) {
            str ++ ;
        } else if (rdnum1 == num2) {
            ball ++;
        } else if (rdnum1 == num3) {
            ball ++;
        }

        if (rdnum2 == num2) {
            str++ ;
        } else if (rdnum2 == num1) {
            ball ++;
        } else if (rdnum2 == num3) {
            ball ++;
        }

        if (rdnum3 == num3) {
            str++ ;
        } else if (rdnum3 == num1) {
            ball ++;
        } else if (rdnum3 == num2) {
            ball ++;
        }


        System.out.println("스트라이크는 " + str + "개 입니다.");
        System.out.println("볼은 " + ball + "개 입니다.");
    }
}
