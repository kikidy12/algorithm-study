package baekjoon.baek2609;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int min = Math.min(num1, num2);

        int gcd = 1;
        int lcm = num1 * num2;

        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        lcm = num1 / gcd * num2;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
