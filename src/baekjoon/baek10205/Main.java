package baekjoon.baek10205;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int count = Integer.parseInt(br.readLine());
        String[] inputArr = new String[count];

        for(int i=0; i < inputArr.length; i++) {
            inputArr[i] = br.readLine();
        }

        br.close();

        for (String s : inputArr) {
            String[] arr = s.split(" ");

            int floor = Integer.parseInt(arr[0]);
            int customNum = Integer.parseInt(arr[2]);

            int h = customNum%floor == 0 ? floor : customNum%floor;
            int w = customNum%floor == 0 ? customNum/floor : customNum/floor+1;

            String temp = "" + h;

            temp += w < 10 ? "0" + w : w;

            System.out.println(Integer.parseInt(temp));
        }
    }
}
