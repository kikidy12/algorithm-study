package baekjoon.baek9093;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");

            for (int j = 0; j < arr.length; j++) {
                StringBuilder sb = new StringBuilder(arr[j]);
                arr[j] = sb.reverse().toString();
            }

            System.out.println(String.join(" ", arr));
        }
    }
}
