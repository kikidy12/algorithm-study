package baekjoon.baek1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        int count = Integer.parseInt(bufferedReader.readLine());

        Stack<String> stack = new Stack<>();

        for (String s1 : s.split("")) {
            stack.push(s1);
        }

        Stack<String> stack1 = new Stack<>();

        for (int i = 0; i < count; i++) {
            String s1 = bufferedReader.readLine();
            if (s1.contains("L") && !stack.isEmpty()) {
                stack1.push(stack.pop());
            }
            else if (s1.contains("D") && !stack1.isEmpty()) {
                stack.push(stack1.pop());
            }
            else if (s1.contains("B") && !stack.isEmpty()) {
                stack.pop();
            }
            else if (s1.contains("P")) {
                stack.push(s1.split(" ")[1]);
            }
        }

        while (!stack1.isEmpty()) {
            stack.push(stack1.pop());
        }

        System.out.println(String.join("", stack));
    }
}
