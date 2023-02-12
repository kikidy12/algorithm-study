package programers.단계1.최소직사각형;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }
}

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int wMax = 0;
        int hMax = 0;

        for (int i = 0 ; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if (wMax < sizes[i][0]) {
                wMax = sizes[i][0];
            }
            if (hMax < sizes[i][1]) {
                hMax = sizes[i][1];
            }
        }

        answer = wMax * hMax;
        
        return answer;
    }
}