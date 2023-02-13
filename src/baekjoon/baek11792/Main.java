package baekjoon.baek11792;

import java.util.Scanner;

public class Main {
    private static final StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        int n = sc.nextInt();

        System.out.println((int)Math.pow(2, n) - 1);
        main.hanoi(n, 1, 3, 2);
        System.out.println(output);
    }

    void hanoi(int number, int start, int to, int via) {
        if (number == 1) {
            move(number, start, to);
            return;
        }
        hanoi(number - 1, start, via, to);
        move(number, start, to);
        hanoi(number - 1, via, to, start);
    }

    void move(int number, int start , int to) {
        output.append(start + " " + to + "\n");
    }

}
