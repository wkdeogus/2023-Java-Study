package weekTen;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Map<String, List<Integer>> scoresMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Count : ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            System.out.println("학생 이름 : ");
            String name = sc.next();
            List<Integer> scores = new ArrayList<>();
            for (int j = 1; j <= 3; j++) {
                System.out.println(name + "의" + j + "점수");
                int score = sc.nextInt();
                scores.add(score);
            }
            scoresMap.put(name, scores);
        }

        String highestAvgStudent = null;
        float highestAvg = 0.0f;

        for (String name : scoresMap.keySet()) {
            List<Integer> scores = scoresMap.get(name);
            int total = scores.get(0) + scores.get(1) + scores.get(2);
            float avg = total / 3.0f;

            if (avg > highestAvg) {
                highestAvg = avg;
                highestAvgStudent = name;
            }
        }

        if (highestAvgStudent != null) {
            System.out.println("평균이 가장 높은 학생:");
            System.out.println("이름: " + highestAvgStudent);
            List<Integer> scores = scoresMap.get(highestAvgStudent);
            System.out.println("첫 번째 점수: " + scores.get(0));
            System.out.println("두 번째 점수: " + scores.get(1));
            System.out.println("세 번째 점수: " + scores.get(2));
            int total = scores.get(0) + scores.get(1) + scores.get(2);
            System.out.println("총점: " + total);
            System.out.println("평균: " + highestAvg);
        } else {
            System.out.println("학생 정보가 없습니다.");
        }
    }
}
