package hanghaeAlgorithmExam.exam3;

import java.util.Arrays;

public class Main {
    public void solution(int num, char[][] arrs) {

        int[][] boomArr = new int[num][num];
        char[][] printArr = new char[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (arrs[i][j] >= '1' && arrs[i][j] <= '9') {
                    int count = Character.getNumericValue(arrs[i][j]);
                    if (i == 0 && j == 0) {
                        boomArr[i][j+1] += count;
                        boomArr[i+1][j] += count;
                        boomArr[i+1][j+1] += count;
                    }
                    else if (i == 0 && j == num - 1) {
                        boomArr[i][j-1] += count;
                        boomArr[i+1][j-1] += count;
                        boomArr[i+1][j] += count;
                    }
                    else if (i == num -1 && j == 0) {
                        boomArr[i-1][j] += count;
                        boomArr[i-1][j+1] += count;
                        boomArr[i][j+1] += count;
                    }
                    else if (i == num - 1 && j == num - 1) {
                        boomArr[i-1][j-1] += count;
                        boomArr[i-1][j] += count;
                        boomArr[i][j-1] += count;
                    }
                    else if (i == 0) {
                        boomArr[i][j-1] += count;
                        boomArr[i][j+1] += count;
                        boomArr[i+1][j-1] += count;
                        boomArr[i+1][j] += count;
                        boomArr[i+1][j+1] += count;

                    }
                    else if (i == num - 1) {
                        boomArr[i-1][j-1] += count;
                        boomArr[i-1][j] += count;
                        boomArr[i-1][j+1] += count;
                        boomArr[i][j-1] += count;
                        boomArr[i][j+1] += count;

                    }
                    else if (j == 0) {
                        boomArr[i-1][j] += count;
                        boomArr[i-1][j+1] += count;
                        boomArr[i][j+1] += count;
                        boomArr[i+1][j] += count;
                        boomArr[i+1][j+1] += count;

                    }
                    else if (j == num - 1) {
                        boomArr[i-1][j-1] += count;
                        boomArr[i-1][j] += count;
                        boomArr[i][j-1] += count;
                        boomArr[i+1][j-1] += count;
                        boomArr[i+1][j] += count;

                    }
                    else {
                        boomArr[i-1][j-1] += count;
                        boomArr[i-1][j] += count;
                        boomArr[i-1][j+1] += count;
                        boomArr[i][j-1] += count;
                        boomArr[i][j+1] += count;
                        boomArr[i+1][j-1] += count;
                        boomArr[i+1][j] += count;
                        boomArr[i+1][j+1] += count;
                    }
                }
            }
        }


        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (boomArr[i][j] == 0) {
                    printArr[i][j] = '0';
                }
                else if (boomArr[i][j] >= 10) {
                    printArr[i][j] = 'M';
                }
                else if (boomArr[i][j] >= 1 ) {
                    printArr[i][j] = (char)(boomArr[i][j] + '0');
                }

                if (arrs[i][j] >= '1' && arrs[i][j] <= '9') {
                    printArr[i][j] = '*';
                }
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println(Arrays.toString(printArr[i]));
        }
    }

    // [*, M, 9, 9],
    // [5, M, *, M],
    // [7, *, M, *],
    // [7, *, 9, 2]

    // [*, 4, 3, 3, 0]
    // [1, 4, *, 3, 0]
    // [4, 7, 7, 3, 0]
    // [4, *, M. 9, 9]
    // [4, 4, M. *, 9]

    public static void main(String[] args) {
        Main method = new Main();
        int num = 5;
        char[][] chars= {{'1', '.', '.', '.', '.'},
                {'.', '.', '3', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '4', '.', '.', '.'},
                {'.', '.', '.', '9', '.'}};
//        int num = 4;
//        char[][] chars = {{'2', '.', '.', '.',},
//                {'.', '.', '9', '.'},
//                {'.', '3', '.', '2'},
//                {'.', '4', '.', '.'}};
        method.solution(num, chars);
    }
}