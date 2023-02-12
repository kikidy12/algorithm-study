package programers.단계1.음양더하기;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{4,7,12}, new boolean[]{true,false,true}));
    }
}

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }

        return answer;
    }
}