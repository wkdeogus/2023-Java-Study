package weekEight;

public class CaseInfo {

    private int caseNo = 0; //진행 회차 변수 코드
    private Integer[] user_input = null; // 사용자가 입력한 숫자 배열을 저장하는 변수
    private String resultText = ""; //결과 문자열을 저장하는 변수입

    private int strike_num = 0;
    private int ball_num = 0;

    public CaseInfo(){
        user_input = new Integer[3]; //길이가 3인 배열로 초기화
    }

    public CaseInfo(int no){ //int 타입 변수를 갖는 생성자
        caseNo = no ; // no변수로 초기화
        user_input = new Integer[3]; // 길이가 3인 배열로 초기화
    }

    public int getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(int caseNo) {
        this.caseNo = caseNo; //전달받은 caseNo 값을 this.caseNo에 저장하는 setCaseNo() 메서드
    }

    public Integer[] getUser_input() {
        return user_input;
    }

    public void setUser_input(Integer[] user_input) {
        this.user_input = user_input; //배열을 변수로 받아서 user_input에 저장하는 setUser_input() 메서드
    }

    public String getResultText() {
        return resultText;
    }

    public void setResult(int strike_num, int ball_num) {

        this.strike_num = strike_num;
        this.ball_num = ball_num;

        String result = "" + caseNo + "회차 판정 -- " + this.strike_num + " 스트라이트 , " + this.ball_num + " 볼 ";
        this.resultText = result;
    }

    public int getStrike_num() {
        return strike_num;
    }

    public void setStrike_num(int strike_num) {
        this.strike_num = strike_num;
    }

    public int getBall_num() {
        return ball_num;
    }

    public void setBall_num(int ball_num) {
        this.ball_num = ball_num;
    }

}
