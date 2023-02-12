package programers.단계1.부족한금액계산하기;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(3, 20, 4));
    }
}

class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;

        for (int i = 1; i <= count; i++) {
            answer -= (long) price * i;
        }

        answer = answer >= 0 ? 0 : -answer;

        return answer;
    }
}