package weekEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 사용자 수를 입력받고
 */
public class BaseballGame { //클래스 정의


    public Integer[] rand_num = null; // 변수를 선언하고 초기값을 null로 설정
    public int gameCount = 10; //변수를 선언하고 초기값을 10으로 설정

    public ArrayList<CaseInfo> caseList = new ArrayList<>(); //caseList 변수를 선언하고 새로운 어레이 리스트로 설정


    private CaseInfo nowCaseinfo = null; // nowCaseinfo 변수를 선언하고 초기값을 null로 설정

    public BaseballGame() {
        this.gameCount = 10; // gameCount 변수를 10으로 초기화

    }

    public BaseballGame(int count) { // 변수를 count로 받는 생성자 정의
        this.gameCount = count; // gameCount 변수를 10으로 초기화
    }


    public void inputUserNumber(CaseInfo caseinfo) { // 숫자를 입력받는 inputUserNumber 메서드를 정의.
        nowCaseinfo = caseinfo; //nowCaseinfo 변수에 입력 받은 caseinfo 값을 지정

        Scanner sc = new Scanner(System.in);
        int value = 0; // value 변수를 선언하고 초기값을 0으로 설정

        System.out.println(">> 1~9 숫자를 하나씩 입력해 주세요.");

        for (int i = 0; i < 3; i++) {
            value = sc.nextInt(); //입력 받은 값을 value 변수에 저장

            // 중복 처리
            if (Arrays.asList(nowCaseinfo.getUser_input()).indexOf(value) == -1 && value > 0)
            // 입력 받은 값들이 중복되는지 확인하고 입력받은 값이 0보다 큰지 비교
            {
                nowCaseinfo.getUser_input()[i] = value; //nowCaseinfo의 User_input 배열에 입력한 값을 저장
            } else {
                System.out.println("중복된 값이 있거나 잘못된 값입니다. 다시 입력해 주세요");
                i--; //잘못된 입력이 있으므로 반복 횟수를 줄이기 위해 i를 감소
            }
        }

        caseList.add(caseinfo); //입력받은 caseinfo를 caseList에 추가
    }

    public int checkNumber() { /*체크넘버 메소드 정의*/

        int value = 0;

        int strike_num = 0;
        int ball_num = 0;

        int match_index = -1;
        int i = 0;
        for (int user_num : nowCaseinfo.getUser_input()) { //nowCaseinfo의 User_input 배열의 각 요소들에 대해 반복
            match_index = Arrays.asList(rand_num).indexOf(user_num);
            if (match_index != -1) { //일치하는 숫자가 있는지 확인 랜덤숫자 리스트와 내가 입력한 숫자리스트에서 인덱스 번호로
                //비교하는데, 인덱스 번호를 match_index에 저장한 후 -1이 아닐때 즉 일치하는 숫자가 있다
                //라는 의미이다.
//                    System.out.println(" >> " + match_index + "  - " + user_num);
                if (match_index == i) {//현재 비교중인 요소들이 같은지 판단 즉 스트라이크 여부를 판단한다. {
                    strike_num++;
                } else {
                    ball_num++;
                }
            }
            i++;
        }

        nowCaseinfo.setResult(strike_num, ball_num); //setResult 메서드를 호출하여 스트라이크와 볼의 개수 지정
        System.out.println(nowCaseinfo.getResultText());

        return strike_num;
    }
}
