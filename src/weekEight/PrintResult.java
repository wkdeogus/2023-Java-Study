package weekEight;

import java.util.ArrayList;

/**
 * 게임의 결과를 출력하는 클래스
 */
public class PrintResult {

    public void print(ArrayList<CaseInfo> caseList) { //프린트 매서드는 ArrayList<CaseInfo>타입의 케이스 리스트를 받는다.

        System.out.println("\n\n입력한 모든 값 ------------------------------ ");


        for (CaseInfo obj : caseList) {
            Integer[] user_input = obj.getUser_input();
            //obj.getUser_input() 메서드를 호출하여 CaseInfo 객체에 저장된 사용자의 입력을 user_input에 저장.
            System.out.println("" + obj.getCaseNo() + "회차 입력 값 : " +  user_input[0] + " , " + user_input[1] + " , " + user_input[2]);
        }
        System.out.println("\n전체 결과 보기 ------------------------------ ");

        for (CaseInfo obj : caseList) { //caseList에 있는 각각의 CaseInfo 객체 obj에 대해 반복
            System.out.println(obj.getResultText()); //메서드를 호출하여 CaseInfo 객체에 저장된 게임 결과를 문자열 형태로 출력
        }
        System.out.println("---------------------------------------- ");

    }
}
