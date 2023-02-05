package baekjoon.baek1037;

import java.util.*;

public class back1037 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[0] * arr[arr.length - 1]);
    }
}
