package baekjoon.baek8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        String[] inputArr = new String[count];

        for (int i = 0; i < count; i++) {
            inputArr[i] = sc.next();
        }

        for (String s : inputArr) {
            int temp = 0;
            int sum = 0;
            String[] arr = s.split("");
            for (String s1 : arr) {
                if (s1.equals("O")) {
                    temp++;
                    sum += temp;
                }
                if (s1.equals("X")) {
                    temp = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
