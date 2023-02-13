package baekjoon.baek4948;

import java.util.Scanner;

public class back4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int count = 0;

            if (n == 1) {
                count = 1;
                System.out.println(count);
                continue;
            }

            for (int i = n+1; i <= n*2; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
