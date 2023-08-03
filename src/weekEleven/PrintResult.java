package weekEleven;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class PrintResult {

    public void print(ArrayList<BaseballGame> gameList) {
        JSONArray jsonArray = new JSONArray();

        for (BaseballGame game : gameList) {
            JSONObject gameJson = new JSONObject();

            JSONArray caseInfoArray = new JSONArray();
            for (CaseInfo caseInfo : game.caseList) {
                JSONObject caseJson = new JSONObject();
                caseJson.put("result", caseInfo.getResultText());
                caseJson.put("chanceNo", caseInfo.getCaseNo());
                caseJson.put("userInput", caseInfo.getUser_input());
                caseInfoArray.put(caseJson);
            }

            gameJson.put("CaseInfo", caseInfoArray);
            gameJson.put("RandNumber", game.rand_num);
            gameJson.put("ChanceCount", game.chanceCount);
            gameJson.put("Clear", game.clear);

            jsonArray.put(gameJson);
        }

        try (Writer writer = new FileWriter("C:/Temp/game.log")) {
            writer.write(jsonArray.toString(2)); // 들여쓰기 레벨을 2로 지정하여 보기 좋게 저장
            System.out.println("게임 결과가 성공적으로 파일에 저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("게임 결과를 파일에 저장하는 데 실패했습니다.");
        }
    }
}