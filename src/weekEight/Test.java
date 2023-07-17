package weekEight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Map<String, List<Integer>> scoresMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Count: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { //n에 저장된 학생 인원수만큼 반복문 재생 저장된 이름은 name 변수에 저장
            System.out.println("학생 이름 : ");
            String name = sc.next();

            List<Integer> scores = new ArrayList<>(); //scores 라는 새로운 리스트 생성후 입력 받은 학생 점수 저장

            for (int j = 1; j <= 3; j++) {
                System.out.println(name + "의 " + j + "번 째 점수 입력");
                int score = sc.nextInt();
                scores.add(score); //저장된 점수가 score 변수에 있고 이 변수를 scores 리스트에 추가
            }

            scoresMap.put(name, scores); //학생 이름을 키로 성적 리스트는 값으로 지정
        }

        for (String name : scoresMap.keySet()) { //키에 저장된 학생 이름을 name 변수에 대입하며 반복문 실행
            System.out.println("name: " + name);
            List<Integer> scores = scoresMap.get(name); //키에 맞는 즉 이름과 일치하는 해당 학생의 성적 리스트를 가져와 scores 변수에 저장
            System.out.println("score1: " + scores.get(0)); // 저장된 리스트에 각각 점수를 출력
            System.out.println("score2: " + scores.get(1));
            System.out.println("score3: " + scores.get(2));
            int totalScore = scores.stream().mapToInt(Integer::intValue).sum(); //리스트 모든 성적을 합하여 tatalScore 변수에 저장
            System.out.println("total: " + totalScore);
            float average = totalScore / 3.0f; //총 점수를 3.0으로 나눈 값을 average 변수에 저장
            System.out.println("average: " + average);
        }
    }
}
