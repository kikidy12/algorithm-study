package baekjoon.baek1436;

import java.util.Scanner;

public class back1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int number = 0;
        while (n != count) {
            number++;
            if (("" + number).contains("666")) {
                count++;
            }
        }

        System.out.println(number);
    }
}
