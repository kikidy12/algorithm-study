package baekjoon.baek1874;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        List<Integer> list = new ArrayList<>();

        List<String> orders = new ArrayList<>();

        int lastValue = 1;

        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();

            for (int j = lastValue; j <= num; j++) {
                stack.push(j);
                orders.add("+");
                lastValue++;
            }
            while (!stack.isEmpty()) {
                int temp = stack.pop();
                orders.add("-");
                if (num == temp) {
                    list.add(num);
                    break;
                }
            }
        }

        if (count != list.size()) {
            System.out.println("NO");
        }
        else {
            for (String order : orders) {
                System.out.println(order);
            }
        }
    }
}
