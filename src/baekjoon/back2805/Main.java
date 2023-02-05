package baekjoon.back2805;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int reqWood = sc.nextInt();

        long[] trees = new long[count];
        long max = Long.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            trees[i] = sc.nextInt();
            max = Math.max(trees[i], max);
        }

        long start = 0;
        long last =max;

        while(start<=last){
            long mid = (start+last)/2;
            long result=0;

            for(int i=0;i<count;i++){
                if(trees[i]>mid) {
                    result += trees[i] - mid;
                }
            }

            if(result>=reqWood){
                start = mid+1;
            }
            else{
                last = mid-1;
            }
        }




        System.out.println(last);
    }
}
