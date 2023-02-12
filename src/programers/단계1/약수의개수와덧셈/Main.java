package programers.단계1.약수의개수와덧셈;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(13, 17));
    }
}
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            else {
                answer += i;
            }
        }

        return answer;
    }
}