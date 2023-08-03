package weekEleven;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SungjukTest {

    public static void main(String[] args) {

        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();   //선언및 대입

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

        for (int i = 0; i < n; i++) {
            HashMap<String, Object> personMap = list.get(i);
            System.out.println("name : " + personMap.get("name"));

            ArrayList<Integer> scores = (ArrayList<Integer>) personMap.get("score");
            System.out.println("국어 : " + scores.get(0));
            System.out.println("영어 : " + scores.get(1));
            System.out.println("수학 : " + scores.get(2));
            System.out.println("total : " + scores.get(3));
            System.out.println("average : " + personMap.get("avg"));
        }
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < n; i++) {
            HashMap<String, Object> personMap = list.get(i);

            // HashMap을 JSONObject로 변환
            JSONObject personJson = new JSONObject(personMap);

            // JSON 데이터를 배열에 추가
            jsonArray.put(personJson);
        }

        // 생성된 JSON 데이터를 텍스트 파일로 저장
        try (Writer writer = new FileWriter("C:/Temp/score.txt")) {
            writer.write(jsonArray.toString(2));
            System.out.println("JSON 데이터가 성공적으로 파일에 저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("JSON 데이터를 파일에 저장하는 데 실패했습니다.");
        }
    }
}

