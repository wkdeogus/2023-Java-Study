package weekEleven;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {


    public static ArrayList<BaseballGame> gameList = new ArrayList<>();

    public static void main(String[] args) {

        int chanceCount = 3;

        System.out.println(">>>>>>> 숫자야구 게임에 오신 것을 환영합니다. >>>>>>>>>>");
        Scanner sc = new Scanner(System.in);
        int value = 1;

        while(true) {
            printMenu();

            value = sc.nextInt();

            if(value == 1){
                System.out.println("\n\n>> 게임을 시작합니다. -------------");
                startGame(chanceCount);
            }else if(value == 2){
                System.out.println(">> 전체 게임 성적 보기 ------------------");
                printAllResult();
            }else if(value == 3){
                System.out.println(">> 게임을 종료합니다. --------------");
                break;

            }else{
                System.out.println("없는 메뉴 입니다");
            }

        }


    }

    public static void printMenu(){
        System.out.println(">>>>>>> 게임 메뉴 >>>>>>>>>>>>>>>>");
        System.out.println("1. 새 게임 시작 ");
        System.out.println("2. 게임 성적 보기 ");
        System.out.println("3. 종료 ");
        System.out.println("메뉴를 선택 하세요. >>>>>>>>>>>>>> ");
        System.out.print("> ");

    }



    public static void printAllResult(){

        if(gameList.isEmpty()){
            System.out.println("저장된 게임 결과가 없습니다.");
            return;
        }

        PrintResult printer = new PrintResult();
        printer.print(gameList); // gameList를 인자로 전달하여 출력
        }
    public static void startGame(int chanceCount){

        BaseballGame myGame = new BaseballGame(chanceCount);

        // 랜덤 수 만들기
        MakeNumber maker = new MakeNumber();
        Integer[] comNumber = maker.makeNumber();
        myGame.rand_num = comNumber;

        // 사용자 숫자 입력
        for(int cnt = 0; cnt < chanceCount ; cnt++) {

            CaseInfo caseinfo = new CaseInfo(cnt+1);
            myGame.inputUserNumber(caseinfo);
            int strike_num = myGame.checkNumber();

            if (strike_num == 3) {
                System.out.println("\n === 게임 클리어");
                myGame.clear = true;
                break;
            } else if (cnt == chanceCount - 1) {
                System.out.println("\n === 게임 클리어 실패");

            }
        }

        PrintResult printer = new PrintResult();
        printer.print(myGame);

        gameList.add(myGame);

    }
}
