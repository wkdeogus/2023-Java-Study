package weekFour;

import java.util.Scanner;

public class newBaseballGame {
    public int[] randomNumber;
    public int[] userNumber;
    public int strikeCount;
    public int ballCount;
    public int gameCount;

    public static void main(String[] args) {
        int gameCount = 3;
        newBaseballGame myGame = new newBaseballGame(gameCount);

        myGame.genNumber();
        myGame.inputUserNumber();
        myGame.checkNumber();
        myGame.printResult();
    }

    public newBaseballGame(int gameCount) {
        this.gameCount = gameCount;
        this.randomNumber = new int[gameCount];
        this.userNumber = new int[gameCount];
    }

    public void genNumber() {
        for (int i = 0; i < gameCount; i++) {
            randomNumber[i] = (int) (Math.random() * 10);
        }
    }

    public void inputUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        for (int i = 0; i < gameCount; i++) {
            userNumber[i] = scanner.nextInt();
        }
    }

    public void checkNumber() {
        strikeCount = 0;
        ballCount = 0;
        for (int i = 0; i < gameCount; i++) {
            if (randomNumber[i] == userNumber[i]) {
                strikeCount++;
            } else {
                for (int j = 0; j < gameCount; j++) {
                    if (randomNumber[i] == userNumber[j]) {
                        ballCount++;
                        break;
                    }
                }
            }
        }
    }

    public void printResult() {
        System.out.println("스트라이크: " + strikeCount);
        System.out.println("볼: " + ballCount);
        System.out.println("아웃: " + (gameCount - strikeCount - ballCount));
    }

}