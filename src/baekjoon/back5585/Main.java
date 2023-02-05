package baekjoon.back5585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();

        int changes = 1000 - value;

        int count = 0;

        if (changes / 500 > 0) {
            count += changes / 500;
            changes %= 500;
        }
        if (changes / 100 > 0) {
            count += changes / 100;
            changes %= 100;
        }
        if (changes / 50 > 0) {
            count += changes / 50;
            changes %= 50;
        }
        if (changes / 10 > 0) {
            count += changes / 10;
            changes %= 10;
        }
        if (changes / 5 > 0) {
            count += changes / 5;
            changes %= 5;
        }
        count += changes;

        System.out.println(count);
    }
}
