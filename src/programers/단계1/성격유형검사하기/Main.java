package programers.단계1.성격유형검사하기;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5}));
    }
}

class Solution {
    public String solution(String[] survey, int[] choices) {

        Map<String, Integer> map = new HashMap<>();
        map.put("R",0);
        map.put("A",0);
        map.put("C",0);
        map.put("M",0);
        map.put("T",0);
        map.put("F",0);
        map.put("J",0);
        map.put("N",0);
        String answer = "";

        for (int i = 0; i < survey.length; i++) {
            String key1 = survey[i].substring(0,1);
            String key2 = survey[i].substring(1,2);
            int score = choices[i];
            if (score > 4) {
                map.put(key2, map.get(key2) + Math.abs(4 - score));
            }
            else if (score < 4) {
                map.put(key1, map.get(key1) + Math.abs(4 - score));
            }
        }

        if (map.get("R") >= map.get("T")) {
            answer += "R";
        }
        else {
            answer += "T";
        }

        if (map.get("C") >= map.get("F")) {
            answer += "C";
        }
        else {
            answer += "F";
        }

        if (map.get("J") >= map.get("M")) {
            answer += "J";
        }
        else {
            answer += "M";
        }

        if (map.get("A") >= map.get("N")) {
            answer += "A";
        }
        else {
            answer += "N";
        }

        System.out.println(map);

        return answer;
    }
}