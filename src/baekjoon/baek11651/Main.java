package baekjoon.baek11651;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[][] arr = new int[count][2];


        for (int i = 0; i < arr.length; i++) {
            String str = br.readLine();
            arr[i][0] = Integer.parseInt(str.split(" ")[0]);
            arr[i][1] = Integer.parseInt(str.split(" ")[1]);
        }

        br.close();

        Arrays.sort(arr, (a, b) -> {
            if (a[1] < b[1]) {
                return -1;
            }
            else if (a[1] == b[1] && a[0] < b[0]) {
                return -1;
            }
            else if (a[0] == b[0] && a[1] == b[1]) {
                return 0;
            }
            else {
                return 1;
            }
        });

        for (int[] ints : arr) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }
}
