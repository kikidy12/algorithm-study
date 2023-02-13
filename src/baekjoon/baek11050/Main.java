package baekjoon.baek11050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(Main.getCombine(n,k));
    }

    static int getCombine(int n, int k) {
        if(n == k || k == 0) {
            return 1;
        }
        return getCombine(n-1, k-1) + getCombine(n-1,k);
    }
}
