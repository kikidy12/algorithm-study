package baekjoon.baek1934;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[][] inputArr = new int[count][2];

        for (int i = 0; i < count; i++) {
            inputArr[i][0] = sc.nextInt();
            inputArr[i][1] = sc.nextInt();
        }

        for (int[] line : inputArr) {
            int gcd = 1;
            int lcm = 0;
            for (int i = 2; i <= Math.min(line[0],line[1]); i++) {
                if (line[0] % i == 0 && line[1] % i == 0) {
                    gcd = i;
                }
            }
            lcm = line[0] * line[1] / gcd;

            System.out.println(lcm);
        }
    }
}
