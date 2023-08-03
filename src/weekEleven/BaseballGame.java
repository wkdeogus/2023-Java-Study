package weekEleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 사용자 수를 입력받고
 */
public class BaseballGame extends ArrayList<BaseballGame> {


    // 컴퓨터 숫자
    public Integer[] rand_num = null;

    // 숫자 맞추기 찬스 회수
    public int chanceCount = 10;

    // 게임 클리어 여부
    public boolean clear = false;

    // 사용자가 입력한 값과 결과
    public ArrayList<CaseInfo> caseList = new ArrayList<>();


    private CaseInfo nowCaseinfo = null;

    public BaseballGame() {
        this.chanceCount = 10;

    }

    public BaseballGame(int count) {
        this.chanceCount = count;
    }


    public void inputUserNumber(CaseInfo caseinfo) {
        nowCaseinfo = caseinfo;

        Scanner sc = new Scanner(System.in);
        int value = 0;

        System.out.println(">> 1~9 숫자를 하나씩 입력해 주세요.");

        for (int i = 0; i < 3; i++) {
            value = sc.nextInt();

            // 중복 처리
            if (Arrays.asList(nowCaseinfo.getUser_input()).indexOf(value) == -1 && value > 0) {
                nowCaseinfo.getUser_input()[i] = value;
            } else {
                System.out.println("중복된 값이 있거나 잘못된 값입니다. 다시 입력해 주세요");
                i--;
            }
        }

        caseList.add(caseinfo);
    }

    public int checkNumber() {

        int value = 0;

        int strike_num = 0;
        int ball_num = 0;

        int match_index = -1;
        int i = 0;
        for (int user_num : nowCaseinfo.getUser_input()) {
            match_index = Arrays.asList(rand_num).indexOf(user_num);
            if (match_index != -1) {
//                    System.out.println(" >> " + match_index + "  - " + user_num);
                if (match_index == i) {
                    strike_num++;
                } else {
                    ball_num++;
                }
            }
            i++;
        }

        nowCaseinfo.setResult(strike_num, ball_num);
        System.out.println(nowCaseinfo.getResultText());

        return strike_num;
    }


}
