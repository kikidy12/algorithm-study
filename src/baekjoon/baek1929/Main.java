package baekjoon.baek1929;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        for (int i = min; i <= max; i++) {
            boolean isPrime = true;
            if (i == 1) {
                continue;
            }
            if (i == 2) {
                System.out.println(i);
                continue;
            }
            for (int j = 2; j <= (int)Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
