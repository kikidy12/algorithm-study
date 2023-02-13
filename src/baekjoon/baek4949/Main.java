package baekjoon.baek4949;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            if (str.equals(".")) {
                break;
            }

            String[] arr = str.replaceAll("[^()\\[\\]]","").split("");

            if (arr.length == 0) {
                System.out.println("YES");
                sc.close();
                continue;
            }

            Stack<String> stack = new Stack<>();

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i].equals(")")) {
                    stack.add(")");
                }
                if (arr[i].equals("(")) {
                    if (stack.isEmpty() || !stack.peek().equals(")")) {
                        stack.add("fail");
                        break;
                    }
                    stack.pop();
                }
                if (arr[i].equals("]")) {
                    stack.add("]");
                }
                if (arr[i].equals("[")) {
                    if (stack.isEmpty() || !stack.peek().equals("]")) {
                        stack.add("fail");
                        break;
                    }
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
