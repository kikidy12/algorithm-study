package programers.단계1.로또의최고순위와최저순위;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
    }
}


class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int zeroCount = 0;
        int matchCount = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    matchCount++;
                    break;
                }
            }
        }

        answer[0] = matchCount + zeroCount == 0 ? 6 : 7 - (matchCount + zeroCount);
        answer[1] = matchCount == 0 ? 6 : 7 - matchCount;

        return answer;
    }
}