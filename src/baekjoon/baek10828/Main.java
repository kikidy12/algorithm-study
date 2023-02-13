package baekjoon.baek10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < count; i++) {
            String order = bufferedReader.readLine();

            if (order.contains("push")) {
                stack.push(order.split(" ")[1]);
            } else if (order.contains("top")) {
                System.out.println(stack.isEmpty() ? "-1" : stack.peek());
            }  else if (order.contains("size")) {
                System.out.println(stack.size());
            }  else if (order.contains("empty")) {
                System.out.println(stack.isEmpty() ? "1" : "0");
            }  else if (order.contains("pop")) {
                System.out.println(stack.isEmpty() ? "-1" : stack.pop());
            }
        }
    }
}
