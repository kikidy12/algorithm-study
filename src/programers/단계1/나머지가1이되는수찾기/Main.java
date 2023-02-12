package programers.단계1.나머지가1이되는수찾기;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(10));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}