package weekTen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SungjukTest {

    public static void main(String[] args) {

        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

        int n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Count : ");
        n = sc.nextInt();

        String name = "";
        ArrayList<Integer> score = null;
        int total = 0;
        int kor = 0;
        int eng = 0;
        int math = 0;
        double avg = 0.0;

        for (int i = 0; i < n; i++) {
            HashMap<String, Object> personMap = new HashMap<String, Object>();
            System.out.print("Name : ");
            name = sc.next();
            personMap.put("name", name);

            score = new ArrayList<Integer>();
            System.out.print("국어점수 : ");
            kor = sc.nextInt();
            score.add(kor);
            total += kor;
            System.out.print("영어점수 : ");
            eng = sc.nextInt();
            score.add(eng);
            total += eng;
            System.out.print("수학점수 : ");
            math = sc.nextInt();
            score.add(math);
            total += math;
            score.add(total);
            personMap.put("score", score);

            avg = total / 3.0f;
            personMap.put("avg", avg);

            list.add(personMap);
        }
        System.out.println("검색할 과목을 입력하세요. 0=국어 , 1=영어 , 2=수학");
        int input = sc.nextInt();
        int high = 0;
        for (int i = 0; i < n; i++) {
            HashMap<String, Object> personMap = list.get(i);
            System.out.println("name : " + personMap.get("name"));

            ArrayList<Integer> scores = (ArrayList<Integer>) personMap.get("score");

            if (((ArrayList<Integer>) (list.get(high).get("score"))).get(input) < ((ArrayList<Integer>) (list.get(i).get("score"))).get(input)) {
                high = i;
            }
            System.out.println("국어 : " + scores.get(0));
            System.out.println("영어 : " + scores.get(1));
            System.out.println("수학 : " + scores.get(2));
            System.out.println("total : " + scores.get(3));
            System.out.println("average : " + personMap.get("avg"));


        }

        System.out.println("입력한 과목의 최고득점자 : " + list.get(high).get("name"));


    }
}