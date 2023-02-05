package baekjoon.baek1010;


import java.util.Scanner;

public class Main {

    static int[][] temp = new int[30][30];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            System.out.println(Main.combine(M,N));
        }
    }

    static int combine(int n, int k) {
        if (temp[n][k] > 0) {
            return temp[n][k];
        }
        if(n == k || k == 0) {
            return temp[n][k] = 1;
        }
        return temp[n][k] = combine(n - 1, k - 1) + combine(n - 1, k);
    }
}